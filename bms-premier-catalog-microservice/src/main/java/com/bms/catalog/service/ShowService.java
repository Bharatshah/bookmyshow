package com.bms.catalog.service;
import com.bms.catalog.model.Show;

import java.util.List;

public interface ShowService {

	public List<Show> getShowList(int theatreId);

	List<Show> findByTheatreId(int theatreId);
}
