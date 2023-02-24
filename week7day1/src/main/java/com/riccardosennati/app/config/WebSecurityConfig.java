package com.riccardosennati.app.config;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.riccardosennati.app.entity.Ruolo;
import com.riccardosennati.app.entity.Utente;
import com.riccardosennati.app.service.UserDetailsImplService;
import com.riccardosennati.app.service.UtenteService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		
		http.authorizeRequests()
		.antMatchers("/auth_update_user_pw", "/edifici")
		.permitAll()
		.anyRequest()
		.authenticated()
		.and().formLogin()
		.successForwardUrl("/login_success")
		.and()
		.logout()
		.and()
		.csrf()
		.disable();
	}

	
	@Autowired
	private UserDetailsImplService us;
	
	@Override
	protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
		auth
			.userDetailsService(us)
			.passwordEncoder( passwordEncoder() );
	}
	

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
