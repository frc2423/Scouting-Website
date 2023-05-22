package com.example.plugins

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import java.io.File

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        get("/test"){
            call.respondText("testerino")
        }
        staticFiles("/", File("front-end/dist"))
    }
}
