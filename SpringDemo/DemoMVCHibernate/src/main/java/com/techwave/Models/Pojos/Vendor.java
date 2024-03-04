package com.techwave.Models.Pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Vendor {
	@Id
	private int vendorId;
	@Size(min = 4, max = 25, message = "Should have characters 4-25")
	@Column(length = 25)
	private String vendorName;
	@Pattern(regexp = "^([a-zA-Z0-9_.+-]+)@([a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$", message = "Invalid Email")
	private String email;
	@Pattern(regexp = "[A-Z]{5}[0-9]{4}[A-Z]{1}", message = "Invalid PAN")
	private String pancard;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@dateOfRegistration(message = "date must greater than 2020-01-01")
	private LocalDate dateOfRegistration;
	@Range(min = 1000, max = 10000, message = "fee must be between 1000 & 10000")
	@NotNull(message = "should not be empty")
	private Integer registrationFees;

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public LocalDate getDateOfRegistration() {
		return dateOfRegistration;
	}

	public void setDateOfRegistration(LocalDate dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

	public Integer getRegistrationFees() {
		return registrationFees;
	}

	public void setRegistrationFees(Integer registrationFees) {
		this.registrationFees = registrationFees;
	}

	public Vendor() {
		super();
	}

	public Vendor(int vendorId, String vendorName, String email, String pancard, LocalDate dateOfRegistration,
			Integer registrationFees) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.email = email;
		this.pancard = pancard;
		this.dateOfRegistration = dateOfRegistration;
		this.registrationFees = registrationFees;
	}

}
