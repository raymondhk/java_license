package com.project.License.repositories;

import com.project.License.models.License;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository 												
public interface LicensesRepository extends CrudRepository<License,Long>{
	// Query methods go here.
	
	// Example:
	// public YourModelHere findByName(String name);
}
