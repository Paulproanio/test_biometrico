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
package com.yellowmonkey.biometrico.controllers;

import com.yellowmonkey.biometrico.RecordNotFoundException;
import com.yellowmonkey.biometrico.entities.personnelEmployee;
import com.yellowmonkey.biometrico.services.personnelEmployeeService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;	
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api/bio")
public class personnelEmployeeController {
	@Autowired
	personnelEmployeeService service;
	
	@GetMapping("/personnelEmployee")
	public ResponseEntity<List<personnelEmployee>> getAll() {
		List<personnelEmployee> list = service.getAll();
		return new ResponseEntity<List<personnelEmployee>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/personnelEmployee/{id}")
	public ResponseEntity<personnelEmployee> getpersonnelEmployeeById(@PathVariable("id") Long id) throws RecordNotFoundException {
		personnelEmployee entity = service.findById(id);
		return new ResponseEntity<personnelEmployee>(entity, new HttpHeaders(), HttpStatus.OK);
	}



	@PostMapping("/personnelEmployee")
	public ResponseEntity<personnelEmployee> createpersonnelEmployee(@RequestBody personnelEmployee personnelEmployee){
		service.createpersonnelEmployee(personnelEmployee);
		return new ResponseEntity<personnelEmployee>(personnelEmployee, new HttpHeaders(), HttpStatus.OK);
	}

	@PutMapping("/personnelEmployee")
	public ResponseEntity<personnelEmployee> updatepersonnelEmployee(@RequestBody personnelEmployee personnelEmployee) throws RecordNotFoundException{
		service.updatepersonnelEmployee(personnelEmployee);
		return new ResponseEntity<personnelEmployee>(personnelEmployee, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/personnelEmployee/{id}")
	public HttpStatus deletepersonnelEmployeeById(@PathVariable("id") Long id) throws RecordNotFoundException {
		service.deletepersonnelEmployeeById(id);
		return HttpStatus.OK;
	}
}				
