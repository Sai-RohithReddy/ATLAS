package com.atlas.dynamodb.contorller;

import java.util.List;
import com.atlas.dynamodb.entity.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("/{id}")
    public Person findById(@PathVariable(value = "id") String id) {
        return personRepository.findById(id);
    }

    @PostMapping
    public Person save(@RequestBody Person person) {
        return personRepository.save(person);
    }

    @PutMapping("/{id}")
    public String update(@PathVariable(value = "id") String id, @RequestBody Person person) {
        return personRepository.update(id, person);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable(value = "id") String id) {
        return personRepository.delete(id);
    }

}
