package model.apixu.datamodel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class Forecast implements Serializable {

    private static final long serialVersionUID = 1L;

    @SerializedName("forecastday")
    public ArrayList<APIxuForecastDay> forecastday = new ArrayList<APIxuForecastDay>();

    public ArrayList<APIxuForecastDay> getForecastDay()
    {
        return forecastday;
    }
    public void setForecastday(ArrayList<APIxuForecastDay> mForecastday)
    {
        this.forecastday = mForecastday;
    }


}