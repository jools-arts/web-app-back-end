package com.qa.hobbywebapplication.dto;

import java.util.Objects;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class NewPaleontologistDTO {
	
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
	@Size(min = 1, max = 50, message = "Please enter a valid value for username")
	private String username;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid value for email address")
	private String emailAddress;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid value for institution")
	private String institution;
	
	@NotNull
	@NotBlank
	@Size(min = 1, max = 50, message = "Please enter a valid value for specialism")
	private String specialism;
	
	public NewPaleontologistDTO() {
		super();
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
	public int hashCode() {
		return Objects.hash(emailAddress, forename, institution, specialism, surname, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NewPaleontologistDTO other = (NewPaleontologistDTO) obj;
		return Objects.equals(emailAddress, other.emailAddress) && Objects.equals(forename, other.forename)
				&& Objects.equals(institution, other.institution) && Objects.equals(specialism, other.specialism)
				&& Objects.equals(surname, other.surname) && Objects.equals(username, other.username);
	}
	
}
