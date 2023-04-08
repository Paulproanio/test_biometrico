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
package com.yellowmonkey.biometrico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.yellowmonkey.biometrico.entities.iclockTransaction;
import java.util.List;
import java.util.Optional;

@Repository
public interface iclockTransactionRepository extends JpaRepository<iclockTransaction, Long> {

	Optional<iclockTransaction> findById(Long id);

	void deleteById(Long id);

	@Query(value = "select * from iclock_transaction it inner join personnel_employee pe\r\n"
			+ "on it.emp_id = pe.id\r\n"
			+ "where   CAST( punch_time AS Text) >= ?1 and CAST( punch_time AS Text) <= ?2 and pe.last_name = ?3 order by  punch_time DESC ", nativeQuery = true)
	List<iclockTransaction> findByFechaInicialAndFechaFinalAndCedula(String fechaInicial, String fechaFinal,
			String cedula);

	@Query(value = "select * from iclock_transaction where CAST( punch_time AS Text) >= ?1", nativeQuery = true)
	List<iclockTransaction> findByPunchTime(String fechaInicial);

}
