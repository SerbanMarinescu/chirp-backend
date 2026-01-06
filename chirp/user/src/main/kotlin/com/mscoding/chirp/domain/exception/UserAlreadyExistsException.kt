package com.mscoding.chirp.domain.exception

import java.lang.RuntimeException

class UserAlreadyExistsException: RuntimeException(
    "A user with this username or email already exists."
)