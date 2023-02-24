package com.riccardosennati.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.riccardosennati.app.entity.Edificio;
import com.riccardosennati.app.entity.Postazione;
import com.riccardosennati.app.entity.TipoPostazione;

@Configuration
@PropertySource("classpath:application.properties")
public class PostazioneConfig {
	
	@Bean
    public Postazione pos() {
        Postazione pos = new Postazione();
        return pos;
    }

}
