package com.example.incomestarter.starter;

import com.example.incomestarter.dto.IncomeResponseDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class IncomeClient {

    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${api-url}")
    private String url;

    @SuppressWarnings("unused")
    public IncomeResponseDto[] fetchIncomeResponse() {
        return restTemplate.getForObject(url, IncomeResponseDto[].class);
    }
}
