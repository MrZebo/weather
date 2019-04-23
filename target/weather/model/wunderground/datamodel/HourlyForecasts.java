package main.webapp.model.wunderground.datamodel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class HourlyForecasts implements Serializable {
    @SerializedName("hourly_forecast")
    private List<HourlyForecastDay> hourlyForecastDayList;

    public List<HourlyForecastDay> getHourlyForecastDayList() {
        return hourlyForecastDayList;
    }

    public void setHourlyForecastDayList(List<HourlyForecastDay> hourlyForecastDayList) {
        this.hourlyForecastDayList = hourlyForecastDayList;
    }
}
