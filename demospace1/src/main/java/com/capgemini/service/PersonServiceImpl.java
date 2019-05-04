package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.Person;
import com.capgemini.person.controller.PersonDao;

@RestController
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao personDao;

	@Override
	public void addNew(Person person) {
		personDao.save(person);
	}

	@Override
	public Person findById(int pid) {
		Person person = personDao.findById(pid).get();
		return person;
	}

}
