package model.openweather.datamodel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class Forecast implements Serializable {
    @SerializedName("list")
    private ArrayList<OpenWeatherForecastDay> openWeatherForecastDays = new ArrayList<>();

    public ArrayList<OpenWeatherForecastDay> getOpenWeatherForecastDays() {
        return openWeatherForecastDays;
    }

    public void setOpenWeatherForecastDays(ArrayList<OpenWeatherForecastDay> openWeatherForecastDays) {
        this.openWeatherForecastDays = openWeatherForecastDays;
    }
}
