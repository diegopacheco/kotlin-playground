package com.github.diegopacheco.app

import org.springframework.stereotype.Service

@Service
class UserService {
    private val users = mutableListOf(
        User(1, "Alice"),
        User(2, "Bob"),
        User(3, "Charlie")
    )

    fun count(): Int = users.size

    fun getAll(): List<User> = users
}
