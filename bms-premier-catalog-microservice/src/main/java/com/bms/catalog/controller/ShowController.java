package com.bms.catalog.controller;

import com.bms.catalog.model.Show;
import com.bms.catalog.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
public class ShowController {

	@Autowired
	ShowService showService;

	@RolesAllowed("ROLE_AUTHORIZED_USER")
	@GetMapping("/theatres/{theatreId}/shows")
	public  @ResponseBody List<Show> getShows(@PathVariable("theatreId") int theatreId){
		List<Show> shows = showService.findByTheatreId(theatreId);
		return shows;

	}
	
}
