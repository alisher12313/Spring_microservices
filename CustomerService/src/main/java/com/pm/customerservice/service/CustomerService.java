package com.pm.customerservice.service;

import com.pm.customerservice.client.FraudClient;
import com.pm.customerservice.client.dto.FraudCheckResponseDto;
import com.pm.customerservice.dto.CustomerRegistrationRequestDto;
import com.pm.customerservice.model.Customer;
import com.pm.customerservice.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final FraudClient fraudClient;

    public void registerCustomer(CustomerRegistrationRequestDto customer){
        Customer customer1 = Customer.builder()
                .firstName(customer.firstName())
                .lastName(customer.lastName())
                .email(customer.email())
                .build();

        //todo: check for valid unique email and then store
        customerRepository.saveAndFlush(customer1);
        log.info("Customer registered: " + customer1 + ". Checking for fraud...");
        FraudCheckResponseDto fraudster = fraudClient.isFraudster(customer1.getId());

        if(fraudster.isFraudster()){
            throw new IllegalArgumentException("Fraudster detected");
        }
    }
}
