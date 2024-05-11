package com.example.werks.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.example.werks.services.UserServiceImpl;



@Configuration
@EnableWebSecurity
public class WebSecurityConf {
		
	
	@Autowired
	private CustomSecurityHandler customSecurityHandler;
	
	
	@Bean 
	public BCryptPasswordEncoder passwordEncoder() { 
		return new BCryptPasswordEncoder(); 
	}
	
	@Bean 
	public UserDetailsService userDetailsService() { 
		 return new UserServiceImpl(); 
	}
	
	@Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();

        authProvider.setUserDetailsService(userDetailsService());
        authProvider.setPasswordEncoder(passwordEncoder());

        return authProvider;
    }
	
	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(authz -> authz
                .requestMatchers("/", "/index.html", "/signin", "/signup","/hello2.html", "/save").permitAll()  // Allow specific paths
                .anyRequest().authenticated()  // Require authentication for all other requests
            )
            .formLogin(formLogin -> formLogin
                    .loginPage("/signin")  // Specify the custom login page
                    .failureUrl("/signin?error=true")
                    .successHandler(customSecurityHandler)
                    .usernameParameter("username")
                    .passwordParameter("password")
                    //.defaultSuccessUrl("/kristari", true)  // Redirect to home after login
                    //.permitAll()  // Allow access to login page without authentication
                )
            .logout(logout -> logout
            		.logoutUrl("/logout")
            		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
            		.logoutSuccessUrl("/")
            		
            );
        
        http.authenticationProvider(authenticationProvider());

        return http.build();
    }

}