package com.example.sshch10sample.service;

import com.example.sshch10sample.exceptions.NotEnoughMoneyException;
import com.example.sshch10sample.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
