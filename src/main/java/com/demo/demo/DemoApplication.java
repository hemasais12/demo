package com.demo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

    @Autowired
    private StudentRepo repository;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return repository.save(student);
    }

    @GetMapping("/getData")
    public List<Student> getStudent() {
        return repository.findAll();
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
