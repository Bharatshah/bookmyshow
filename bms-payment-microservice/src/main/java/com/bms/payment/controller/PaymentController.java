package com.bms.payment.controller;


import com.bms.payment.service.AdyenPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
public class PaymentController {

    @Autowired
    AdyenPaymentService adyenPaymentService;


    @RolesAllowed("ROLE_AUTHORIZED_USER")
    @PostMapping("/authorize")
    public Object authorize(@RequestBody Object paymentObj)
    {
        return adyenPaymentService.authorize(paymentObj);
    }

    @RolesAllowed("ROLE_AUTHORIZED_USER")
    @PostMapping("/makePayment")
    public Object makePayment(@RequestBody Object paymentObj)
    {
        return adyenPaymentService.makePayment(paymentObj);
    }
}
