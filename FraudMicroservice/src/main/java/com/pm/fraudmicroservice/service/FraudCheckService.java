package com.pm.fraudmicroservice.service;

import com.pm.fraudmicroservice.model.FraudCheckHistory;
import com.pm.fraudmicroservice.repostiory.FraudHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FraudCheckService {

    private final FraudHistoryRepository fraudHistoryRepository;

    public boolean isFraudster(Long customerId) {
        fraudHistoryRepository.save(
                FraudCheckHistory.builder()
                        .isFraudster(false)
                        .customerId(customerId)
                        .build()
        );

        return false;
    }
}
