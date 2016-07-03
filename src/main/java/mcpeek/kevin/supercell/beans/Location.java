package mcpeek.kevin.supercell.beans;

import java.io.Serializable;

public class Location implements Serializable{
	private Integer id;
	private String name;
	private Boolean isCountry;
	private String countryCode;

	public Location() {
		id = new Integer(0);
		name = new String();
		isCountry = new Boolean(false);
		countryCode = new String();
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Boolean isCountry() {
		return isCountry;
	}
	
	public void setIsCountry(Boolean country) {
		this.isCountry = country;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
}
