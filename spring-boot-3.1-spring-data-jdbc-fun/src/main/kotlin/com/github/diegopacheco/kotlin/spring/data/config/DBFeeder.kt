package com.github.diegopacheco.kotlin.spring.data.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Component


@Component
class DatabaseFeeder(
    @Autowired val jdbcTemplate: JdbcTemplate
) {
    fun feed() {
        jdbcTemplate.execute("INSERT INTO Author(name,last_name,book) VALUES('Diego','Pacheco','Building Applications with Scala')")
        jdbcTemplate.execute("INSERT INTO Author(name,last_name,book) VALUES('Diego','Pacheco','Building Applications with Scala')")
        jdbcTemplate.execute("INSERT INTO Author(name,last_name,book) VALUES('Diego','Pacheco','Building Applications with Scala')")
        jdbcTemplate.execute("INSERT INTO Author(name,last_name,book) VALUES('Diego','Pacheco','Building Applications with Scala')")
        jdbcTemplate.execute("INSERT INTO Author(name,last_name,book) VALUES('Diego','Pacheco','Building Applications with Scala')")
        jdbcTemplate.execute("INSERT INTO Author(name,last_name,book) VALUES('Diego','Pacheco','Building Applications with Scala')")
        jdbcTemplate.execute("INSERT INTO Author(name,last_name,book) VALUES('Diego','Pacheco','Building Applications with Scala')")
        jdbcTemplate.execute("INSERT INTO Author(name,last_name,book) VALUES('Diego','Pacheco','Building Applications with Scala')")
    }
}

