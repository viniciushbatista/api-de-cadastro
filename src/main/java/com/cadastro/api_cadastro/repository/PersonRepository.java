package com.cadastro.api_cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.api_cadastro.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
}
