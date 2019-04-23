package main.webapp.model.openweather.datamodel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Clouds implements Serializable{
    @SerializedName("all")
    private String all;

    public String getAll() {
        return all;
    }

    public void setAll(String all) {
        this.all = all;
    }
}
