package com.project.License.services;

import java.util.ArrayList;
import java.util.List;

// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.project.License.models.Person;
import com.project.License.repositories.PersonsRepository;

@Service
public class PersonsService {	
// Member variables / service initializations go here
	private PersonsRepository personsRepository;
	public PersonsService(PersonsRepository personsRepository) {
		this.personsRepository = personsRepository;
	}

// Crud methods to act on services go here.
	public List<Person> allPersons() {
		return personsRepository.findAll();
	}
	public void addPerson(Person person) {
		personsRepository.save(person);
	}
	public Person findPersonById(Long id) {
		return personsRepository.findOne(id);
	}
}
