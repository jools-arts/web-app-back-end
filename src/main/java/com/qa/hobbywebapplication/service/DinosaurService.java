package com.qa.hobbywebapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.hobbywebapplication.data.entity.Dinosaur;
import com.qa.hobbywebapplication.data.repository.DinosaurRepository;

@Service
public class DinosaurService {
	
	private DinosaurRepository dinosaurRepository;
	
	@Autowired
	public DinosaurService(DinosaurRepository dinosaurRepository) {
		super();
		this.dinosaurRepository = dinosaurRepository;
	}
	
	public List<Dinosaur> getDinosaurs() {
		return dinosaurRepository.findAll();
	}

}
