package model.gismeteo;

public class GisMeteoDailyForecast {
    private String dayOfWeak;
    private String date;
    private String nightCloudy;
    private String dayCloudy;
    private String nightTemperature;
    private String dayTemperature;

    public GisMeteoDailyForecast(String dayOfWeak, String date, String nightCloudy, String nightTemperature, String dayCloudy, String dayTemperature) {
        this.dayOfWeak = dayOfWeak;
        this.date = date;
        this.nightCloudy = nightCloudy;
        this.dayCloudy = dayCloudy;
        this.nightTemperature = nightTemperature;
        this.dayTemperature = dayTemperature;
    }

    public String getDayOfWeak() {
        return dayOfWeak;
    }

    public void setDayOfWeak(String dayOfWeak) {
        this.dayOfWeak = dayOfWeak;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNightCloudy() {
        return nightCloudy;
    }

    public void setNightCloudy(String nightCloudy) {
        this.nightCloudy = nightCloudy;
    }

    public String getDayCloudy() {
        return dayCloudy;
    }

    public void setDayCloudy(String dayCloudy) {
        this.dayCloudy = dayCloudy;
    }

    public String getNightTemperature() {
        return nightTemperature;
    }

    public void setNightTemperature(String nightTemperature) {
        this.nightTemperature = nightTemperature;
    }

    public String getDayTemperature() {
        return dayTemperature;
    }

    public void setDayTemperature(String dayTemperature) {
        this.dayTemperature = dayTemperature;
    }
}
