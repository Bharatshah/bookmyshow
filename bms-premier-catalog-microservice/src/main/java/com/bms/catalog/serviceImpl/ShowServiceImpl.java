package com.bms.catalog.serviceImpl;

import com.bms.catalog.dao.MovieCatalogueRepository;
import com.bms.catalog.dao.ShowRepository;
import com.bms.catalog.model.MovieCatalogue;
import com.bms.catalog.model.Show;
import com.bms.catalog.service.MovieCatalogueService;
import com.bms.catalog.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowServiceImpl implements ShowService {

	@Autowired
	ShowRepository showRepository;


	@Override
	public List<Show> getShowList(int theatreId) {
		return showRepository.getShowList(theatreId);
	}

	@Override
	public List<Show> findByTheatreId(int theatreId) {
		return showRepository.findByTheatreId(theatreId);
	}
}
