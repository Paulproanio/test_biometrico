/*
-------------------------------------------------------------------
|
| CRUDyLeaf	- A Domain Specific Language for generating Spring Boot 
|			REST resources from entity CRUD operations.
| Author: Omar S. Gómez (2020)
| File Date: Thu Dec 01 15:44:28 ECT 2022
| 
-------------------------------------------------------------------
*/
package com.yellowmonkey.biometrico.controllers;

import com.yellowmonkey.biometrico.RecordNotFoundException;
import com.yellowmonkey.biometrico.entities.iclockTransaction;
import com.yellowmonkey.biometrico.services.iclockTransactionService;

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
@CrossOrigin(origins = "*")
@RequestMapping("/api/bio")
public class iclockTransactionController {
	@Autowired
	iclockTransactionService service;

	@GetMapping("/iclockTransaction")
	public ResponseEntity<List<iclockTransaction>> getAll() {
		List<iclockTransaction> list = service.getAll();
		return new ResponseEntity<List<iclockTransaction>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/iclockTransaction/{id}")
	public ResponseEntity<iclockTransaction> geticlockTransactionById(@PathVariable("id") Long id)
			throws RecordNotFoundException {
		iclockTransaction entity = service.findById(id);
		return new ResponseEntity<iclockTransaction>(entity, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping("/iclockTransaction")
	public ResponseEntity<iclockTransaction> createiclockTransaction(@RequestBody iclockTransaction iclockTransaction) {
		service.createiclockTransaction(iclockTransaction);
		return new ResponseEntity<iclockTransaction>(iclockTransaction, new HttpHeaders(), HttpStatus.OK);
	}

	@PutMapping("/iclockTransaction")
	public ResponseEntity<iclockTransaction> updateiclockTransaction(@RequestBody iclockTransaction iclockTransaction)
			throws RecordNotFoundException {
		service.updateiclockTransaction(iclockTransaction);
		return new ResponseEntity<iclockTransaction>(iclockTransaction, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/iclockTransaction/{id}")
	public HttpStatus deleteiclockTransactionById(@PathVariable("id") Long id) throws RecordNotFoundException {
		service.deleteiclockTransactionById(id);
		return HttpStatus.OK;
	}
	
	@GetMapping("/iclockTransaction/bxfiffc/{fechaInicial}/{fechaFinal}/{cedula}")
	public ResponseEntity<List<iclockTransaction>> getByFechaInicialAndFechaFinalAndCedula(@PathVariable String fechaInicial,@PathVariable String fechaFinal,@PathVariable String cedula) throws RecordNotFoundException{
		List<iclockTransaction> lista = service.findByFechaInicialAndFechaFinalAndCedula(fechaInicial,fechaFinal,cedula);
		return new ResponseEntity<List<iclockTransaction>>(lista , new HttpHeaders(),HttpStatus.OK);
	}
	
	@GetMapping("/iclockTransaction/bxfi/{fechaInicial}")
	public ResponseEntity<List<iclockTransaction>> getByPunchTime(@PathVariable String fechaInicial) throws RecordNotFoundException{
		List<iclockTransaction> lista = service.findByPunchTime(fechaInicial);
		return new ResponseEntity<List<iclockTransaction>>(lista , new HttpHeaders(),HttpStatus.OK);
	}
}
