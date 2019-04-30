package model.wunderground.datamodel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Date implements Serializable {
    private static final long serialVersionUID = 1L;
    @SerializedName("epoch")
    private String epoch;
    @SerializedName("pretty")
    private String pretty;
    @SerializedName("day")
    private int day;
    @SerializedName("month")
    private int month;
    @SerializedName("year")
    private int year;
    @SerializedName("yday")
    private int yday;
    @SerializedName("hour")
    private int hour;
    @SerializedName("min")
    private String min;
    @SerializedName("sec")
    private int sec;
    @SerializedName("isdst")
    private String isdst;
    @SerializedName("monthname")
    private String monthname;
    @SerializedName("monthname_short")
    private String monthname_short;
    @SerializedName("weekday_short")
    private String weekday_short;
    @SerializedName("weekday")
    private String weekday;
    @SerializedName("ampm")
    private String ampm;
    @SerializedName("tz_short")
    private String tz_short;
    @SerializedName("tz_long")
    private String tz_long;

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

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYday() {
        return yday;
    }

    public void setYday(int yday) {
        this.yday = yday;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public String getIsdst() {
        return isdst;
    }

    public void setIsdst(String isdst) {
        this.isdst = isdst;
    }

    public String getMonthname() {
        return monthname;
    }

    public void setMonthname(String monthname) {
        this.monthname = monthname;
    }

    public String getMonthname_short() {
        return monthname_short;
    }

    public void setMonthname_short(String monthname_short) {
        this.monthname_short = monthname_short;
    }

    public String getWeekday_short() {
        return weekday_short;
    }

    public void setWeekday_short(String weekday_short) {
        this.weekday_short = weekday_short;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public String getAmpm() {
        return ampm;
    }

    public void setAmpm(String ampm) {
        this.ampm = ampm;
    }

    public String getTz_short() {
        return tz_short;
    }

    public void setTz_short(String tz_short) {
        this.tz_short = tz_short;
    }

    public String getTz_long() {
        return tz_long;
    }

    public void setTz_long(String tz_long) {
        this.tz_long = tz_long;
    }
}
