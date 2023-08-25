package com.github.diegopacheco.kotlin.spring.controller

import com.github.diegopacheco.kotlin.spring.service.CatService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class CatController(
    @Autowired val catService: CatService
) {

    @GetMapping("/")
    fun getCatWisdom(): Mono<ResponseEntity<String>> {
        return catService.getCatWisdom()
    }

}