package model.openweather.datamodel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class OpenWeatherForecastDay implements Serializable {
    @SerializedName("dt")
    private String dt;
    @SerializedName("main")
    private WeatherData data = new WeatherData();
    @SerializedName("weather")
    private ArrayList<Condition> conditions = new ArrayList<>();
    @SerializedName("clouds")
    private Clouds clouds = new Clouds();
    @SerializedName("wind")
    private Wind wind = new Wind();
    @SerializedName("snow")
    private Snow snow = new Snow();
    @SerializedName("sys")
    private Astro astro = new Astro();
    @SerializedName("dt_txt")
    private String dt_txt;

    private int celsiumTemp;

    public int getCelsiumTemp() {
        return (int) (data.getTemp() - 273.15);
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public WeatherData getData() {
        return data;
    }

    public void setData(WeatherData data) {
        this.data = data;
    }

    public Condition getConditions() {
        return conditions.get(0);
    }

    public void setConditions(ArrayList<Condition> conditions) {
        this.conditions = conditions;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Snow getSnow() {
        return snow;
    }

    public void setSnow(Snow snow) {
        this.snow = snow;
    }

    public Astro getAstro() {
        return astro;
    }

    public void setAstro(Astro astro) {
        this.astro = astro;
    }

    public String getDt_txt() {
        return dt_txt;
    }

    public void setDt_txt(String dt_txt) {
        this.dt_txt = dt_txt;
    }
}
