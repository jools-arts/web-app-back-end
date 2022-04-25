package com.qa.hobbywebapplication.data.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "dinosaur")
public class Dinosaur {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid period species")
	private String species;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid for period period")
	private String period;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid value for diet")
	private String diet;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid value for habitat")
	private String habitat;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid value for region")
	private String region;
	
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name = "paleontologist_id", referencedColumnName = "id")
	private Paleontologist paleontologist;
	
	public Dinosaur(int id, String species, String period, String diet, String habitat, String region) {
		this.id = id;
		this.species = species;
		this.period = period;
		this.diet = diet;
		this.habitat = habitat;
		this.region = region;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Paleontologist getPaleontologist() {
		return paleontologist;
	}

	public void setPaleontologist(Paleontologist paleontologist) {
		this.paleontologist = paleontologist;
	}

	@Override
	public String toString() {
		return "Dinosaur [id=" + id + ", species=" + species + ", period=" + period + ", diet=" + diet + ", habitat="
				+ habitat + ", region=" + region + ", paleontologist=" + paleontologist + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(diet, habitat, id, paleontologist, period, region, species);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dinosaur other = (Dinosaur) obj;
		return Objects.equals(diet, other.diet) && Objects.equals(habitat, other.habitat) && id == other.id
				&& Objects.equals(paleontologist, other.paleontologist) && Objects.equals(period, other.period)
				&& Objects.equals(region, other.region) && Objects.equals(species, other.species);
	}
	
	
}
