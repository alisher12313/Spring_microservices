package com.pm.fraudmicroservice.repostiory;

import com.pm.fraudmicroservice.model.FraudCheckHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FraudHistoryRepository extends JpaRepository<FraudCheckHistory, Long> {
}
