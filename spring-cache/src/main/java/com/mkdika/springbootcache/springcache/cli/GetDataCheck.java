package com.mkdika.springbootcache.springcache.cli;

import com.mkdika.springbootcache.springcache.service.RandomDataRepository;
import java.util.stream.IntStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
@Component
public class GetDataCheck implements CommandLineRunner {
    
    @Autowired
    private RandomDataRepository repository;

    @Override
    public void run(String... args) throws Exception {
//        long l1 = System.currentTimeMillis();
//        int[] arr = repository.getSortedData();
//        System.out.println("Sorted array length: " + arr.length);
//        IntStream.of(arr).limit(20).forEach(i -> System.out.print(i + " "));
//        System.out.println("\nProcess time: " + (System.currentTimeMillis() - l1) + " msecs.");
    }

}
