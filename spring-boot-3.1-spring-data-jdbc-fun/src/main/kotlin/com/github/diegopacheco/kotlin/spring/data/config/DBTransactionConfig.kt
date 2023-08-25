package com.github.diegopacheco.kotlin.spring.data.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import org.springframework.jdbc.datasource.DataSourceTransactionManager
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType
import org.springframework.transaction.TransactionManager
import javax.sql.DataSource

@Configuration
open class DBTransactionConfig : AbstractJdbcConfiguration() {
    @Bean
    open fun transactionManager(dataSource: DataSource?): TransactionManager {
        return DataSourceTransactionManager(dataSource)
    }

    @Bean
    open fun dataSource(): DataSource {
        val builder = EmbeddedDatabaseBuilder()
        return builder.setType(EmbeddedDatabaseType.H2).build()
    }

    @Bean
    open fun namedParameterJdbcOperations(dataSource: DataSource?): NamedParameterJdbcOperations {
        return NamedParameterJdbcTemplate(dataSource)
    }
}