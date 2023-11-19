package com.example.jspboard.config.secure;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  private final LoginSuccessHandler loginSuccessHandler;
  private final LoginFailureHandler loginFailureHandler;
  private final LogoutSuccess logoutSuccess;
  private final AccessDenyHandler accessDenyHandler;

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests()
        .antMatchers("/", "/home", "/comm/**", "/css/**", "/js/**", "/docs/**", "/secure/login", "/member/insert", "/member/insert_exe").permitAll()
        .antMatchers("/study/**").hasAnyRole("MEMBER", "ADMIN")
        .antMatchers("/member/memberList").hasRole("ADMIN")
        .anyRequest().authenticated();

    http.formLogin()
        .loginPage("/secure/login")
        .loginProcessingUrl("/secure/login_exe")
        .successHandler(loginSuccessHandler)
        .failureHandler(loginFailureHandler)
        .permitAll();

    http.logout()
        .logoutSuccessHandler(logoutSuccess)
        .permitAll();

    http.exceptionHandling()
        .accessDeniedHandler(accessDenyHandler);

    http.csrf()
        .disable();
  }
}