package com.riccardosennati.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riccardosennati.app.entity.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Integer>{
	
	Optional<Utente> findByUsername(String username);


}
