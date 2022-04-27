package com.qa.hobbywebapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.hobbywebapplication.data.entity.Paleontologist;
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

}
