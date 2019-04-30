package model.wunderground.datamodel;

import java.io.Serializable;

public class Fcttext_metric implements Serializable {
    private static final long serialVersionUID = 1L;

    public String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
