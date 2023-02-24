package com.riccardosennati.app.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.riccardosennati.app.entity.Edificio;
import com.riccardosennati.app.entity.Postazione;
import com.riccardosennati.app.entity.Prenotazione;
import com.riccardosennati.app.entity.Utente;

@Configuration
@PropertySource("classpath:application.properties")
public class EdificioConfig {
	
	
	@Bean
    public Edificio e() {
        Edificio e = new Edificio();
        return e;
    }

}
