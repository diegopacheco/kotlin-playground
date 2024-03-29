package com.github.diegopacheco.kotlin.spring.data

import com.github.diegopacheco.kotlin.spring.data.config.DatabaseFeeder
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories

@SpringBootApplication
@EnableAutoConfiguration
@EnableJdbcRepositories
@ComponentScan("com.*")
open class Application(
    @Autowired val feeder:DatabaseFeeder
) : CommandLineRunner {
    override fun run(vararg args: String?) {
        feeder.feed()
    }
}
class ApplicationMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<Application>(*args)
        }
    }
}