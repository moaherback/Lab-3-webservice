package com.example.weatherapp.weather;

import com.example.weatherapp.met.MetClient;
import com.example.weatherapp.met.MetResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Autowired
    private MetClient metClient;

    public void getWeather() {
        MetResponse weather = metClient.getWeather();
        System.out.println(weather);
    }
}
