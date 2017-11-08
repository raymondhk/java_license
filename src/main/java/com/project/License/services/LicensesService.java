package com.project.License.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.project.License.models.License;
import com.project.License.repositories.LicensesRepository;

@Service
public class LicensesService {
	// Member variables / service initializations go here
	private LicensesRepository licensesRepository;	
	public LicensesService(LicensesRepository licensesRepository){
		this.licensesRepository = licensesRepository;
	}
	public void addLicense(License license) {
		licensesRepository.save(license);
	}
	// Crud methods to act on services go here.
}
