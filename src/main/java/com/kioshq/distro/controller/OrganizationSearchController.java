package com.kioshq.distro.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/search/organization")
public class OrganizationSearchController {

	/* The idea is the user will be more interested in distribution lists local to them */
	@GetMapping("/nearby")
	public ResponseEntity<Boolean> getNearbyOrganizations(@RequestParam("lat") double latitude,
			@RequestParam("lng") double longitude) {
		return new ResponseEntity<>(true, HttpStatus.OK);
	}
}
