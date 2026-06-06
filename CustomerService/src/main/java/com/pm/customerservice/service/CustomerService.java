package com.pm.customerservice.service;

import com.pm.customerservice.dto.CustomerRegistrationRequestDto;
import com.pm.customerservice.model.Customer;
import com.pm.customerservice.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public void registerCustomer(CustomerRegistrationRequestDto customer){
        Customer customer1 = Customer.builder()
                .firstName(customer.firstName())
                .lastName(customer.lastName())
                .email(customer.email())
                .build();

        //todo: check for valid unique email and then store

        customerRepository.save(customer1);
    }
}
