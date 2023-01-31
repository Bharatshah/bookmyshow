package com.bms.booking.controller;

import com.bms.booking.SeatBookingDTO;
import com.bms.booking.model.BookingHistory;
import com.bms.booking.repository.BookingServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.security.RolesAllowed;


@RestController
public class BookingController
{
    @Autowired
    private BookingServiceRepository repo;


    @RolesAllowed("ROLE_AUTHORIZED_USER")
    @PostMapping("/booking")
    public BookingHistory book(@RequestBody SeatBookingDTO seatBookingDTO)
    {

        //TODO check in redis that seats are still locked or not?  We will use Redission Library for Distributed Locking

        ResponseEntity<BookingHistory> responseFromDiscountService = new RestTemplate().postForEntity("http://localhost:8086/validateCouponCode", seatBookingDTO, BookingHistory.class);
        //TODO check code is valid or not from above responseFromDiscountService

        ResponseEntity<BookingHistory> responseEntity = new RestTemplate().postForEntity("http://localhost:8085/bookseats", seatBookingDTO, BookingHistory.class);
        BookingHistory bookingHistory = responseEntity.getBody();
        if (bookingHistory != null) {
            repo.save(bookingHistory);
        }
        return bookingHistory;
    }



}
