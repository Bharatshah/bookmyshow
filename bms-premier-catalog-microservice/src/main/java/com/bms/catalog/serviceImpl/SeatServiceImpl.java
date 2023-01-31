package com.bms.catalog.serviceImpl;

import com.bms.catalog.dao.SeatRepository;
import com.bms.catalog.dao.ShowRepository;
import com.bms.catalog.model.Seat;
import com.bms.catalog.model.Show;
import com.bms.catalog.service.SeatService;
import com.bms.catalog.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatServiceImpl implements SeatService {

	@Autowired
	SeatRepository seatRepository;


	@Override
	public List<Seat> findByShowIdAndSeatNameIn(int showId, List<String> seatNumbers) {
		return seatRepository.findByShowIdAndSeatNameIn(showId, seatNumbers);
	}
}
