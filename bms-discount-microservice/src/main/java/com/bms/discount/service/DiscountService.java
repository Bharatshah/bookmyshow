package com.bms.discount.service;


public interface DiscountService {


    Object fetchApplicableDiscounts(Object user);

    Object validateCouponCodes(Object couponCodes);
}
