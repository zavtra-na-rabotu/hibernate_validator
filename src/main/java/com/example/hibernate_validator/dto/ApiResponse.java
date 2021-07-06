package com.example.hibernate_validator.dto;

import lombok.Getter;

import java.util.Collection;

@Getter
public class ApiResponse<T> {
    private final T payload;
    private Collection<ErrorResponse> errors;
    private final Status status;

    public enum Status {
        SUCCESS, FAILURE
    }

    public ApiResponse(T payload, Collection<ErrorResponse> errors, Status status) {
        this.payload = payload;
        this.errors = errors;
        this.status = status;
    }

    public static <T> ApiResponse<T> ok(T payload) {
        return new ApiResponse<>(payload, null, Status.SUCCESS);
    }

    public static <T> ApiResponse<T> error(Collection<ErrorResponse> errors) {
        return new ApiResponse<>(null, errors, Status.FAILURE);
    }
}
