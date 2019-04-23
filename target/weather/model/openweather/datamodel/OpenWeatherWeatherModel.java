package main.webapp.model.openweather.datamodel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class OpenWeatherWeatherModel implements Serializable {
    @SerializedName("list")
    private ArrayList<OpenWeatherForecastDay> openWeatherForecastDays = new ArrayList<>();
    @SerializedName("city")
    private City city;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public ArrayList<OpenWeatherForecastDay> getOpenWeatherForecastDays() {
        return openWeatherForecastDays;
    }

    public void setOpenWeatherForecastDays(ArrayList<OpenWeatherForecastDay> openWeatherForecastDays) {
        this.openWeatherForecastDays = openWeatherForecastDays;
    }
}
