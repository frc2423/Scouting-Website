package com.example.plugins

import com.example.api.Team
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import io.ktor.http.*
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import java.io.File

fun Application.configureRouting() {

    val mapper = ObjectMapper()
        .registerKotlinModule()
        .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        get("/test"){
            call.respondText("testerino")
        }

        get("/api/teams/{id}"){
            val id = call.parameters["id"]
            val file = File("data/teams").listFiles().firstOrNull { it.nameWithoutExtension == id }
            if(file == null){
                call.respond(HttpStatusCode.NotFound, "No team with id $id found")
                return@get
            }
            val team: Team = mapper.readValue(file)
            call.respond(team)
        }

        get("/api/teams"){
            val teams: List<Team> = File("data/teams").listFiles()
                .map{ mapper.readValue(it) }
            call.respond(teams)
        }
        staticFiles("/", File("front-end/dist"))
    }
}
