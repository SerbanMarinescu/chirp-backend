package com.mscoding.chirp.infra.security.exception

import java.lang.RuntimeException

class EncodePasswordException: RuntimeException(
    "Password could not be encoded."
)