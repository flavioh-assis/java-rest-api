package com.flavio.javarestapi.repository;

import com.flavio.javarestapi.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
