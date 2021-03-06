package com.qa.hobbywebapplication.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.hobbywebapplication.data.entity.Dinosaur;
import com.qa.hobbywebapplication.data.repository.DinosaurRepository;
import com.qa.hobbywebapplication.dto.DinosaurDTO;
import com.qa.hobbywebapplication.dto.NewDinosaurDTO;

@Service
public class DinosaurService {
	
	private DinosaurRepository dinosaurRepository;
	private ModelMapper modelMapper;
	
	@Autowired
	public DinosaurService(DinosaurRepository dinosaurRepository, ModelMapper modelMapper) {
		super();
		this.dinosaurRepository = dinosaurRepository;
		this.modelMapper = modelMapper;
	}
	
	public List<DinosaurDTO> getDinosaurs() {
		List<Dinosaur> dinosaurs = dinosaurRepository.findAll();
		List<DinosaurDTO> dinosaurDTOs = new ArrayList<>();
		
		for (Dinosaur dinosaur: dinosaurs) {
			dinosaurDTOs.add(this.toDTO(dinosaur));
		}
		return dinosaurDTOs;
	}
	
	public DinosaurDTO getDinosaur(int dinosaurId) {
		if (dinosaurRepository.existsById(dinosaurId)) {
			Dinosaur savedDinosaur = dinosaurRepository.getById(dinosaurId);
			return this.toDTO(savedDinosaur);
		}
		throw new EntityNotFoundException("The dinosaur you requested for retrieval was not found");
	}
	
	public DinosaurDTO createDinosaur(NewDinosaurDTO dinosaur) {
		Dinosaur toSave = this.modelMapper.map(dinosaur, Dinosaur.class);
		Dinosaur newDinosaur = dinosaurRepository.save(toSave);
		return this.toDTO(newDinosaur);
	}
	
	public DinosaurDTO updateDinosaur(NewDinosaurDTO dinosaur, int dinosaurId) {
		if (dinosaurRepository.existsById(dinosaurId)) {
			Dinosaur savedDinosaur = dinosaurRepository.getById(dinosaurId);
			savedDinosaur.setSpecies(dinosaur.getSpecies());
			savedDinosaur.setPeriod(dinosaur.getPeriod());
			savedDinosaur.setDiet(dinosaur.getDiet());
			savedDinosaur.setHabitat(dinosaur.getHabitat());
			savedDinosaur.setRegion(dinosaur.getRegion());
			return this.toDTO(savedDinosaur);
		}
		throw new EntityNotFoundException("The dinosaur you requested for updation was not found");
	}
	
	public void deleteDinosaur(int DinosaurId) {
		if (dinosaurRepository.existsById(DinosaurId)) {
			dinosaurRepository.existsById(DinosaurId);
			return;
		}
		throw new EntityNotFoundException("The dinosaur you requested for deletion was not found");
	}
	
	private DinosaurDTO toDTO(Dinosaur dinosaur) {
		return this.modelMapper.map(dinosaur, DinosaurDTO.class);
	}

}
