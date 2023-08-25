package com.github.diegopacheco.kotlin.spring.data.business

import com.github.diegopacheco.kotlin.spring.data.entity.Author
import com.github.diegopacheco.kotlin.spring.data.repository.AuthorRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AuthorService(
    @Autowired val authorRepository: AuthorRepository
) {

    fun findAll(): MutableIterable<Author?> {
        return authorRepository.findAll()
    }

}