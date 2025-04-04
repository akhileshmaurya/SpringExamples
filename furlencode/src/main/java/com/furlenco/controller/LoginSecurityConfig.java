package com.furlenco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class LoginSecurityConfig extends WebSecurityConfigurerAdapter {

  @Autowired
  public void configureGlobal(AuthenticationManagerBuilder authenticationMgr) throws Exception {
    authenticationMgr
        .inMemoryAuthentication()
        .withUser("akhilesh")
        .password("12345")
        .authorities("ROLE_USER");
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests()
        .antMatchers("/homePage")
        .access("hasRole('ROLE_USER')")
        .and()
        .formLogin()
        .loginPage("/loginPage")
        .defaultSuccessUrl("/homePage")
        .failureUrl("/loginPage?error")
        .usernameParameter("username")
        .passwordParameter("password")
        .and()
        .logout()
        .logoutSuccessUrl("/loginPage?logout");
  }
}
