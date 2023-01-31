package com.bms.catalog.service;
import com.bms.catalog.model.Seat;

import java.util.List;

public interface SeatService {

	public List<Seat> findByShowIdAndSeatNameIn(int showId, List<String> seatNumbers);
}
