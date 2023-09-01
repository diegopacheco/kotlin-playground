package com.github.diegopacheco.kotlin.spring.config

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.client.reactive.ReactorClientHttpConnector
import org.springframework.web.client.RestTemplate
import org.springframework.web.reactive.function.client.WebClient
import reactor.netty.http.client.HttpClient
import reactor.netty.resources.ConnectionProvider

@Configuration
class ClientConfig {

    @Bean
    fun getRestTemplate(): RestTemplate {
        return RestTemplate()
    }

    @Bean
    @Qualifier("catsWebclient")
    fun getCatsClient(): WebClient {
        return WebClient.builder()
            .clientConnector(ReactorClientHttpConnector(HttpClient.create(ConnectionProvider.newConnection())))
            .codecs { configure -> configure.defaultCodecs().maxInMemorySize(2 * 1024 * 1024) }
            .baseUrl("https://catfact.ninja/fact")
            .build()
    }

}