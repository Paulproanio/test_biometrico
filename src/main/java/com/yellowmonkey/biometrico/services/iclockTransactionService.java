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
package com.yellowmonkey.biometrico.services;

import com.yellowmonkey.biometrico.RecordNotFoundException;
import com.yellowmonkey.biometrico.entities.iclockTransaction;
import com.yellowmonkey.biometrico.repositories.iclockTransactionRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class iclockTransactionService {

	@Autowired
	iclockTransactionRepository repo;

	public List<iclockTransaction> getAll(){
		List<iclockTransaction> iclockTransactionList = repo.findAll();
		if(iclockTransactionList.size() > 0) {
			return iclockTransactionList;
		} else {
			return new ArrayList<iclockTransaction>();
		}
	}
     		
	public iclockTransaction findById(Long id) throws RecordNotFoundException{
		Optional<iclockTransaction> iclockTransaction = repo.findById(id);
		if(iclockTransaction.isPresent()) {
			return iclockTransaction.get();
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public iclockTransaction createiclockTransaction(iclockTransaction iclockTransaction){
		return repo.save(iclockTransaction);
	}

	public iclockTransaction updateiclockTransaction(iclockTransaction iclockTransaction) throws RecordNotFoundException {
		Optional<iclockTransaction> iclockTransactionTemp = repo.findById(iclockTransaction.getId());
	
		if(iclockTransactionTemp.isPresent()){
			return repo.save(iclockTransaction);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public void deleteiclockTransactionById(Long id) throws RecordNotFoundException{
		Optional<iclockTransaction> iclockTransaction = repo.findById(id);
		if(iclockTransaction.isPresent()) {
		repo.deleteById(id);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}
	
	public List<iclockTransaction>findByFechaInicialAndFechaFinalAndCedula(String fechaInicial, String fechaFinal, String cedula)throws RecordNotFoundException{
		List<iclockTransaction> lista= repo.findByFechaInicialAndFechaFinalAndCedula(fechaInicial, fechaFinal, cedula );
		
		if (lista.size()>0) {
			return lista;
		} else {
			return new ArrayList<iclockTransaction>();
		}
	}
	
	public List<iclockTransaction>findByPunchTime(String fechaInicial)throws RecordNotFoundException{
		List<iclockTransaction> lista= repo.findByPunchTime(fechaInicial );
		if (lista.size()>0) {
			return lista;
		} else {
			return new ArrayList<iclockTransaction>();
		}
	}
}
