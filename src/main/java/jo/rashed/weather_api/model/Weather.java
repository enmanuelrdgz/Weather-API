package jo.rashed.weather_api.model;

import lombok.*;

import java.io.Serializable;

@Data
public class Weather implements Serializable {
    private String dateTime;
    private String description;
    private String address;
    private double temperature;

    public Weather(String dateTime, String description, String address, double temperature) {
        this.dateTime = dateTime;
        this.description = description;
        this.address = address;
        this.temperature = temperature;
    }
}
