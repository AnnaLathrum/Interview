package Demographics;

public class Person {
	public String firstName;
	public String lastName;
	public Address address;
	public Phone phone;
	
	public Person(String firstName, String lastName, Address address, Phone phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
	}
	
	public void setFistName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void setPhone(Phone phone) {
		this.phone = phone;
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
	
	public Phone getPhone() {
		return phone;
	}
}


