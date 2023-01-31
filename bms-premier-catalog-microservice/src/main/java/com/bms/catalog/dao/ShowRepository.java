package com.bms.catalog.dao;

import java.util.List;

import com.bms.catalog.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ShowRepository extends JpaRepository<Show, Long>{
	
	@Query(" select showId, theatreId, showDateTime, totalSeats, availableSeats from Show s where s.theatreId = :theatreId")
	public List<Show> getShowList(@Param("theatreId") int theatreId);

	public List<Show> findByTheatreId(int theatreId);

}
