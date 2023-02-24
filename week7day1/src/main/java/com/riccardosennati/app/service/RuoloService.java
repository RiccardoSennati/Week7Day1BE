package com.riccardosennati.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riccardosennati.app.entity.Ruolo;
import com.riccardosennati.app.repository.RuoloRepository;

@Service
public class RuoloService {

	@Autowired
	RuoloRepository rr;
	
	public Ruolo insertRuolo(Ruolo r) {
        return rr.save(r);
    }
	

}
