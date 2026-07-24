package com.codewithayush.production_ready_features.config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.Banner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
