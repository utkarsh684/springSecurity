package com.example.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping("/hello")    
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("hello");
    }

     @GetMapping("/goodbye")
     public ResponseEntity<String> getMethodName() {
         return ResponseEntity.ok("goodbye");
     }
     

}
