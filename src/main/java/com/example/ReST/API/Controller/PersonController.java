package com.example.ReST.API.Controller;

import com.example.ReST.API.Model.Person;
import com.example.ReST.API.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("api/v1/test")
    public String test() {
        personRepository.save(new Person("John", "Wick"));
        return "ok";
    }
}
