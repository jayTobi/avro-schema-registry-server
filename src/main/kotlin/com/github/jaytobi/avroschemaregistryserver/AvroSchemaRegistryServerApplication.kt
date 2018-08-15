package com.github.jaytobi.avroschemaregistryserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.stream.schema.server.EnableSchemaRegistryServer

@SpringBootApplication
@EnableSchemaRegistryServer
class AvroSchemaRegistryServerApplication

fun main(args: Array<String>) {
    runApplication<AvroSchemaRegistryServerApplication>(*args)
}
