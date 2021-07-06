package com.example.hibernate_validator.dto.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserCreateRequest {
    @NotEmpty(message = "не может быть пустым")
    private String firstName;

    @NotEmpty
    private String lastName;

    @Email
    private String email;

    @Pattern(regexp="(^$|[0-9]{10})")
    private String phone;

    @NotNull
    @Min(1)
    @Max(97)
    private Integer region;

    @Past
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate birthDate;

    private Boolean married;
}
