package model.wunderground.datamodel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Forecast implements Serializable {
    private static final long serialVersionUID = 1L;
    @SerializedName("txt_forecast")
    private Txt_Forecast txt_forecast;
    @SerializedName("simpleforecast")
    private SimpleForecast simpleForecast;

    public Txt_Forecast getTxt_forecast() {
        return txt_forecast;
    }

    public void setTxt_forecast(Txt_Forecast txt_forecast) {
        this.txt_forecast = txt_forecast;
    }

    public SimpleForecast getSimpleForecast() {
        return simpleForecast;
    }

    public void setSimpleForecast(SimpleForecast simpleForecast) {
        this.simpleForecast = simpleForecast;
    }



}
