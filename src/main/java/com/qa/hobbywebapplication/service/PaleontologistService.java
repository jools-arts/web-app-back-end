package com.qa.hobbywebapplication.service;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityNotFoundException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.hobbywebapplication.data.entity.Paleontologist;
import com.qa.hobbywebapplication.data.repository.PaleontologistRepository;
import com.qa.hobbywebapplication.dto.NewPaleontologistDTO;
import com.qa.hobbywebapplication.dto.PaleontologistDTO;

@Service
public class PaleontologistService {
	
	private PaleontologistRepository paleontologistRepository;
	private ModelMapper modelMapper;
	
	@Autowired
	public PaleontologistService(PaleontologistRepository paleontologistRepository, FossilSiteService fossilSiteService, ModelMapper modelMapper) {
		super();
		this.paleontologistRepository = paleontologistRepository;
		this.modelMapper = modelMapper;
	}
	
	public List<PaleontologistDTO> getPaleontologists() {
		List<Paleontologist> paleontologists = paleontologistRepository.findAll();
		List<PaleontologistDTO> paleontologistDTOs = new ArrayList<>();
		
		for (Paleontologist paleontologist: paleontologists) {
			paleontologistDTOs.add(this.toDTO(paleontologist));
		}
		return paleontologistDTOs;
	}
	
	public PaleontologistDTO getPaleontologist(int paleontologistId) {
		if (paleontologistRepository.existsById(paleontologistId)) {
			Paleontologist savedPaleontologist = paleontologistRepository.getById(paleontologistId);
			return this.toDTO(savedPaleontologist);
		}
		throw new EntityNotFoundException("The paleontologist you requested for retrieval was not found");
	}
	
	public PaleontologistDTO createPaleontologist(NewPaleontologistDTO paleontologist) {
		Paleontologist toSave = this.modelMapper.map(paleontologist, Paleontologist.class);
		Paleontologist newPaleontologist = paleontologistRepository.save(toSave);
		return this.toDTO(newPaleontologist);
	}
	
	public PaleontologistDTO updatePaleontologist(NewPaleontologistDTO paleontologist, int paleontologistId) {
		if (paleontologistRepository.existsById(paleontologistId)) {
			Paleontologist savedPaleontologist = paleontologistRepository.getById(paleontologistId);
			savedPaleontologist.setForename(paleontologist.getForename());
			savedPaleontologist.setSurname(paleontologist.getSurname());
			savedPaleontologist.setUsername(paleontologist.getUsername());
			savedPaleontologist.setEmailAddress(paleontologist.getEmailAddress());
			savedPaleontologist.setInstitution(paleontologist.getInstitution());
			savedPaleontologist.setSpecialism(paleontologist.getSpecialism());
			return this.toDTO(savedPaleontologist);
		}
		throw new EntityNotFoundException("The paleontologist you requested for updation was not found");
	}
	
	public void deleteUser(int PaleontologistId) {
		if (paleontologistRepository.existsById(PaleontologistId)) {
			paleontologistRepository.deleteById(PaleontologistId);
			return;
		}
		throw new EntityNotFoundException("The paleontologist you requested for deletion was not found");
	}
	
	private PaleontologistDTO toDTO(Paleontologist paleontologist) {
		return this.modelMapper.map(paleontologist, PaleontologistDTO.class);
	}
	
}
