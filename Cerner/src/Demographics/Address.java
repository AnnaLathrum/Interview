package Demographics;

import utilities.State;

public class Address {
	public String street;
	public String city;
	public State state;
	public String zip;
	public String country;

	
	
	//assume all addresses are American addresses
	public Address(String street, String city, State state, String zip, String country) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
		
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getStreet() {
		return street;
	}
	
	public String getCity() {
		return city;
	}
	
	public State getState() {
		return state;
	}
	
	public String getZip() {
		return zip;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String toString() {
		return String.format("%s\n%s, %s %s\n", street, city, state, zip);
	}

}
