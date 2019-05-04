package com.capgemini.person.controller;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.person.en.Person;



@Repository
public interface PersonDao extends JpaRepository<Person, Integer> {

}
