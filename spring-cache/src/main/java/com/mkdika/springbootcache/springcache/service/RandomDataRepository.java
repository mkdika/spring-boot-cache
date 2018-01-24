package com.mkdika.springbootcache.springcache.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
@Component
@CacheConfig(cacheNames = "randomdata")
public class RandomDataRepository {

    @Value("${randomdata.url}")
    public String randomDataUrl;

    @Cacheable
    public int[] getSortedData() throws MalformedURLException, IOException {
        URL url = new URL(randomDataUrl);
        try (InputStream input = url.openStream()) {
            int[] intArrs = new BufferedReader(new InputStreamReader(input)).lines()
                    .parallel()
                    .map(String::valueOf)
                    .map(s -> s.split(","))
                    .flatMap(Arrays::stream)
                    .mapToInt(Integer::valueOf)
                    .sorted()
                    .toArray();
            return intArrs;
        }
    }

}
