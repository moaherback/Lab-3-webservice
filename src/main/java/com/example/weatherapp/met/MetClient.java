package com.example.weatherapp.met;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Configuration
public class MetClient {
    WebClient client = WebClient.create("https://api.met.no/weatherapi/locationforecast/2.0/compact?lat=59.3110&lon=18.0300");

    public MetResponse getWeather() {

        Mono<MetResponse> metResponseMono = client
                .get()
                .retrieve()
                .bodyToMono(MetResponse.class);

        return metResponseMono.block();
    }
}

