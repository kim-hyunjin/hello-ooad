package hello.ooad.gamesystem;

import java.util.Map;

public class Unit {

    private String type;
    private Map Properties;

    public Unit() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map getProperties() {
        return Properties;
    }

    public void setProperties(Map properties) {
        Properties = properties;
    }
}