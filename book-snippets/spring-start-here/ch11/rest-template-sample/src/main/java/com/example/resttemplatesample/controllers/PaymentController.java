package com.example.resttemplatesample.controllers;

import com.example.resttemplatesample.entities.Payment;
import com.example.resttemplatesample.proxies.PaymentsProxy;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class PaymentController {

    private final PaymentsProxy paymentsProxy;

    public PaymentController(PaymentsProxy paymentsProxy) {
        this.paymentsProxy = paymentsProxy;
    }


//    @RequestMapping(name = "/payment", method = RequestMethod.POST)
    @PostMapping("/payment")
    public Payment createPayment(@RequestBody Payment payment) {
        return paymentsProxy.createPayment(payment);
    }
}
