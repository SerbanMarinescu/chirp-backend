package com.mscoding.chirp.infra.database.mappers

import com.mscoding.chirp.domain.model.EmailVerificationToken
import com.mscoding.chirp.infra.database.entities.EmailVerificationTokenEntity

fun EmailVerificationTokenEntity.toEmailVerificationToken(): EmailVerificationToken {
    return EmailVerificationToken(
        id = id,
        token = token,
        user = user.toUser()
    )
}