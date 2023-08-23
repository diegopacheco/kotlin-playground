package com.github.diegopacheco.kotlin.blog.app

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.github.diegopacheco.kotlin.blog.solution.*")
class BlogApplication

fun main(args: Array<String>) {
    runApplication<BlogApplication>(*args)
}