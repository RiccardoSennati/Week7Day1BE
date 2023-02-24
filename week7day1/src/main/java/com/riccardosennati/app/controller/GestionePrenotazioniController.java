package com.riccardosennati.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.riccardosennati.app.service.GestionePrenotazioniService;

@Controller
public class GestionePrenotazioniController {

	@Autowired
	GestionePrenotazioniService prenotazioniSrv;
	
	@GetMapping("/istruzioni/{lingua}")
	@ResponseBody
	public String istruzioni(@PathVariable String lingua) {
		return prenotazioniSrv.informativa(lingua);
	}
}
