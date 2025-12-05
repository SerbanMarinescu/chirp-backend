package com.mscoding.chirp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChirpApplication

fun main(args: Array<String>) {
	runApplication<ChirpApplication>(*args)
}
