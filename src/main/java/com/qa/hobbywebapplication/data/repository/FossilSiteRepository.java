package com.qa.hobbywebapplication.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.hobbywebapplication.data.entity.FossilSite;

@Repository
public interface FossilSiteRepository extends JpaRepository<FossilSite, Integer> {
	
	List<FossilSite> findByPaleontologist(int paleontologistId);
}
