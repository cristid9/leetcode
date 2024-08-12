package com.example.sshch11s1.controller;

import com.example.sshch11s1.entities.Payment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.logging.Logger;

@RestController
public class PaymentsController {

    private final Logger logger = Logger.getLogger(PaymentsController.class.getName());

    @PostMapping("/payment")
    public ResponseEntity<Payment> createPayment(
            @RequestHeader String requestId,
            @RequestBody Payment payment) {

        logger.info("Received request" + requestId + ": " + payment.getAmount());

        payment.setId(UUID.randomUUID().toString());

        return ResponseEntity
                .ok()
                .header("requestId", requestId)
                .body(payment);
    }

}
