package com.qa.hobbywebapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.hobbywebapplication.data.entity.Paleontologist;
import com.qa.hobbywebapplication.data.repository.PaleontologistRepository;

@Service
public class PaleontologistService {
	
	private PaleontologistRepository paleontologistRepository;
	
	@Autowired
	public PaleontologistService(PaleontologistRepository paleontologistRepository) {
		super();
		this.paleontologistRepository = paleontologistRepository;
	}
	
	public List<Paleontologist> getPaleontologists() {
		return paleontologistRepository.findAll();
	}

}
