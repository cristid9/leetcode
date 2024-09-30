package com.example.sample1mvn.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class TransferRequest {
    private long senderAccountId;
    private long receiverAccountId;
    private BigDecimal amount;
}
