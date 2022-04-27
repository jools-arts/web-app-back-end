package com.qa.hobbywebapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.hobbywebapplication.data.entity.FossilSite;
import com.qa.hobbywebapplication.data.repository.FossilSiteRepository;

@Service
public class FossilSiteService {
	
	private FossilSiteRepository fossilSiteRepository;
	
	@Autowired
	public FossilSiteService(FossilSiteRepository fossilSiteRepository) {
		super();
		this.fossilSiteRepository = fossilSiteRepository;
	}
	
	public List<FossilSite> getFossilSites() {
		return fossilSiteRepository.findAll();
	}

}
