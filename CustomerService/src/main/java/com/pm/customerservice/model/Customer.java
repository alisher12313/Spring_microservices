package com.pm.customerservice.model;

import lombok.*;

@Getter
@Setter
@Builder
public class Customer {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
