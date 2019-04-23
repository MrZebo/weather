package main.webapp.model.meteopost;

import java.util.LinkedList;
import java.util.List;

public class MeteoPostDailyForecast {
    private String dayOfWeek;
    public String timesOfDay;
    private int date;
    public String temperature;
    public String precipitation; // осадки
    private String humidity; //влажность
    private String visibility; //видимость
    private String pressure;  //давление
    private String windSpeed;
    private List<MeteoPostDailyForecast> forecastList;
    private Months month;

    public MeteoPostDailyForecast(String month, int date, String dayOfWeek) {
        setMonths(month);
        this.date = date;
        this.dayOfWeek = dayOfWeek;
        forecastList = new LinkedList<>();
    }

    public MeteoPostDailyForecast(String timesOfDay, String temperature, String precipitation, String humidity, String visibility, String pressure, String windSpeed) {
        this.timesOfDay = timesOfDay;
        this.temperature = temperature;
        this.precipitation = precipitation;
        this.humidity = humidity;
        this.visibility = visibility;
        this.pressure = pressure;
        this.windSpeed = windSpeed;
    }
    public void addForecastList(MeteoPostDailyForecast forecast){
        forecastList.add(forecast);
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public int getDate() {
        return date;
    }

    public List<MeteoPostDailyForecast> getForecastList() {
        return forecastList;
    }

    public Months getMonth() {
        return month;
    }

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

    public String getTimesOfDay() {
        return timesOfDay;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getPrecipitation() {
        return precipitation;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getVisibility() {
        return visibility;
    }

    public String getPressure() {
        return pressure;
    }

    public String getWindSpeed() {
        return windSpeed;
    }
}
