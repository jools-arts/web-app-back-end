package com.qa.hobbywebapplication.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.hobbywebapplication.data.entity.Paleontologist;

@Repository
public interface PaleontologistRepository extends JpaRepository<Paleontologist, Integer> {

}
