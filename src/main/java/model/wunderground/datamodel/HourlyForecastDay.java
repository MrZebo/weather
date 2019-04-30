package model.wunderground.datamodel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class HourlyForecastDay implements Serializable {
    @SerializedName("FCTTIME")
    private FctTime fctTime;
    @SerializedName("temp")
    private Temp temp;
    @SerializedName("condition")
    private String condition;
    @SerializedName("icon")
    private String icon;
    @SerializedName("icon_url")
    private String icon_url;
    @SerializedName("fctcode")
    private String fctcode;
    @SerializedName("sky")
    private String sky;
    @SerializedName("humidity")
    private String humidity;
    @SerializedName("pop")
    private String pop;
    private String simpleDate;

    public String getSimpleDate() {
        return getFctTime().getHour() + ":" + getFctTime().getMin() + " " + getFctTime().getYear() + "-" + getFctTime().getMon_padded() + "-" + getFctTime().getMday_padded();
    }

    public FctTime getFctTime() {
        return fctTime;
    }

    public void setFctTime(FctTime fctTime) {
        this.fctTime = fctTime;
    }

    public Temp getTemp() {
        return temp;
    }

    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon_url() {
        return icon_url;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public String getFctcode() {
        return fctcode;
    }

    public void setFctcode(String fctcode) {
        this.fctcode = fctcode;
    }

    public String getSky() {
        return sky;
    }

    public void setSky(String sky) {
        this.sky = sky;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPop() {
        return pop;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }
}
