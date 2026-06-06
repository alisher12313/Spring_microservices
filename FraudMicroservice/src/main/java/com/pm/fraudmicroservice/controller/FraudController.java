package com.pm.fraudmicroservice.controller;

import com.pm.fraudmicroservice.dto.FraudCheckResponseDto;
import com.pm.fraudmicroservice.service.FraudCheckService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/fraud")
@RequiredArgsConstructor
@Slf4j
public class FraudController {

    private final FraudCheckService service;

    @GetMapping("/{customerId}")
    public FraudCheckResponseDto isFraudster(@PathVariable("customerId") Long customerId) {
        boolean isFraud = service.isFraudster(customerId);

        log.info("Fraud check request for customer with id: {}", customerId);

        return new FraudCheckResponseDto(isFraud);
    }
}
