package com.bms.catalog.dao;

import java.util.List;

import com.bms.catalog.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SeatRepository extends JpaRepository<Seat, Integer>
{
    public List<Seat> findByShowIdAndSeatNameIn(int showId, List<String> seatNumbers);

}
