package com.mkdika.springbootcache.springcache;

import java.net.MalformedURLException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class SpringCacheApplication {        

    public static void main(String[] args) throws MalformedURLException {
        SpringApplication.run(SpringCacheApplication.class, args);               
    }
}
