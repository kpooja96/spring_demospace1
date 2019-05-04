package com.capgemini.service;

import com.capgemini.person.en.Person;

public interface PersonService {

	public void addNew(Person person);

	public Person findById(int i);

}
