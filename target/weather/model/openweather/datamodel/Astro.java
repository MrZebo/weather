package main.webapp.model.openweather.datamodel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Astro implements Serializable {
    @SerializedName("pod")
    private String pod;
}
