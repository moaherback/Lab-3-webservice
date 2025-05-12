package com.example.weatherapp.weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherRestController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/api/weather")
    public void getWeather() {
        weatherService.getWeather();



    }
}
