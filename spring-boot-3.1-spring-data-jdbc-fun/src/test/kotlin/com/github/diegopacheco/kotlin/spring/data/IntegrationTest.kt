package com.github.diegopacheco.kotlin.spring.data

import com.github.diegopacheco.kotlin.spring.data.business.AuthorService
import com.github.diegopacheco.kotlin.spring.data.config.DatabaseFeeder
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.ComponentScan

@SpringBootTest(classes = [DatabaseFeeder::class],
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration
@ComponentScan("com.*")
class IntegrationTest(
    @Autowired val authorService: AuthorService
) {

    @Test
    fun getAllAuthors(){
        val result = authorService.findAll()
        println(result)
        assertNotNull(result)
    }

}