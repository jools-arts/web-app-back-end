package com.qa.hobbywebapplication.dto;

import java.util.Objects;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PaleontologistDTO {
	
	@Id
	private int paleontologistId;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid value for forename")
	private String forename;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a value for surname")
	private String surname;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid value for username")
	private String username;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid value for email address")
	private String emailAddress;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid value for instiution")
	private String institution;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid value for specialism")
	private String specialism;
	
	public PaleontologistDTO() {
		super();
	}
	
	public PaleontologistDTO(int paleontologistId, String forename, String surname, String username, String emailAddress, String institution, String specialism) {
		this.paleontologistId = paleontologistId;
		this.forename = forename;
		this.surname = surname;
		this.username = username;
		this.emailAddress = emailAddress;
		this.institution = institution;
		this.specialism = specialism;
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

	@Override
	public String toString() {
		return "PaleontologistDTO [paleontologistId=" + paleontologistId + ", forename=" + forename + ", surname="
				+ surname + ", username=" + username + ", emailAddress=" + emailAddress + ", institution=" + institution
				+ ", specialism=" + specialism + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(emailAddress, forename, institution, paleontologistId, specialism, surname, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaleontologistDTO other = (PaleontologistDTO) obj;
		return Objects.equals(emailAddress, other.emailAddress) && Objects.equals(forename, other.forename)
				&& Objects.equals(institution, other.institution) && paleontologistId == other.paleontologistId
				&& Objects.equals(specialism, other.specialism) && Objects.equals(surname, other.surname)
				&& Objects.equals(username, other.username);
	}
	
}
