package com.example.incomestarter.starter;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class IncomeClientAutoConfig {

    @Bean
    @ConditionalOnMissingBean
    public IncomeClient incomeClient() {
        return new IncomeClient();
    }
}
