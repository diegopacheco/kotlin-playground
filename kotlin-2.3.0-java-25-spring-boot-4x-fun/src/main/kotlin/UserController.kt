package com.github.diegopacheco.app

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {

    @GetMapping("/count")
    fun count(): Map<String, Int> = mapOf("count" to userService.count())

    @GetMapping
    fun getAll(): List<User> = userService.getAll()
}
