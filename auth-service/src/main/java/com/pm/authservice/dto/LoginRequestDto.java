package com.pm.authservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginRequestDto {

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be a valid email Address")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 8, message = "Password must be atleast 8 characters long")
    private String password;

    public @NotBlank(message = "Email is required") @Email(message = "Email should be a valid email Address") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email is required") @Email(message = "Email should be a valid email Address") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Password is required") @Size(min = 8, message = "Password must be atleast 8 characters long") String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank(message = "Password is required") @Size(min = 8, message = "Password must be atleast 8 characters long") String password) {
        this.password = password;
    }
}
