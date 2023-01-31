package com.bms.discount.controller;


import com.bms.discount.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class DiscountController {

    @Autowired
    DiscountService discountService;


    @RolesAllowed("ROLE_AUTHORIZED_USER")
    @GetMapping("/fetchCouponCode")
    public Object fetchApplicableDiscounts(@RequestBody Object user)
    {
        return discountService.fetchApplicableDiscounts(user);
    }

    @RolesAllowed("ROLE_AUTHORIZED_USER")
    @PostMapping("/validateCouponCode")
    public Object validateCouponCodes(@RequestBody Object couponCodes)
    {
        return discountService.validateCouponCodes(couponCodes);
    }


}
