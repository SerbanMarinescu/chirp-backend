package com.mscoding.chirp.api.dto

data class AuthenticatedUserDto(
    val user: UserDto,
    val accessToken: String,
    val refreshToken: String
)
