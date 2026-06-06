package com.pm.fraudmicroservice.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "fraud_history")
public class FraudCheckHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fraud_id_sequence")
    @SequenceGenerator(name = "fraud_id_sequence", sequenceName = "fraud_id_sequence", allocationSize = 1)
    @Column(nullable = false)
    @JdbcTypeCode(SqlTypes.BIGINT)
    private Long id;

    @Column(nullable = false)
    private Long customerId;

    @Column(nullable = false)
    private Boolean isFraudster;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
