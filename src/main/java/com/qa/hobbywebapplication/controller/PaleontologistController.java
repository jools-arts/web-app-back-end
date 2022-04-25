package com.qa.hobbywebapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.hobbywebapplication.service.PaleontologistService;

@RestController
@RequestMapping(path = "/Paleontologist")
@CrossOrigin("*")
public class PaleontologistController {
	
	private PaleontologistService paleontologistService;
	
	@Autowired
	public PaleontologistController (PaleontologistService paleontologistService) {
		this.paleontologistService = paleontologistService;
	}

}
