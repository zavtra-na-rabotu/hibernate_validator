package com.example.hibernate_validator.dto.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class UserResponse {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Integer region;
    private LocalDate birthDate;
    private Boolean married;
}
