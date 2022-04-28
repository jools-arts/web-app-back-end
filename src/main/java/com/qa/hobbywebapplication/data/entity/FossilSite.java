package com.qa.hobbywebapplication.data.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "fossil_site")
public class FossilSite {
	
	@Id
	@Column(name = "fossil_site_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name = "paleontologist_id", referencedColumnName = "paleontologist_id")
	private Paleontologist paleontologist;
	
	@OneToMany(mappedBy = "fossilSite", targetEntity = Dinosaur.class, fetch = FetchType.LAZY)
	private List<Dinosaur> dinosaurs;
	
	public FossilSite() {
		super();
		this.dinosaurs = new ArrayList<>();
	}
	
	public FossilSite(String name, String city, String country, String continent) {
		this.name = name;
		this.city = city;
		this.country = country;
		this.continent = continent;
		this.dinosaurs = new ArrayList<>();
	}
	
	public FossilSite(int fossilSiteId, String name, String city, String country, String continent) {
		this.fossilSiteId = fossilSiteId;
		this.name = name;
		this.city = city;
		this.country = country;
		this.continent = continent;
		this.dinosaurs = new ArrayList<>();
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

	public Paleontologist getPaleontologist() {
		return paleontologist;
	}

	public void setPaleontologist(Paleontologist paleontologist) {
		this.paleontologist = paleontologist;
	}

	public List<Dinosaur> getDinosaurs() {
		return dinosaurs;
	}

	public void setDinosaurs(List<Dinosaur> dinosaurs) {
		this.dinosaurs = dinosaurs;
	}

	@Override
	public String toString() {
		return "FossilSite [fossilSiteId=" + fossilSiteId + ", name=" + name + ", city=" + city + ", country=" + country
				+ ", continent=" + continent + ", paleontologist=" + paleontologist + ", dinosaurs=" + dinosaurs + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, continent, country, dinosaurs, fossilSiteId, name, paleontologist);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FossilSite other = (FossilSite) obj;
		return Objects.equals(city, other.city) && Objects.equals(continent, other.continent)
				&& Objects.equals(country, other.country) && Objects.equals(dinosaurs, other.dinosaurs)
				&& fossilSiteId == other.fossilSiteId && Objects.equals(name, other.name)
				&& Objects.equals(paleontologist, other.paleontologist);
	}

}
