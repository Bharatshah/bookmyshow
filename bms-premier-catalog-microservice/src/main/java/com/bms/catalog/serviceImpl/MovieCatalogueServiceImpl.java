package com.bms.catalog.serviceImpl;

import com.bms.catalog.dao.MovieCatalogueRepository;
import com.bms.catalog.model.MovieCatalogue;
import com.bms.catalog.service.MovieCatalogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieCatalogueServiceImpl implements MovieCatalogueService {

	@Autowired
	MovieCatalogueRepository movieCatalogueRepository;

	public List<MovieCatalogue> findByCityId(int cityId) {
		return movieCatalogueRepository.findByCityId(cityId);
	}
}
