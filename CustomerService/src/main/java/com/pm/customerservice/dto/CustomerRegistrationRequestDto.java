package com.pm.customerservice.dto;

public record CustomerRegistrationRequestDto(
    String firstName,
    String lastName,
    String email
){}
