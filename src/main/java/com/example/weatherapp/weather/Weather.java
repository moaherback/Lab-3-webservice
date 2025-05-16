package com.example.weatherapp.weather;

public class Weather {
    private double temperature;
    private double humidity;
    private String source;
    private String utcTimestamp;

    public Weather(double temperature, double humidity, String source, String timestamp) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.source = source;
        this.utcTimestamp = timestamp;
    }

    public String getUtcTimestamp() {
        return utcTimestamp;
    }

    public void setUtcTimestamp(String utcTimestamp) {
        this.utcTimestamp = utcTimestamp;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}
