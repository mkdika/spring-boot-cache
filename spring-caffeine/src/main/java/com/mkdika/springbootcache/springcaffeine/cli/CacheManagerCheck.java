package com.mkdika.springbootcache.springcaffeine.cli;

import org.springframework.boot.CommandLineRunner;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Component;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
@Component
public class CacheManagerCheck implements CommandLineRunner {

    private final CacheManager cacheManager;

    public CacheManagerCheck(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n\n" 
                + "====================\n"
                + "USING CACHE MANAGER: " + this.cacheManager.getClass().getName() + "\n"
                + "====================\n\n");
    }
}
