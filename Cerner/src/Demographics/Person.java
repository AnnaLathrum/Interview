package Demographics;

import java.util.ArrayList;
import java.util.List;

public class Person {
	public String firstName;
	public String lastName;
	public Address address;
	public List<PhoneNumber> phone;
	
	public Person() {
		phone = new ArrayList<PhoneNumber>();
	}
	
	public Person(String firstName, String lastName, Address address, List<PhoneNumber> phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void setPhone(List<PhoneNumber> phone) {
		this.phone = phone;
	}
	
	public void addPhone(PhoneNumber number) {
		phone.add(number);
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public List<PhoneNumber> getPhone() {
		return phone;
	}
}


