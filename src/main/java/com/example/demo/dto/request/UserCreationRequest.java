package com.example.demo.dto.request;

import com.example.demo.entity.User;
import com.example.demo.exception.ErrorCode;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class UserCreationRequest extends User{
    @Size(min=8, message = "PASSWORD_INVALID")
    private String password;
    @Size(min=3, message = "USERNAME_INVALID")
    private String username;


    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
