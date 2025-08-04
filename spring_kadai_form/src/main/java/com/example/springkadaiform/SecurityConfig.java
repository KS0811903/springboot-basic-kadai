package com.example.springkadaiform;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;


public class SecurityConfig {
	
	  @Bean
	    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	        http
	          .authorizeHttpRequests(authorize -> authorize
	              .requestMatchers("/form", "/confirm").permitAll()
	              .anyRequest().authenticated()
	          )
	          .formLogin(form -> form
	              .loginPage("/login").permitAll()
	          );
	        return http.build();
	    }

}
