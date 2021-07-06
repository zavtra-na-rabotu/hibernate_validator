package com.example.hibernate_validator.controller;

import com.example.hibernate_validator.dto.ApiResponse;
import com.example.hibernate_validator.dto.user.UserCreateRequest;
import com.example.hibernate_validator.dto.user.UserResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @PostMapping
    public ApiResponse<UserResponse> createUser(@RequestBody @Valid UserCreateRequest data) {
        UserResponse userResponse = UserResponse.builder()
            .firstName(data.getFirstName())
            .lastName(data.getLastName())
            .email(data.getEmail())
            .phone(data.getPhone())
            .region(data.getRegion())
            .birthDate(data.getBirthDate())
            .married(data.getMarried())
            .build();

        return ApiResponse.ok(userResponse);
    }
}
