package com.bms.catalog.controller;

import java.util.List;


import com.bms.catalog.model.MovieCatalogue;
import com.bms.catalog.service.MovieCatalogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class MovieCatalogueController {

	@Autowired
	MovieCatalogueService movieCatalogueService;

	@RolesAllowed("ROLE_AUTHORIZED_USER")
	@GetMapping("/{cityId}/movies")
	public List<MovieCatalogue> getMovies(@PathVariable int cityId) {
		return movieCatalogueService.findByCityId(cityId);
	}


	
}
