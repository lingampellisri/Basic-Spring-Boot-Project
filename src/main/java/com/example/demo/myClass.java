package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myClass {

    @GetMapping("welcome")
public String sayHello()
{
    return "<h1>Hello Spring Boot Tutorial  Iam Happy for this</h1>";
}

}
