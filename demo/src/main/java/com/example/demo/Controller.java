package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/name")
public class Controller {
    @GetMapping(path = "{Name}")
    public String getStudents(@PathVariable("Name") String name) {
        return "Hello " + name;
    }
}
