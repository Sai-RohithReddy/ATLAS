package com.atlas.dynamodb.contorller;

import java.util.List;
import com.atlas.dynamodb.entity.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atlas.dynamodb.repository.PersonRepo;

@RequestMapping("/persons")
@RestController
public class PersonController {

    @Autowired
    private PersonRepo personRepository;

    @GetMapping
    public List<Person> findAll() {
        return personRepository.findAll();
    }

}
