package com.zhiying.moviekg.config;

import com.arangodb.ArangoDB;
import com.arangodb.ArangoDatabase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArangodbConfig {

    @Value("${arango.host}")
    private String host;

    @Value("${arango.port}")
    private int port;

    @Value("${arango.user}")
    private String user;

    @Value("${arango.password}")
    private String password;

    @Value("${arango.database}")
    private String database;

    @Bean
    public ArangoDatabase getArangoDatabase()
    {
        return new ArangoDB.Builder()
                .host(host, port)
                .user(user)
                .password(password)
                .acquireHostList(false)
                .maxConnections(10)
                .build()
                .db(database);
    }
}
