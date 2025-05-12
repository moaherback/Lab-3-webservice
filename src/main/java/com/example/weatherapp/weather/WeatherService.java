package com.example.weatherapp.weather;

import com.example.weatherapp.met.MetClient;
import com.example.weatherapp.met.MetResponse;
import com.example.weatherapp.smhi.SmhiClient;
import com.example.weatherapp.smhi.SmhiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Autowired
    private SmhiClient smhiClient;
    @Autowired
    private MetClient metClient;

    public void getWeather() {
        MetResponse metWeather = metClient.getWeather();
        System.out.println(metWeather);
        SmhiResponse smhiWeather = smhiClient.getWeather();
        System.out.println(smhiWeather);
    }

}
