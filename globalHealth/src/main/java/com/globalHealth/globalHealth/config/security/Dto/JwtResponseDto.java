package com.globalHealth.globalHealth.config.security.Dto;

import lombok.Getter;

@Getter
public class JwtResponseDto {
  private final String token;

  public JwtResponseDto(String jwttoken) {
    this.token = jwttoken;
  }
}