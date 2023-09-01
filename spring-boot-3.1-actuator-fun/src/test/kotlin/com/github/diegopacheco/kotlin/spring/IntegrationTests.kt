package com.github.diegopacheco.kotlin.spring

import com.github.diegopacheco.kotlin.spring.config.ClientConfig
import com.github.diegopacheco.kotlin.spring.service.CatService
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.ComponentScan

@SpringBootTest(
    classes = [ClientConfig::class],
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
@EnableAutoConfiguration
@ComponentScan("com.*")
class IntegrationTests(
    @Autowired val catService: CatService
) {
    @Test
    fun testCatsService(){
        val result = catService.getCatWisdom().block().body
        println(result)
        Assertions.assertNotNull(result)
    }
}