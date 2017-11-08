package com.project.License.repositories;

import com.project.License.models.Person;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository 												
public interface PersonsRepository extends CrudRepository<Person,Long>{
	// Query methods go here.
	List<Person> findAll();
	// Example:
	// public YourModelHere findByName(String name);
}
