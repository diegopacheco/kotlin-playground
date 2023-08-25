package com.github.diegopacheco.kotlin.spring.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.toEntity
import reactor.core.publisher.Mono

@Service
class CatService(
    @Autowired @Qualifier("catsWebclient") val webClient: WebClient
) {
    fun getCatWisdom(): Mono<ResponseEntity<String>> {
        return webClient.
            get().
            uri{ uriBuilder -> uriBuilder.path("/").build() }.
            retrieve().
            toEntity<String>()
    }

}