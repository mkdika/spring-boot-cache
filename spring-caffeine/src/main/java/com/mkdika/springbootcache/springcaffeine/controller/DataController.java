package com.mkdika.springbootcache.springcaffeine.controller;

import com.mkdika.springbootcache.springcaffeine.service.RandomDataRepository;
import java.io.IOException;
import java.util.stream.IntStream;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
@RestController
public class DataController {
    
    @Autowired
     private RandomDataRepository dataService;
    
    @RequestMapping(method = GET,value = "/data",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getSortedRandomData() throws IOException {    
        long l1 = System.currentTimeMillis();
        int[] arr = dataService.getSortedData();          
        System.out.println(">>> Get sorted data duration: " + (System.currentTimeMillis()-l1) +" msecs");
        return new ResponseEntity(IntStream.of(arr).limit(20),HttpStatus.OK);        
    }    
}