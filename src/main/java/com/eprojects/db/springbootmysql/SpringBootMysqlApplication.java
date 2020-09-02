package com.eprojects.db.springbootmysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.eprojects.db.springbootmysql.repository")
@SpringBootApplication
public class SpringBootMysqlApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMysqlApplication.class, args);
	}
}
