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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "paleontologist")
public class Paleontologist {
	
	@Id
	@Column(name = "paleontologist_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int paleontologistId;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid value for forename")
	private String forename;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid value for surname")
	private String surname;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid value for uesrname")
	private String username;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid valur for email address")
	private String emailAddress;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid value for institution")
	private String institution;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid value for specialism")
	private String specialism;
	
	@OneToMany(mappedBy = "paleontologist", targetEntity = FossilSite.class, fetch = FetchType.LAZY)
	private List<FossilSite> fossilSites;
	
	public Paleontologist() {
		super();
		this.fossilSites = new ArrayList<>();
	}
	
	public Paleontologist(String forename, String surname, String username, String emailAddress, String institution, String specialism) {
		super();
		this.forename = forename;
		this.surname = surname;
		this.emailAddress = emailAddress;
		this.institution = institution;
		this.specialism = specialism;
		this.fossilSites = new ArrayList<>();
	}
	
	public Paleontologist(int paleontologistId, String forename, String surname, String username, String emailAddress, String institution, String specialism) {
		super();
		this.paleontologistId = paleontologistId;
		this.forename = forename;
		this.surname = surname;
		this.emailAddress = emailAddress;
		this.institution = institution;
		this.specialism = specialism;
		this.fossilSites = new ArrayList<>();
	}

	public int getPaleontologistId() {
		return paleontologistId;
	}

	public void setPaleontologistId(int paleontologistId) {
		this.paleontologistId = paleontologistId;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public String getSpecialism() {
		return specialism;
	}

	public void setSpecialism(String specialism) {
		this.specialism = specialism;
	}

	public List<FossilSite> getFossilSites() {
		return fossilSites;
	}

	public void setFossilSites(List<FossilSite> fossilSites) {
		this.fossilSites = fossilSites;
	}

	@Override
	public String toString() {
		return "Paleontologist [paleontologistId=" + paleontologistId + ", forename=" + forename + ", surname="
				+ surname + ", username=" + username + ", emailAddress=" + emailAddress + ", institution=" + institution
				+ ", specialism=" + specialism + ", fossilSites=" + fossilSites + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(emailAddress, forename, fossilSites, institution, paleontologistId, specialism, surname,
				username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paleontologist other = (Paleontologist) obj;
		return Objects.equals(emailAddress, other.emailAddress) && Objects.equals(forename, other.forename)
				&& Objects.equals(fossilSites, other.fossilSites) && Objects.equals(institution, other.institution)
				&& paleontologistId == other.paleontologistId && Objects.equals(specialism, other.specialism)
				&& Objects.equals(surname, other.surname) && Objects.equals(username, other.username);
	}
	
}
