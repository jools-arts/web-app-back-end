package com.qa.hobbywebapplication.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.hobbywebapplication.data.entity.FossilSite;
import com.qa.hobbywebapplication.data.repository.FossilSiteRepository;
import com.qa.hobbywebapplication.dto.FossilSiteDTO;
import com.qa.hobbywebapplication.dto.NewFossilSiteDTO;

@Service
public class FossilSiteService {
	
	private FossilSiteRepository fossilSiteRepository;
	private ModelMapper modelMapper;
	
	@Autowired
	public FossilSiteService(FossilSiteRepository fossilSiteRepository, ModelMapper modelMapper) {
		super();
		this.fossilSiteRepository = fossilSiteRepository;
		this.modelMapper = modelMapper;
	}
	
	public List<FossilSiteDTO> getFossilSites() {
		List<FossilSite> fossilSites = fossilSiteRepository.findAll();
		List<FossilSiteDTO> fossilSiteDTOs = new ArrayList<>();
		
		for (FossilSite fossilSite: fossilSites) {
			fossilSiteDTOs.add(this.toDTO(fossilSite));
		}
		return fossilSiteDTOs;
	}
	
	public FossilSiteDTO getFossilSite(int fossilSiteId) {
		if (fossilSiteRepository.existsById(fossilSiteId)) {
			FossilSite savedFossilSite = fossilSiteRepository.getById(fossilSiteId);
			return this.toDTO(savedFossilSite);
		}
		throw new EntityNotFoundException("The fossil site you requested for retrieval was not found");
	}
	
	public List<FossilSiteDTO> getFossilSitesByPaleontologistId(int paleontologistId) {
		List<FossilSite> fossilSites = fossilSiteRepository.findByPaleontologistId(paleontologistId);
		List<FossilSiteDTO> fossilSiteDTOs = new ArrayList<>();
		
		for (FossilSite fossilsite: fossilSites) {
			fossilSiteDTOs.add(this.toDTO(fossilsite));
		}
		return fossilSiteDTOs;
	}
	
	public FossilSiteDTO createFossilSite(NewFossilSiteDTO fossilSite) {
		FossilSite toSave = this.modelMapper.map(fossilSite,  FossilSite.class);
		FossilSite newFossilSite = fossilSiteRepository.save(toSave);
		return this.toDTO(newFossilSite);
	}
	
	public FossilSiteDTO updateFossilSite(NewFossilSiteDTO fossilSite, int fossilSiteId) {
		if (fossilSiteRepository.existsById(fossilSiteId)) {
			FossilSite savedFossilSite = fossilSiteRepository.getById(fossilSiteId);
			savedFossilSite.setName(fossilSite.getName());
			savedFossilSite.setCity(fossilSite.getCity());
			savedFossilSite.setCountry(fossilSite.getCountry());
			savedFossilSite.setContinent(fossilSite.getContinent());
			return this.toDTO(savedFossilSite);
		}
		throw new EntityNotFoundException("The fossil site you requested for updation was not found");
	}
	
	public void deleteFossilSite(int fossilSiteId) {
		if (fossilSiteRepository.existsById(fossilSiteId)) {
			fossilSiteRepository.existsById(fossilSiteId);
			return;
		}
		throw new EntityNotFoundException("the fossil site you requested for deletion was not found");
	}
	
	private FossilSiteDTO toDTO(FossilSite fossilSite) {
		return this.modelMapper.map(fossilSite, FossilSiteDTO.class);
	}

}
