package com.cch.config.security;

import com.cch.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;

public class JwtLoginFilter extends UsernamePasswordAuthenticationFilter {

  private final AuthenticationManager authenticationManager;

  public JwtLoginFilter(AuthenticationManager authenticationManager) {
    super.setFilterProcessesUrl("/auth/login");
    this.authenticationManager = authenticationManager;
  }

  @Override
  public Authentication attemptAuthentication(
      HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
    try {
      User user = new ObjectMapper().readValue(request.getInputStream(), User.class);
      return this.authenticationManager.authenticate(
          new UsernamePasswordAuthenticationToken(user.getUserName(), user.getUserPassword(), Collections.emptyList()));
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  protected void successfulAuthentication(
      HttpServletRequest request,
      HttpServletResponse response,
      FilterChain chain,
      Authentication authResult)
      throws IOException, ServletException {
    ObjectMapper mapper = new ObjectMapper();
    String userString = mapper.writeValueAsString(authResult.getPrincipal());
    String token = JwtUtils.generateJWT(userString);
    response.setCharacterEncoding("UTF-8");
    response.setContentType("application/json; charset=utf-8");
    response.setHeader("Authorization", "Bearer " + token);
    response.getWriter().write(userString);
  }

  @Override
  protected void unsuccessfulAuthentication(
      HttpServletRequest request, HttpServletResponse response, AuthenticationException failed)
      throws IOException, ServletException {
    // super.unsuccessfulAuthentication(request, response, failed);
    response.getWriter().write("Authentication failed: " + failed.getMessage());
  }
}
