package com.qa.hobbywebapplication.dto;

import java.util.Objects;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class DinosaurDTO {
	
	@Id
	private int dinosaurId;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid value for species")
	private String species;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid value for species")
	private String period;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid value for species")
	private String diet;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid value for species")
	private String habitat;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid value for species")
	private String region;
	
	public DinosaurDTO() {
		super();
	}
	
	public DinosaurDTO(int dinosaurId, String species, String period, String diet, String habitat, String region) {
		this.dinosaurId = dinosaurId;
		this.species = species;
		this.period = period;
		this.diet = diet;
		this.habitat = habitat;
		this.region = region;
	}

	public int getDinosaurId() {
		return dinosaurId;
	}

	public void setDinosaurId(int dinosaurId) {
		this.dinosaurId = dinosaurId;
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

	@Override
	public String toString() {
		return "DinosaurDTO [dinosaurId=" + dinosaurId + ", species=" + species + ", period=" + period + ", diet="
				+ diet + ", habitat=" + habitat + ", region=" + region + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(diet, dinosaurId, habitat, period, region, species);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DinosaurDTO other = (DinosaurDTO) obj;
		return Objects.equals(diet, other.diet) && dinosaurId == other.dinosaurId
				&& Objects.equals(habitat, other.habitat) && Objects.equals(period, other.period)
				&& Objects.equals(region, other.region) && Objects.equals(species, other.species);
	}

}
