package com.bms.catalog.controller;

import com.bms.catalog.dto.BookingDetailsDTO;
import com.bms.catalog.dto.SeatInfoDTO;
import com.bms.catalog.dao.SeatRepository;
import com.bms.catalog.model.Seat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
public class SeatController {

    @Autowired
    SeatRepository seatRepository;


    @RolesAllowed("ROLE_AUTHORIZED_USER")
    @PostMapping("/bookseats")
    public BookingDetailsDTO bookSeats(@RequestBody SeatInfoDTO seatInfoDTO)
    {
        List<Seat> selectedSeats = seatRepository.findByShowIdAndSeatNameIn(seatInfoDTO.getShowId(), seatInfoDTO.getSelectedSeats());
        if (selectedSeats.stream().anyMatch(seat -> seat.getStatus() != 0)) {
            return null;
        }
        double totalCost = selectedSeats.stream().mapToDouble(seat -> seat.getPrice()).sum();
        selectedSeats.stream().forEach(seat -> seat.setStatus(1));
        selectedSeats.stream().forEach(seat -> seatRepository.save(seat));
        BookingDetailsDTO bookingDetails = new BookingDetailsDTO(seatInfoDTO.getShowId(), "test user", totalCost, java.time.LocalDateTime.now(), selectedSeats.size());
        return bookingDetails;


    }
}
