package com.cch.config.security;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JwtAuthenticationFilter extends BasicAuthenticationFilter {

  public JwtAuthenticationFilter(AuthenticationManager authenticationManager) {
    super(authenticationManager);
  }

  @Override
  protected void doFilterInternal(
      HttpServletRequest request, HttpServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    String token = request.getHeader("Authorization");

    if (token == null || !token.startsWith("Bearer ")) {
      chain.doFilter(request, response);
      return;
    }

    token = token.substring(7);
    DecodedJWT decodedJWT = JwtUtils.verifyJWT(token);
    String subject = decodedJWT.getSubject();

    ObjectMapper mapper = new ObjectMapper();
    UsernamePasswordAuthenticationToken authentication =
        mapper.readValue(subject, UsernamePasswordAuthenticationToken.class);

    SecurityContextHolder.getContext().setAuthentication(authentication);
    chain.doFilter(request, response);
  }
}
