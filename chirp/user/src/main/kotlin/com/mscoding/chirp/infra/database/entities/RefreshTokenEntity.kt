package com.mscoding.chirp.infra.database.entities

import com.mscoding.chirp.domain.model.UserId
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Index
import jakarta.persistence.Table
import org.hibernate.annotations.CreationTimestamp
import java.time.Instant

@Entity
@Table(
    name = "refresh_tokens",
    schema = "user_service",
    indexes = [
        Index(name = "idx_refresh_tokens_user_id", columnList = "user_id"),
        Index(name = "idx_refresh_tokens_user_token", columnList = "user_id,hashed_token")
    ]
)
class RefreshTokenEntity(
    @Id
    @GeneratedValue(GenerationType.IDENTITY)
    var id: Long = 0,

    @Column(nullable = false)
    var userId: UserId,

    @Column(nullable = false)
    var expiresAt: Instant,

    @Column(nullable = false)
    var hashedToken: String,

    @CreationTimestamp
    var createdAt: Instant = Instant.now()
)