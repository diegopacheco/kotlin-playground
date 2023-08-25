package com.github.diegopacheco.kotlin.spring.data.config

import org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchProperties.Restclient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
open class SpringConfig {

    @Bean
    open fun getRestTemplate():RestTemplate {
        return RestTemplate()
    }

}