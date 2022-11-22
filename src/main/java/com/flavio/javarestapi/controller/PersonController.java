package com.flavio.javarestapi.controller;

import com.flavio.javarestapi.model.Person;
import com.flavio.javarestapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/persons")

@RestController
public class PersonController {

    @Autowired
    private PersonRepository repository;

    @GetMapping("{id}")
    public ResponseEntity get(@PathVariable("id") Integer id) {
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping()
    public Person post(@RequestBody Person person) {
        return repository.save(person);
    }
}
