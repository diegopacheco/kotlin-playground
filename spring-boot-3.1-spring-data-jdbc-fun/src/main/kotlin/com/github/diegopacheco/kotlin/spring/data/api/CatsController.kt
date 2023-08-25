package com.github.diegopacheco.kotlin.spring.data.api

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.http.ResponseEntity
import org.springframework.http.client.reactive.ReactorClientHttpConnector
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.toEntity
import reactor.core.publisher.Mono
import reactor.netty.http.client.HttpClient
import java.net.URI

@RestController
class CatsController(
    @Autowired @Qualifier("catsWebclient") val webClient: WebClient
) {

    @GetMapping("/cats")
    fun getCatsWisdom(): Mono<ResponseEntity<String>> {
        return webClient.get().uri(URI("https://catfact.ninja/fact/")).retrieve().toEntity<String>()
    }

}