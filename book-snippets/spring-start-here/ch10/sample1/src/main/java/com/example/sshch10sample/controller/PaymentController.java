package com.example.sshch10sample.controller;

import com.example.sshch10sample.errors.ErrorDetails;
import com.example.sshch10sample.exceptions.NotEnoughMoneyException;
import com.example.sshch10sample.model.PaymentDetails;
import com.example.sshch10sample.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class PaymentController {

    private final PaymentService paymentService;
    private final Logger logger = Logger.getLogger(PaymentController.class.getName());

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<?> makePayment(@RequestBody PaymentDetails paymentDetails) {
//            PaymentDetails paymentDetails = paymentService.processPayment();

            logger.info("payment details: " + paymentDetails.getAmount());
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(paymentDetails);
    }
}
