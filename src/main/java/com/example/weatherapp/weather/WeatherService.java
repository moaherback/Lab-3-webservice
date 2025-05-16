package com.example.weatherapp.weather;

import com.example.weatherapp.met.MetClient;
import com.example.weatherapp.met.MetResponse;
import com.example.weatherapp.smhi.SmhiClient;
import com.example.weatherapp.smhi.SmhiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

@Service
public class WeatherService {

    @Autowired
    private SmhiClient smhiClient;
    @Autowired
    private MetClient metClient;

    public Weather getWeather() {
        MetResponse metWeather = metClient.getWeather();
        SmhiResponse smhiWeather = smhiClient.getWeather();

        var timeTomorrow = ZonedDateTime.now(ZoneId.of("Europe/Stockholm"))
                .plusDays(1)
                .truncatedTo(ChronoUnit.HOURS)
                .plusHours(1)
                .toInstant()
                .toString();

        var metTimeserie = metWeather.getProperties()
                .getTimeseries()
                .stream().
                filter(timeseries -> timeseries.getTime()
                        .equals(timeTomorrow))
                .findFirst()
                .orElse(null);

        var smhiTimeserie = smhiWeather.getTimeSeries()
                .stream()
                .filter(timeSeries -> timeSeries.getValidTime()
                        .equals(timeTomorrow))
                .findFirst()
                .orElse(null);

        var smhiTemperature = smhiTimeserie.getParameters()
                .stream()
                .filter(parameter -> parameter.getName()
                        .equals("t"))
                .findFirst()
                .orElse(null)
                .getValues()
                .stream()
                .findFirst()
                .orElse(null);

        var metTemperature = metTimeserie
                .getData()
                .getInstant()
                .getDetails()
                .getAirTemperature();

        var metHumidity = metTimeserie
                .getData()
                .getInstant()
                .getDetails()
                .getRelativeHumidity();

        var smhiHumidity = smhiTimeserie
                .getParameters()
                .stream()
                .filter(parameter -> parameter.getName()
                        .equals("r"))
                .findFirst()
                .orElse(null)
                .getValues()
                .stream()
                .findFirst()
                .orElse(null);

        // The best weather is based on the highest temperature
        Weather weather;
        if (smhiTemperature > metTemperature) {
            weather = new Weather(smhiTemperature, smhiHumidity, "SMHI", smhiTimeserie.getValidTime());
        } else
            weather = new Weather(metTemperature, metHumidity, "MET", metTimeserie.getTime());
        return weather;
    }

    public String getWeatherTime(Weather weather) {
        Instant instant = Instant.parse(weather.getUtcTimestamp());
        ZonedDateTime stockholmTime = instant.atZone(ZoneId.of("Europe/Stockholm"));
        return stockholmTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z"));
    }
}