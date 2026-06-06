package com.pm.customerservice.client;

import com.pm.customerservice.client.dto.FraudCheckResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "fraud-check", url = "${app.openfeign-client.urls.fraud}")
@Component
public interface FraudClient {

    @GetMapping("/api/v1/fraud/{customerId}")
    FraudCheckResponseDto isFraudster(@PathVariable("customerId") Long customerId);
}
