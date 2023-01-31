package com.bms.booking.repository;

import com.bms.booking.model.BookingHistory;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookingServiceRepository extends JpaRepository<BookingHistory, Integer>
{

}
