package com.bms.catalog.service;

import com.bms.catalog.model.MovieCatalogue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieCatalogueService {

	public List<MovieCatalogue> findByCityId(int cityId);
}
