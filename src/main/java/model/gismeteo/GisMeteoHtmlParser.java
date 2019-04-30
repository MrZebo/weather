package model.gismeteo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.*;

public class GisMeteoHtmlParser {
    private List<GisMeteoDailyForecast> forecasts;

    public GisMeteoHtmlParser() {
        forecasts = new ArrayList<>();
    }

    private Elements getElement() {
        Document document = null;
        try {
            document = Jsoup.connect("https://www.gismeteo.ua/weather-dnipro-5077/14-days/").userAgent("Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.154 Safari/537.36").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elements element = document.select("table");
        return element;
    }

    private boolean isDaysOfWeek(String s) {
        s = s.replaceAll(",", "");
        for (DaysOfWeek daysOfWeek : DaysOfWeek.values()) {
            if (s.equals(daysOfWeek.name())) return true;
        }
        return false;
    }

    public List<GisMeteoDailyForecast> getForecasts() {
        List<String> strings = getStringList();
        for (String s : strings) {
            forecasts.add(creator(s));
        }


        return forecasts;
    }

    private GisMeteoDailyForecast creator(String s) {
        String[] arr = s.split(" ");
        GisMeteoDailyForecast forecast = null;
        switch (arr.length) {
            case 6:
                forecast = new GisMeteoDailyForecast(arr[0], arr[1], arr[2], arr[3].substring(0, arr[3].lastIndexOf("+")), arr[4], arr[5].substring(0, arr[5].lastIndexOf("+")));
                break;
            case 7:
                forecast = new GisMeteoDailyForecast(arr[0], arr[1], arr[2], arr[3].substring(0, arr[3].lastIndexOf("+")), arr[4] + arr[5],  arr[6].substring(0, arr[6].lastIndexOf("+")));
                break;
            case 8:
                forecast = new GisMeteoDailyForecast(arr[0], arr[1], arr[2],  arr[3].substring(0, arr[3].lastIndexOf("+")), arr[4] + arr[5] + " " + arr[6], arr[7].substring(0,arr[7].lastIndexOf("+")));
                break;
            case 9:
                forecast = new GisMeteoDailyForecast(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
                break;
            case 10:
                forecast = new GisMeteoDailyForecast(arr[0], arr[1], arr[2] + arr[3] + " " + arr[4], arr[5].substring(0, arr[5].lastIndexOf("+")), arr[6] + arr[7] + " " + arr[8], arr[9].substring(0, arr[9].lastIndexOf("+")));
                break;
        }
        return forecast;
    }

    public List<String> getStringList() {
        String[] arr = getElement().text().split(" ");
        StringBuilder builder = new StringBuilder();
        LinkedList<String> strings = new LinkedList<>();
        boolean can = false;
        for (String s : arr) {
            if (isDaysOfWeek(s)) {
                if (can) {
                    strings.add(builder.toString());
                    builder = new StringBuilder();
                    can = false;
                    continue;
                }
                if (!can) {
                    builder.append(s).append(" ");
                    can = true;
                    continue;
                }
            }
            if (can) {
                builder.append(s).append(" ");

            }
        }

        return strings;
    }
}
