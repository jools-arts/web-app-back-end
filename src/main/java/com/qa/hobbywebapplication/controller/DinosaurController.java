package com.qa.hobbywebapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.hobbywebapplication.dto.DinosaurDTO;
import com.qa.hobbywebapplication.dto.NewDinosaurDTO;
import com.qa.hobbywebapplication.service.DinosaurService;

@RestController
@RequestMapping(path = "/dinosaur")
@CrossOrigin("*")
public class DinosaurController {
	
	private DinosaurService dinosaurService;
	
	@Autowired
	public DinosaurController (DinosaurService dinosaurService) {
		this.dinosaurService = dinosaurService;
	}
	
	@GetMapping
	public ResponseEntity<List<DinosaurDTO>> getDinosaurs() {
		return ResponseEntity.ok(dinosaurService.getDinosaurs());
	}
	
	@GetMapping(path = "/{dinosaur_id}")
	public ResponseEntity<DinosaurDTO> getDinosaur(@PathVariable(name = "dinosaur_id") int dinosaurId) {
		DinosaurDTO dinosaur = dinosaurService.getDinosaur(dinosaurId);
		return new ResponseEntity<>(dinosaur, HttpStatus.OK);
	}
	
	@PutMapping(path = "/{dinosaur_id}")
	public ResponseEntity<DinosaurDTO> updateDinosaur(@RequestBody NewDinosaurDTO newDinosaurDTO, @PathVariable(name = "dinosaur_id") int dinosaurId) {
		return ResponseEntity.ok(dinosaurService.updateDinosaur(newDinosaurDTO, dinosaurId));
	}
	
	@DeleteMapping(path = "/{dinosaur_id")
	public ResponseEntity<?> deleteDinosaur(@PathVariable(name = "dinosaur_id") int dinosaurId) {
		DinosaurDTO deletedDinosaur = dinosaurService.getDinosaur(dinosaurId);
		dinosaurService.deleteDinosaur(dinosaurId);
		return ResponseEntity.ok(deletedDinosaur);
	}

}
