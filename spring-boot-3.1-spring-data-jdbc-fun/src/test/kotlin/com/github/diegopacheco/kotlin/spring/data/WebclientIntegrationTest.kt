package com.github.diegopacheco.kotlin.spring.data

import com.github.diegopacheco.kotlin.spring.data.config.DatabaseFeeder
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.toEntity
import java.net.URI

@SpringBootTest(
    classes = [DatabaseFeeder::class],
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
@EnableAutoConfiguration
@ComponentScan("com.*")
class WebclientIntegrationTest(
    @Autowired @Qualifier("catsWebclient") val webClient: WebClient
) {
    @Test
    fun testCatsWebClient() {
        val result = webClient.get().
            uri{ uriBuilder -> uriBuilder.path("/").build() }.
            retrieve().
            toEntity<String>().
            block()

        println(result)
        assertNotNull(result)
    }
}