package model.wunderground.datamodel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Low implements Serializable {
    private static final long serialVersionUID = 1L;
    @SerializedName("fahrenheit")
    public String fahrenheit;
    @SerializedName("celsius")
    public String celsius;

    public String getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(String fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public String getCelsius() {
        return celsius;
    }

    public void setCelsius(String celsius) {
        this.celsius = celsius;
    }
}
