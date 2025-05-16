package com.example.weatherapp.weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;
    @GetMapping ("/weather")
    public String getWeather(Model model) {
        var weather = weatherService.getWeather();
    model.addAttribute("weather", weather);
    model.addAttribute("time", weatherService.getWeatherTime(weather));
    return "weather";
    }
}
