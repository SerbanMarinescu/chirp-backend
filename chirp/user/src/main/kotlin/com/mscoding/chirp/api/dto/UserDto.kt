package com.mscoding.chirp.api.dto

import com.mscoding.chirp.domain.model.UserId

data class UserDto(
    val id: UserId,
    val email: String,
    val username: String,
    val hasVerifiedEmail: Boolean
)
