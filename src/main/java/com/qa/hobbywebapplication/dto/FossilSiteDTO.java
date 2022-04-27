package com.qa.hobbywebapplication.dto;

import java.util.Objects;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class FossilSiteDTO {
	
	@Id
	private int fossilSiteId;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid value for name")
	private String name;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid value for city")
	private String city;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid value for country")
	private String country;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid value for continent")
	private String continent;
	
	public FossilSiteDTO() {
		super();
	}
	
	public FossilSiteDTO(int fossilSiteId, String name, String city, String country, String continent) {
		this.fossilSiteId = fossilSiteId;
		this.name = name;
		this.city = city;
		this.country = country;
		this.continent = continent;
	}

	public int getFossilSiteId() {
		return fossilSiteId;
	}

	public void setFossilSiteId(int fossilSiteId) {
		this.fossilSiteId = fossilSiteId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	@Override
	public String toString() {
		return "FossilSiteDTO [fossilSiteId=" + fossilSiteId + ", name=" + name + ", city=" + city + ", country="
				+ country + ", continent=" + continent + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, continent, country, fossilSiteId, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FossilSiteDTO other = (FossilSiteDTO) obj;
		return Objects.equals(city, other.city) && Objects.equals(continent, other.continent)
				&& Objects.equals(country, other.country) && fossilSiteId == other.fossilSiteId
				&& Objects.equals(name, other.name);
	}

}
