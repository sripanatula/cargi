package com.panatula.cargi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Servicestation extends BaseModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;

	String name;
	String description;
	String location;
	Integer openAt;
	Integer closesAt;
	Double latitude;
	Double longitude;
	Integer yearSince;

	public Servicestation() {
	}

	public Servicestation(Long id, String name, String description, String location, Integer openAt, Integer closesAt, Double latitude, Double longitude, Integer yearSince) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.location = location;
		this.openAt = openAt;
		this.closesAt = closesAt;
		this.latitude = latitude;
		this.longitude = longitude;
		this.yearSince = yearSince;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getOpenAt() {
		return openAt;
	}

	public void setOpenAt(Integer openAt) {
		this.openAt = openAt;
	}

	public Integer getClosesAt() {
		return closesAt;
	}

	public void setClosesAt(Integer closesAt) {
		this.closesAt = closesAt;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Integer getYearSince() {
		return yearSince;
	}

	public void setYearSince(Integer yearSince) {
		this.yearSince = yearSince;
	}

}
