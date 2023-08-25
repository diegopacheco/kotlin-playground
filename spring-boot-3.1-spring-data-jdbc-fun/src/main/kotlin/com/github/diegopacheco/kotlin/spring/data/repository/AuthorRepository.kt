package com.github.diegopacheco.kotlin.spring.data.repository

import com.github.diegopacheco.kotlin.spring.data.entity.Author
import org.springframework.data.jdbc.repository.query.Modifying
import org.springframework.data.jdbc.repository.query.Query

import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.util.UUID


@Repository
interface AuthorRepository : CrudRepository<Author?, UUID?> {
    fun findByName(name: String?): List<Author?>?

    @Modifying
    @Query("UPDATE author SET name = :name WHERE id = :id")
    fun updateByName(@Param("id") id: Long?, @Param("name") name: String?): Boolean
}