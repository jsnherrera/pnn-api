package com.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.api.model.Pnn;

@Repository
public interface IPnnRepo extends JpaRepository<Pnn, Integer> {

	@Query("SELECT p FROM Pnn p where ?1 between p.nir||p.serie||p.numeracion_inicial and p.nir||p.serie||p.numeracion_final")
	public List<Pnn> findAllSubscribersByNumber(String number);

}
