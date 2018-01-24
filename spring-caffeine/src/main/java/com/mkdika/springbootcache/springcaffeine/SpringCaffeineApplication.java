package com.mkdika.springbootcache.springcaffeine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class SpringCaffeineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCaffeineApplication.class, args);
	}
}
