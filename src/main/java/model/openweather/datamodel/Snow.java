package model.openweather.datamodel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Snow implements Serializable {
    @SerializedName("3h")
    private double threeh;


}
