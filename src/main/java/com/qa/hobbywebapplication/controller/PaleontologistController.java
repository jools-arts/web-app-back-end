package com.qa.hobbywebapplication.controller;

import java.net.http.HttpHeaders;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.qa.hobbywebapplication.dto.NewPaleontologistDTO;
import com.qa.hobbywebapplication.dto.PaleontologistDTO;
import com.qa.hobbywebapplication.service.PaleontologistService;

@RestController
@RequestMapping(path = "/paleontologist")
@CrossOrigin("*")
public class PaleontologistController {
	
	private PaleontologistService paleontologistService;
	
	@Autowired
	public PaleontologistController (PaleontologistService paleontologistService) {
		this.paleontologistService = paleontologistService;
	}
	
	@GetMapping
	public ResponseEntity<List<PaleontologistDTO>> getPaleontologists() {
		return ResponseEntity.ok(paleontologistService.getPaleontologists());
	}
	
	@GetMapping(path = "/{paleontologist_id}")
	public ResponseEntity<PaleontologistDTO> getPaleontologist(@PathVariable(name = "paleontologist_id") int paleontologistId) {
		PaleontologistDTO paleontologist = paleontologistService.getPaleontologist(paleontologistId);
		return new ResponseEntity<>(paleontologist, HttpStatus.OK);
	}
	
	//@PostMapping
	//public ResponseEntity<PaleontologistDTO> createPaleotologist(@Valid @RequestBody NewPaleontologistDTO paleontologist) {
		//PaleontologistDTO newPaleontologist = paleontologistService.createPaleontologist(paleontologist);
		
		//HttpHeaders headers = new HttpHeaders(null);
		//headers.add("Location", "http://localhost:8080/paleontologist/" + newPaleontologist.getPaleontologistId());
		
		//return new ResponseEntity<>(newPaleontologist, headers, HttpStatus.CREATED);
	
	@PutMapping(path = "/{paleontologist_id}")
	public ResponseEntity<PaleontologistDTO> updatePaleontologist(@RequestBody NewPaleontologistDTO newPaleontologistDTO, @PathVariable(name = "paleontologist_id") int paleontologistId) {
		return ResponseEntity.ok(paleontologistService.updatePaleontologist(newPaleontologistDTO, paleontologistId));
	}
	
	@DeleteMapping(path = "/{paleontologist_id}")
	public ResponseEntity<?> deletePaleontologist(@PathVariable(name = "paleontologist_id") int paleontologistId) {
		PaleontologistDTO deletedPaleontologist = paleontologistService.getPaleontologist(paleontologistId);
		paleontologistService.deletePaleontologist(paleontologistId);
		return ResponseEntity.ok(deletedPaleontologist);
	}
	
}
