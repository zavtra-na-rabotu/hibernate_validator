package com.example.hibernate_validator.controller;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    MockMvc mvc;

    @Test
    public void createUser() throws Exception {

        String createUserRequest = new JSONObject()
            .put("firstName", "Ivan")
            .put("lastName", "Petrov")
            .put("email", "ivanpetrov@gmail.com")
            .put("phone", "+79055888889")
            .put("region", 90)
            .put("birthDate", "26.05.1994")
            .put("married", true)
            .toString();

        mvc.perform(post("/api/v1/user")
            .contentType(APPLICATION_JSON)
            .content(createUserRequest))
            .andExpect(status().isOk());
    }
}
