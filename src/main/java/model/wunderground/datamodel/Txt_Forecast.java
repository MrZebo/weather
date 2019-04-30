package model.wunderground.datamodel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Txt_Forecast implements Serializable {
    private static final long serialVersionUID = 1L;
    @SerializedName("date")
    public String date;
    @SerializedName("forecastday")
    private List<Txt_ForecastDay> txtForecastDayList;


    public List<Txt_ForecastDay> getTxtForecastDayList() {
        return txtForecastDayList;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTxtForecastDayList(List<Txt_ForecastDay> txtForecastDayList) {
        this.txtForecastDayList = txtForecastDayList;
    }

}
