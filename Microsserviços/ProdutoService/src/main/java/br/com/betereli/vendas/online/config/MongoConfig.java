/**
 * 
 */
package br.com.betereli.vendas.online.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@EnableMongoRepositories(basePackages = "br.com.betereli.vendas.online.repository")
public class MongoConfig {

}
