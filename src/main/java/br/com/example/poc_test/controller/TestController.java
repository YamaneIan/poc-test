package br.com.example.poc_test.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public ResponseEntity<String> getTest() {
        return ResponseEntity.ok("Oi! Ola Mundo Novo!!!!");
    }
}
