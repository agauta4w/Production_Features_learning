package com.codewithayush.production_ready_features.advice;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Getter
public class ApiError {

    private final LocalDateTime timeStamp;
    private String error;
    private HttpStatus status;

    private ApiError() {
        this.timeStamp = LocalDateTime.now();
    }
    public ApiError(String error, HttpStatus status) {
        this();
        this.error = error;
        this.status = status;
    }
}
