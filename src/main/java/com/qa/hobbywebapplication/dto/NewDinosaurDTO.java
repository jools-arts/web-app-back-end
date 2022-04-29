package com.qa.hobbywebapplication.dto;

import java.util.Objects;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class NewDinosaurDTO {
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid value for species")
	private String species;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid value for period")
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
	
	public NewDinosaurDTO() {
		super();
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
	public int hashCode() {
		return Objects.hash(diet, habitat, period, region, species);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NewDinosaurDTO other = (NewDinosaurDTO) obj;
		return Objects.equals(diet, other.diet) && Objects.equals(habitat, other.habitat)
				&& Objects.equals(period, other.period) && Objects.equals(region, other.region)
				&& Objects.equals(species, other.species);
	}
	
}
