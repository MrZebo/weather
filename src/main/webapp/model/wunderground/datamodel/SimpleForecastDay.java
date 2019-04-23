package main.webapp.model.wunderground.datamodel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class SimpleForecastDay implements Serializable {
    private static final long serialVersionUID = 1L;
    @SerializedName("date")
    public Date date;
    @SerializedName("high")
    private High high;
    @SerializedName("low")
    private Low low;
    @SerializedName("conditions")
    private String conditions;
    @SerializedName("icon")
    private String icon;
    @SerializedName("icon_url")
    private String icon_url;
    @SerializedName("skyicon")
    private String skyicon;
    @SerializedName("pop")
    private int pop;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public High getHigh() {
        return high;
    }

    public void setHigh(High high) {
        this.high = high;
    }

    public Low getLow() {
        return low;
    }

    public void setLow(Low low) {
        this.low = low;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
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

    public String getSkyicon() {
        return skyicon;
    }

    public void setSkyicon(String skyicon) {
        this.skyicon = skyicon;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }
}
