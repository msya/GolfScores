package com.golfscores

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.golfscores.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080) {
        configureRouting()
    }.start(wait = true)
}
