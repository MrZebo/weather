package main.webapp.model.wunderground.datamodel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class SimpleForecast implements Serializable {
    private static final long serialVersionUID = 1L;
    @SerializedName("forecastday")
    private List<SimpleForecastDay> simpleForecastDays;

    public List<SimpleForecastDay> getSimpleForecastDays() {
        return simpleForecastDays;
    }

    public void setSimpleForecastDays(List<SimpleForecastDay> simpleForecastDays) {
        this.simpleForecastDays = simpleForecastDays;
    }
}
