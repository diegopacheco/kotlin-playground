package com.github.diegopacheco.kotlin.spring.data

import com.github.diegopacheco.kotlin.spring.data.config.DatabaseFeeder
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.*")
open class Application(
    @Autowired val feeder:DatabaseFeeder
) : CommandLineRunner {
    override fun run(vararg args: String?) {
        feeder.feed()
    }
}

fun main(args: Array<String>){
    runApplication<Application>(*args)
}