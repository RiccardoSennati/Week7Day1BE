package com.riccardosennati.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riccardosennati.app.entity.Edificio;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, Integer>{

}
