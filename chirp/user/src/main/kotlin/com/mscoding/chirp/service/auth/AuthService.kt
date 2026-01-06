package com.mscoding.chirp.service.auth

import com.mscoding.chirp.infra.security.exception.EncodePasswordException
import com.mscoding.chirp.domain.exception.UserAlreadyExistsException
import com.mscoding.chirp.domain.model.User
import com.mscoding.chirp.infra.database.entities.UserEntity
import com.mscoding.chirp.infra.database.mappers.toUser
import com.mscoding.chirp.infra.database.repositories.UserRepository
import com.mscoding.chirp.infra.security.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class AuthService(
    private val userRepository: UserRepository,
    private val passwordEncoder: PasswordEncoder
) {

    fun register(email: String, username: String, password: String): User {
        val user = userRepository.findByEmailOrUsername(
            email = email.trim(),
            username = username.trim()
        )

        if(user != null) {
            throw UserAlreadyExistsException()
        }

        val savedUser = userRepository.save(
            UserEntity(
                email = email.trim(),
                username = username.trim(),
                hashedPassword = passwordEncoder.encode(password) ?: throw EncodePasswordException()
            )
        ).toUser()

        return savedUser
    }
}