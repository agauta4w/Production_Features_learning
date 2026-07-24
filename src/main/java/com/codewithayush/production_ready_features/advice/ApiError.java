package com.codewithayush.production_ready_features.advice;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Getter
public class ApiError {

    private LocalDateTime timestamp;
    private String error;
    private HttpStatus status;

    private ApiError() {
        this.timestamp = LocalDateTime.now();
    }
    public ApiError(String error, HttpStatus status) {
        this();
        this.error = error;
        this.status = status;
    }
}
