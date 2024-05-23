package com.github.diegopacheco.kotlinplayground.spring

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@Service
class HelloService {
    fun greetings(): String {
        return "Greetings from Spring Boot!"
    }
}

@RestController
class HelloController(
    @Autowired val service: HelloService
) {
    @GetMapping("/")
    fun index(): String {
        return service.greetings()
    }
}

@ComponentScan("com.github.diegopacheco.kotlinplayground.*")
@SpringBootApplication
open class Application {
    @Bean
    open fun commandLineRunner(ctx: ApplicationContext): CommandLineRunner {
        return CommandLineRunner { args: Array<String?>? ->
            println("Let's inspect the beans provided by Spring Boot:")
            val beanNames = ctx.beanDefinitionNames
            Arrays.sort(beanNames)
            for (beanName in beanNames) {
                println(beanName)
            }
        }
    }
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(Application::class.java, *args)
        }
    }
}
