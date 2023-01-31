package com.bms.booking.controller;

import com.bms.booking.SeatBookingDTO;
import com.bms.booking.model.BookingHistory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class SeatReservationController
{
    @RolesAllowed("ROLE_AUTHORIZED_USER")
    @PostMapping("/reserveSeats")
    public BookingHistory book(@RequestBody SeatBookingDTO seatBookingDTO)
    {
       // USE REDIS Semaphore Library to Lock the Seats for 10 minutes
       //Once the seats are locked user can book seats

        return null;
    }

}
