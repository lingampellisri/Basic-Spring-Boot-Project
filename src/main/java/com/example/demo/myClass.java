package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myClass {

    @Autowired
    private  Dog dog;

    @GetMapping("/ok")
    public  String ok()
    {
      return dog.fun()+" -Srinivas Lingampelli";
    }


    @GetMapping("welcome")
public String sayHello()
{
    return "<h1>Hello Spring Boot Tutorial  Iam Happy for this</h1>" +
            "<Input type='text' placeholder='Enter name' />";
}

}
