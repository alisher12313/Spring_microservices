package com.pm.customerservice.service;

import com.pm.customerservice.dto.CustomerRegistrationRequestDto;
import com.pm.customerservice.model.Customer;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CustomerService {
    public void registerCustomer(CustomerRegistrationRequestDto customer){
        Customer customer1 = Customer.builder()
                .firstName(customer.firstName())
                .lastName(customer.lastName())
                .email(customer.email())
                .build();

        //todo: check for valid unique email and then store
    }
}
