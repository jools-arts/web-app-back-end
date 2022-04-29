package com.qa.hobbywebapplication.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.hobbywebapplication.dto.FossilSiteDTO;
import com.qa.hobbywebapplication.dto.NewFossilSiteDTO;
import com.qa.hobbywebapplication.service.FossilSiteService;

@RestController
@RequestMapping(path = "/fossilsite")
@CrossOrigin("*")
public class FossilSiteController {
	
	private FossilSiteService fossilSiteService;
	
	@Autowired
	public FossilSiteController (FossilSiteService fossilSiteService) {
		this.fossilSiteService = fossilSiteService;	
	}
	
	@GetMapping
	public ResponseEntity<List<FossilSiteDTO>> getFossilSites() {
		return ResponseEntity.ok(fossilSiteService.getFossilSites());
	}
	
	@GetMapping(path = "/{fossil_site_id}")
	public ResponseEntity<FossilSiteDTO> getFossilSite(@PathVariable(name = "fossil_site_id") int fossilSiteId) {
		FossilSiteDTO fossilSite = fossilSiteService.getFossilSite(fossilSiteId);
		return new ResponseEntity<>(fossilSite, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<FossilSiteDTO> createFossilSite(@Valid @RequestBody NewFossilSiteDTO fossilSite) {
		FossilSiteDTO newFossilSite = fossilSiteService.createFossilSite(fossilSite);
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Location", "http://localhost:8080/fossilSite/" + newFossilSite.getFossilSiteId());
		
		return new ResponseEntity<>(newFossilSite, headers, HttpStatus.CREATED);
	}
	
	@PutMapping(path = "/{fossil_site_id}")
	public ResponseEntity<FossilSiteDTO> updateFossilSite(@RequestBody NewFossilSiteDTO newFossilSiteDTO, @PathVariable(name = "fossil_site_id") int fossilSiteId) {
		return ResponseEntity.ok(fossilSiteService.updateFossilSite(newFossilSiteDTO, fossilSiteId));
	}
	
	@DeleteMapping(path = "/{fossil_site_id}")
	public ResponseEntity<?> deleteFossilSite(@PathVariable(name = "fossil_site_id") int fossilSiteId) {
		FossilSiteDTO deletedFossilSite = fossilSiteService.getFossilSite(fossilSiteId);
		fossilSiteService.deleteFossilSite(fossilSiteId);
		return ResponseEntity.ok(deletedFossilSite);
	}

}
