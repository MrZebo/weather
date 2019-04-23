package main.webapp.model.wunderground.datamodel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class FctTime implements Serializable {
    @SerializedName("hour")
    private String hour;
    @SerializedName("hour_padded")
    private String hour_padded;
    @SerializedName("min")
    private String min;
    @SerializedName("min_unpadded")
    private String min_unpadded;
    @SerializedName("sec")
    private String sec;
    @SerializedName("year")
    private String year;
    @SerializedName("mon")
    private String mon;
    @SerializedName("mon_padded")
    private String mon_padded;
    @SerializedName("mon_abbrev")
    private String mon_abbrev;
    @SerializedName("mday")
    private String mday;
    @SerializedName("mday_padded")
    private String mday_padded;
    @SerializedName("yday")
    private String yday;
    @SerializedName("isdst")
    private String isdst;
    @SerializedName("epoch")
    private String epoch;
    @SerializedName("pretty")
    private String pretty;
    @SerializedName("civil")
    private String civil;
    @SerializedName("month_name")
    private String month_name;
    @SerializedName("month_name_abbrev")
    private String month_name_abbrev;
    @SerializedName("weekday_name")
    private String weekday_name;
    @SerializedName("weekday_name_night")
    private String weekday_name_night;
    @SerializedName("weekday_name_abbrev")
    private String weekday_name_abbrev;
    @SerializedName("weekday_name_unlang")
    private String weekday_name_unlang;
    @SerializedName("weekday_name_night_unlang")
    private String weekday_name_night_unlang;
    @SerializedName("ampm")
    private String ampm;
    @SerializedName("tz")
    private String tz;
    @SerializedName("age")
    private String age;
    @SerializedName("UTCDATE")
    private String UTCDATE;

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getHour_padded() {
        return hour_padded;
    }

    public void setHour_padded(String hour_padded) {
        this.hour_padded = hour_padded;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMin_unpadded() {
        return min_unpadded;
    }

    public void setMin_unpadded(String min_unpadded) {
        this.min_unpadded = min_unpadded;
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public String getMon_padded() {
        return mon_padded;
    }

    public void setMon_padded(String mon_padded) {
        this.mon_padded = mon_padded;
    }

    public String getMon_abbrev() {
        return mon_abbrev;
    }

    public void setMon_abbrev(String mon_abbrev) {
        this.mon_abbrev = mon_abbrev;
    }

    public String getMday() {
        return mday;
    }

    public void setMday(String mday) {
        this.mday = mday;
    }

    public String getMday_padded() {
        return mday_padded;
    }

    public void setMday_padded(String mday_padded) {
        this.mday_padded = mday_padded;
    }

    public String getYday() {
        return yday;
    }

    public void setYday(String yday) {
        this.yday = yday;
    }

    public String getIsdst() {
        return isdst;
    }

    public void setIsdst(String isdst) {
        this.isdst = isdst;
    }

    public String getEpoch() {
        return epoch;
    }

    public void setEpoch(String epoch) {
        this.epoch = epoch;
    }

    public String getPretty() {
        return pretty;
    }

    public void setPretty(String pretty) {
        this.pretty = pretty;
    }

    public String getCivil() {
        return civil;
    }

    public void setCivil(String civil) {
        this.civil = civil;
    }

    public String getMonth_name() {
        return month_name;
    }

    public void setMonth_name(String month_name) {
        this.month_name = month_name;
    }

    public String getMonth_name_abbrev() {
        return month_name_abbrev;
    }

    public void setMonth_name_abbrev(String month_name_abbrev) {
        this.month_name_abbrev = month_name_abbrev;
    }

    public String getWeekday_name() {
        return weekday_name;
    }

    public void setWeekday_name(String weekday_name) {
        this.weekday_name = weekday_name;
    }

    public String getWeekday_name_night() {
        return weekday_name_night;
    }

    public void setWeekday_name_night(String weekday_name_night) {
        this.weekday_name_night = weekday_name_night;
    }

    public String getWeekday_name_abbrev() {
        return weekday_name_abbrev;
    }

    public void setWeekday_name_abbrev(String weekday_name_abbrev) {
        this.weekday_name_abbrev = weekday_name_abbrev;
    }

    public String getWeekday_name_unlang() {
        return weekday_name_unlang;
    }

    public void setWeekday_name_unlang(String weekday_name_unlang) {
        this.weekday_name_unlang = weekday_name_unlang;
    }

    public String getWeekday_name_night_unlang() {
        return weekday_name_night_unlang;
    }

    public void setWeekday_name_night_unlang(String weekday_name_night_unlang) {
        this.weekday_name_night_unlang = weekday_name_night_unlang;
    }

    public String getAmpm() {
        return ampm;
    }

    public void setAmpm(String ampm) {
        this.ampm = ampm;
    }

    public String getTz() {
        return tz;
    }

    public void setTz(String tz) {
        this.tz = tz;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getUTCDATE() {
        return UTCDATE;
    }

    public void setUTCDATE(String UTCDATE) {
        this.UTCDATE = UTCDATE;
    }
}
