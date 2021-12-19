/*package com.tutv.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.transaction.annotation.Transactional;

import com.tutv.service.TaiKhoanService;

@Configuration
@EnableWebSecurity
@Transactional
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private TaiKhoanService taikhoanService;
	*//**
	 * configure
	 *
	 * @param auth
	 * @throws Exception
	 *//*
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication().withUser("tvtu165@gmail.com").password("12345").roles("USER");
		auth.inMemoryAuthentication().withUser("tvtu72@wru.vn").password("12345").roles("ADMIN");

		auth.userDetailsService(taikhoanService);
	}

	*//**
	 * configure
	 *
	 * @param http
	 * @throws Exception
	 *//*
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();

		http.authorizeRequests().antMatchers("/", "/login", "/logout").permitAll();

		http.authorizeRequests().antMatchers("/user").access("hasAnyRole('ROLE_USER','ROLE_ADMIN')");

		http.authorizeRequests().antMatchers("/admin").access("hasRole('ROLE_ADMIN')");

		http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");
		
		http.authorizeRequests().and().formLogin().loginProcessingUrl("/formlogin").loginPage("/login").defaultSuccessUrl("/")
		    .failureUrl("/login?error=true")
		    .usernameParameter("email")
		    .passwordParameter("password")
		    .and().logout().logoutUrl("/logout").logoutSuccessUrl("/");

	}
}
//*/