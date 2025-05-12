package com.example.weatherapp.smhi;

import com.example.weatherapp.met.MetResponse;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Configuration
public class SmhiClient {
    WebClient client = WebClient.create("https://opendata-download-metfcst.smhi.se/api/category/pmp3g/version/2/geotype/point/lon/18.0300/lat/59.3110/data.json");

    public SmhiResponse getWeather() {

        Mono<SmhiResponse> smhiResponseMono = client
                .get()
                .retrieve()
                .bodyToMono(SmhiResponse.class);

        return smhiResponseMono.block();
    }
}

