package com.cadastro.api_cadastro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.api_cadastro.entities.Person;
import com.cadastro.api_cadastro.service.PersonService;

@RestController("/person")
public class Controller {

    @Autowired
    private PersonService personService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Person savePerson(@RequestBody Person person){
        return personService.savePerson(person);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Person> listPerson(){
        return personService.listOfPerson();
    }

}
