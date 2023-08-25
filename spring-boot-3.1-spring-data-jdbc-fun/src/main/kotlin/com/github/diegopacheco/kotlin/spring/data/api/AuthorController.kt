package com.github.diegopacheco.kotlin.spring.data.api

import com.github.diegopacheco.kotlin.spring.data.business.AuthorService
import com.github.diegopacheco.kotlin.spring.data.entity.Author
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthorController(
    @Autowired val authorService: AuthorService
) {
    @GetMapping("/")
    fun findAll(): MutableIterable<Author?> = authorService.findAll()
}