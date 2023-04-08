																/*
 -------------------------------------------------------------------
|
| CRUDyLeaf	- A Domain Specific Language for generating Spring Boot 
|			REST resources from entity CRUD operations.
| Author: Omar S. G�mez (2020)
| File Date: Tue Feb 01 15:23:36 ECT 2022
| 
 -------------------------------------------------------------------
																*/
package com.yellowmonkey.biometrico.services;

import com.yellowmonkey.biometrico.RecordNotFoundException;
import com.yellowmonkey.biometrico.entities.personnelEmployee;
import com.yellowmonkey.biometrico.repositories.personnelEmployeeRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class personnelEmployeeService {

	@Autowired
	personnelEmployeeRepository repo;

	public List<personnelEmployee> getAll(){
		List<personnelEmployee> personnelEmployeeList = repo.findAll();
		if(personnelEmployeeList.size() > 0) {
			return personnelEmployeeList;
		} else {
			return new ArrayList<personnelEmployee>();
		}
	}
     		
	public personnelEmployee findById(Long id) throws RecordNotFoundException{
		Optional<personnelEmployee> personnelEmployee = repo.findById(id);
		if(personnelEmployee.isPresent()) {
			return personnelEmployee.get();
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public personnelEmployee createpersonnelEmployee(personnelEmployee personnelEmployee){
		return repo.save(personnelEmployee);
	}

	public personnelEmployee updatepersonnelEmployee(personnelEmployee personnelEmployee) throws RecordNotFoundException {
		Optional<personnelEmployee> personnelEmployeeTemp = repo.findById(personnelEmployee.getId());
	
		if(personnelEmployeeTemp.isPresent()){
			return repo.save(personnelEmployee);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public void deletepersonnelEmployeeById(Long id) throws RecordNotFoundException{
		Optional<personnelEmployee> personnelEmployee = repo.findById(id);
		if(personnelEmployee.isPresent()) {
		repo.deleteById(id);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}		

}
