package com.riccardosennati.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riccardosennati.app.entity.Ruolo;

@Repository
public interface RuoloRepository extends JpaRepository<Ruolo, Integer>{

}
