package com.qa.hobbywebapplication.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.hobbywebapplication.data.entity.Paleontologist;
import com.qa.hobbywebapplication.data.repository.PaleontologistRepository;
import com.qa.hobbywebapplication.dto.PaleontologistDTO;

@Service
public class PaleontologistService {
	
	private PaleontologistRepository paleontologistRepository;
	private FossilSiteService fossilSiteService;
	private ModelMapper modelmapper;
	
	@Autowired
	public PaleontologistService(PaleontologistRepository paleontologistRepository, FossilSiteService fossilSiteService, ModelMapper modelMapper) {
		super();
		this.paleontologistRepository = paleontologistRepository;
		this.fossilSiteService = fossilSiteService;
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
	
	private PaleontologistDTO toDTO(Paleontologist paleontologist) {
		return this.modelmapper.map(paleontologist, PaleontologistDTO.class);
	}
}
