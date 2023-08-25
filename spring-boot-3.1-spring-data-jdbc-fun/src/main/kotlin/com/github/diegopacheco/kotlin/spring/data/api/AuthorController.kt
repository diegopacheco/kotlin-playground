package com.github.diegopacheco.kotlin.spring.data.api

import com.github.diegopacheco.kotlin.spring.data.business.AuthorService
import com.github.diegopacheco.kotlin.spring.data.entity.Author
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class AuthorController(
    @Autowired val authorService: AuthorService
) {
    @GetMapping("/all")
    fun findAll(): Iterable<Author?> {
        return authorService.findAll()
    }

    @Transactional
    @GetMapping(path = ["/save/{name}/{lastName}/{book}"])
    fun saveAuthor(@PathVariable("name") name:String,
                   @PathVariable("lastName") lastName:String,
                   @PathVariable("book") book:String,
    ) {
        println("Let's save an author! Uhu!!! ")
        authorService.save(Author(UUID.randomUUID(),name,lastName,book))
    }
}