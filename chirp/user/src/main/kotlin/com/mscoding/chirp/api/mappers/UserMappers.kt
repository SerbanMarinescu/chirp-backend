package com.mscoding.chirp.api.mappers

import com.mscoding.chirp.api.dto.AuthenticatedUserDto
import com.mscoding.chirp.api.dto.UserDto
import com.mscoding.chirp.domain.model.AuthenticatedUser
import com.mscoding.chirp.domain.model.User

fun User.toUserDto(): UserDto {
    return UserDto(
        id = id,
        email = email,
        username = username,
        hasVerifiedEmail = hasEmailVerified
    )
}

fun AuthenticatedUser.toAuthenticatedUserDto(): AuthenticatedUserDto {
    return AuthenticatedUserDto(
        user = user.toUserDto(),
        accessToken = accessToken,
        refreshToken = refreshToken
    )
}