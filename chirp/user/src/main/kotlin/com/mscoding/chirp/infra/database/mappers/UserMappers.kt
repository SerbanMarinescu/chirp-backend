package com.mscoding.chirp.infra.database.mappers

import com.mscoding.chirp.domain.model.User
import com.mscoding.chirp.infra.database.entities.UserEntity

fun UserEntity.toUser(): User {
    return User(
        id = id!!,
        username = username,
        email = email,
        hasEmailVerified = hasVerifiedEmail
    )
}