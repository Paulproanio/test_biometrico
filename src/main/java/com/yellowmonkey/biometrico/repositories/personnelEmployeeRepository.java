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
package com.yellowmonkey.biometrico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yellowmonkey.biometrico.entities.personnelEmployee;

import java.util.Optional;

@Repository
public interface personnelEmployeeRepository extends JpaRepository<personnelEmployee, Long> {

	Optional <personnelEmployee> findById(Long id);
	
	void deleteById(Long id);
	
}
