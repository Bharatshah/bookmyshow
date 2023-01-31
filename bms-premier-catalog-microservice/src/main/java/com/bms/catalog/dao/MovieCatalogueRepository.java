package com.bms.catalog.dao;

import java.util.List;

import com.bms.catalog.model.MovieCatalogue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieCatalogueRepository extends JpaRepository<MovieCatalogue, Integer> {

	public List<MovieCatalogue> findByCityId(int cityId);
}
