package com.riccardosennati.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.riccardosennati.app.entity.Ruolo;

@Configuration
public class RuoloConfig {

	@Bean
    public Ruolo r() {
        Ruolo r = new Ruolo();
        return r;
    }
}
