package com.cadastro.api_cadastro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastro.api_cadastro.entities.Person;
import com.cadastro.api_cadastro.repository.PersonRepository;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person savePerson(Person person){
        return personRepository.save(person);
    }

    public List<Person> listOfPerson(){
        return personRepository.findAll();
    }

    public Optional<Person> listById(Long id){
        return personRepository.findById(id);
    }

    public void removePersonByid(Long id){
        personRepository.deleteById(id);
    }

}
