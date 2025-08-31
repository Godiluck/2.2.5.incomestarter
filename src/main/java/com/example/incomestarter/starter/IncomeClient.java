package com.example.incomestarter.starter;

import com.example.incomestarter.model.IncomeRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class IncomeClient {

    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${api-url}")
    private String url;

    public IncomeRecord[] fetchIncomeRecords() {
        return restTemplate.getForObject(url, IncomeRecord[].class);
    }
}
