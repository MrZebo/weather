package model.wunderground.datamodel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Txt_ForecastDay implements Serializable {
    private static final long serialVersionUID = 1L;
    @SerializedName("period")
    private String period;
    @SerializedName("icon")
    private String icon;
    @SerializedName("icon_url")
    private String icon_url;
    @SerializedName("title")
    private String title;
    @SerializedName("fct_text")
    private String fct_text;
    @SerializedName("fcttext_metric")
    private String fcttext_metric;
    @SerializedName("pop")
    private String pop;

    public String getPeriod() {
        return period;
    }

    public String getIcon() {
        return icon;
    }

    public String getIcon_url() {
        return icon_url;
    }

    public String getTitle() {
        return title;
    }

    public String getFct_text() {
        return fct_text;
    }

    public String getFcttext_metric() {
        return fcttext_metric;
    }

    public String getPop() {
        return pop;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFct_text(String fct_text) {
        this.fct_text = fct_text;
    }

    public void setFcttext_metric(String fcttext_metric) {
        this.fcttext_metric = fcttext_metric;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }
}
