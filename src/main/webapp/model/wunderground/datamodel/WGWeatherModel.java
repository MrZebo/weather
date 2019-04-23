package main.webapp.model.wunderground.datamodel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class WGWeatherModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @SerializedName("forecast")
    private Forecast forecast;

    @SerializedName("hourly_forecast")
    private List<HourlyForecastDay> hourlyForecasts;

    public List<HourlyForecastDay> getHourlyForecasts() {
        return hourlyForecasts;
    }

    public void setHourlyForecasts(List<HourlyForecastDay> hourlyForecasts) {
        this.hourlyForecasts = hourlyForecasts;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }
}
