package model.meteopost;

import java.util.LinkedList;
import java.util.List;

public class MeteoPostWeatherModel {
    private Months month;
    public List<MeteoPostDailyForecast> meteoPostDailyForecastList;
    private int date;//дата
    private String dayOfWeek;


    public void setMonths(Months month) {
        this.month = month;
    }

    private void setMonths(String month) {
        switch (Months.valueOf(month)) {
            case ЯНВАРЬ:
                setMonths(Months.ЯНВАРЬ);
                break;
            case ФЕВРАЛЬ:
                setMonths(Months.ФЕВРАЛЬ);
                break;
            case МАРТ:
                setMonths(Months.МАРТ);
                break;
            case АПРЕЛЬ:
                setMonths(Months.АПРЕЛЬ);
                break;
            case МАЙ:
                setMonths(Months.МАЙ);
                break;
            case ИЮНЬ:
                setMonths(Months.ИЮНЬ);
                break;
            case ИЮЛЬ:
                setMonths(Months.ИЮЛЬ);
                break;
            case АВГУСТ:
                setMonths(Months.АВГУСТ);
                break;
            case СЕНТЯБРЬ:
                setMonths(Months.СЕНТЯБРЬ);
                break;
            case НОЯБРЬ:
                setMonths(Months.НОЯБРЬ);
                break;
            case ОКТЯБРЬ:
                setMonths(Months.ОКТЯБРЬ);
                break;
            case ДЕКАБРЬ:
                setMonths(Months.ДЕКАБРЬ);
                break;
        }
    }

    public MeteoPostWeatherModel(String month, int date, String dayOfWeek) {
        setMonths(month);
        this.date = date;
        this.dayOfWeek = dayOfWeek;
        meteoPostDailyForecastList = new LinkedList<>();
    }

    public List<MeteoPostDailyForecast> getMeteoPostDailyForecastList() {
        return meteoPostDailyForecastList;
    }

    public Months getMonth() {
        return month;
    }

    public int getDate() {
        return date;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }
}
