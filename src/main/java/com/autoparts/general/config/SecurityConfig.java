package com.autoparts.general.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

   /* @Bean
    public SecurityFilterChain configure(HttpSecurity httpSecurity) throws Exception {
        // TODO: 26.11.2022 This thing is temporary
        return httpSecurity
                .csrf(csrf -> csrf.disable())
                .authorizeRequests(auth -> {
                    auth.antMatchers("/").permitAll();
                    auth.antMatchers("/user").hasRole("REGULAR_USER");
                    auth.antMatchers("admin").hasRole("ADMIN");
                })
                .formLogin()
                .loginPage("/login-form")
                .loginProcessingUrl()
                .httpBasic(Customizer.withDefaults())
                .build();
    }*/

}
