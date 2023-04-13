package org.tnsif.multilevel;

//Program to demonstrate multi-level inheritance

//parent class
public class Country {
	private String countryName;
	private String countryCapital;
	
	//default constructor
	public Country() {
		super();
	}
	
	//parameterized constructor
	public Country(String countryName, String countryCapital) {
		super();
		this.countryName = countryName;
		this.countryCapital = countryCapital;
	}
	
	//getters and setters
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryCapital() {
		return countryCapital;
	}
	public void setCountryCapital(String countryCapital) {
		this.countryCapital = countryCapital;
	}

	//toString() method
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", countryCapital=" + countryCapital + "]";
	}

}