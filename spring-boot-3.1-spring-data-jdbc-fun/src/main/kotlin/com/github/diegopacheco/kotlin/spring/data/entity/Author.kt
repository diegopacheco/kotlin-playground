package com.github.diegopacheco.kotlin.spring.data.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.UUID

@Table
data class Author(
    @Id var id: UUID?,
    val name: String,
    val lastName: String,
    val book: String
)