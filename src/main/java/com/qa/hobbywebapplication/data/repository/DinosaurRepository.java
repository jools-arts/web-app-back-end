package com.qa.hobbywebapplication.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.hobbywebapplication.data.entity.Dinosaur;

@Repository
public interface DinosaurRepository extends JpaRepository <Dinosaur, Integer> {

}
