package com.github.diegopacheco.kotlin.spring.data.api

import com.github.diegopacheco.kotlin.spring.data.business.AuthorService
import com.github.diegopacheco.kotlin.spring.data.entity.Author
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import java.util.*

@Controller
open class AuthorController(
    @Autowired val authorService: AuthorService
) {
    @GetMapping("/")
    fun findAll(): MutableIterable<Author?> = authorService.findAll()

    @Transactional
    @GetMapping(path = ["/save/{name}/{lastName}/{book}"])
    fun saveAuthor(@PathVariable("name") name:String,
                   @PathVariable("lastName") lastName:String,
                   @PathVariable("book") book:String,
    ) {
        authorService.save(Author(UUID.randomUUID(),name,lastName,book))
    }
}