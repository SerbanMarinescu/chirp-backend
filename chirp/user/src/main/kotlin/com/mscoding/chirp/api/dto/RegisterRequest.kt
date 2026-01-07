package com.mscoding.chirp.api.dto

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Pattern
import org.hibernate.validator.constraints.Length

data class RegisterRequest(
    @field:Email(message = "Must be a valid email address")
    @JsonProperty("email")
    val email: String,

    @field:Length(min = 3, max = 20, message = "Username length must be between 3 and 20 characters")
    @JsonProperty("username")
    val username: String,

    @field:Pattern(
        regexp = "^(?=.*[\\d!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?])(.{8,})$",
        message = "Password must be at least 8 characters and contain at least one digit or special character"
    )
    @JsonProperty("password")
    val password: String
)
