package model.meteopost;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.*;
//import java.time.LocalDate;
import java.util.*;

public class MeteoPostHtmlParser {

    public MeteoPostHtmlParser() {
    }

    private File getFile() {
//        LocalDate date = LocalDate.now();
        Date date = new Date();
        File file = new File("D://meteopost//" + date + ".txt");
        if (file.exists()) {
            file.delete();
        }
        return file;
    }

    private Elements getElement() {
        Document document = null;
        try {
            document = Jsoup.connect("http://meteopost.com/city/5688/").userAgent("Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.154 Safari/537.36").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elements element = document.select("table");
        return element;
    }


    private void writeForecastToFile(StringBuilder text) {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new PrintStream(getFile()))); BufferedReader reader = new BufferedReader(new StringReader(text.toString()))) {
            while (reader.ready()) {
                String s = reader.readLine();
                if (s == null) break;
                writer.append(s).append("\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<MeteoPostDailyForecast> getWeatherModels() {
        List<String> strings = new LinkedList<>(getStringsSet());
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == 0) {
                strings.remove(i);
            }
//            strings.set(i, strings.get(i).substring(0, strings.get(i).lastIndexOf("см")));
        }
        String[] work = null;
        StringBuilder time = new StringBuilder();
        for (String s : strings) {
            work = s.split(" ");
            for (String s1 : work) {
                for (Months months : Months.values()) {
                    if (s1.equals(months.name())) {
                        time.append(System.lineSeparator());
                    }
                }
                if (s1.matches("[0-9]?[0-9]:00")) {
                    time.append(System.lineSeparator());
                }
                for (TimesOfDay timesOfDay : TimesOfDay.values()) {
                    if (s1.equals(timesOfDay.name().toLowerCase())) {
                        time.append(System.lineSeparator());
                    }
                }
                time.append(s1).append(" ");

            }
        }
//        writeForecastToFile(time);

        return listCreator(time.toString());
    }

    private List<MeteoPostDailyForecast> listCreator(String array) {
        List<MeteoPostDailyForecast> meteoPostDailyForecastList = new LinkedList<>();
        String[] workString = array.split("\n");
        MeteoPostDailyForecast forecast = null;
        for (String s : workString) {
            String[] split = s.split(" ");
            if (split.length > 1 && split != null) {
                if (isMonth(split) || isTimeOrTimesOfDay(split)) {
                    if (isMonth(split)) {
                        forecast = new MeteoPostDailyForecast(split[0], Integer.parseInt(split[1]), split[2]);
                    }
                    if (isTimeOrTimesOfDay(split)) {
                        if (forecast != null) {
                            forecast.addForecastList(new MeteoPostDailyForecast(split[0], split[1], split[2], split[3], split[4], split[5], split[6]));
                            if(!meteoPostDailyForecastList.contains(forecast)){
                                meteoPostDailyForecastList.add(forecast);
                            }
                        }
                    }
                }
            }
        }
        return meteoPostDailyForecastList;
    }

    private boolean isMonth(String[] array) {
        for (Months months : Months.values()) {
            if (array[0].equalsIgnoreCase(months.name())) return true;
        }
        return false;
    }

    private boolean isMonth(String string) {
        for (Months months : Months.values()) {
            if (string.equalsIgnoreCase(months.name())) return true;
        }
        return false;
    }

    private boolean isTimeOrTimesOfDay(String[] array) {
        String[] times = {"0:00", "3:00", "6:00", "9:00", "12:00", "15:00", "18:00", "21:00"};
        for (TimesOfDay timesOfDay : TimesOfDay.values()) {
            if (array[0].equalsIgnoreCase(timesOfDay.name())) return true;
        }
        for (String time : times) {
            if (array[0].equals(time)) return true;
        }
        return false;
    }

    private boolean isTimeOrTimesOfDay(String string) {
        String[] times = {"0:00", "3:00", "6:00", "9:00", "12:00", "15:00", "18:00", "21:00"};
        for (TimesOfDay timesOfDay : TimesOfDay.values()) {
            if (string.equalsIgnoreCase(timesOfDay.name())) return true;
        }
        for (String time : times) {
            if (string.equals(time)) return true;
        }
        return false;
    }

    private Set<String> getStringsSet() {
        boolean flag = false;
        Set<String> strings = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();
        String[] arr = getElement().text().split(" ");
        for (String s : arr) {
            if (isTimeOrTimesOfDay(s)) result.append("\n");
            if(s.equals("рассчитан"))break;
            if (isMonth(s)) {
                if (flag) {
                    result.append("\n");
                }
                flag = true;
                strings.add(result.toString());
                result = new StringBuilder();
            }
            if (flag) result.append(s).append(" ");

        }
        return strings;
    }
}
