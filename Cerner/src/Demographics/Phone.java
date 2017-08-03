package Demographics;

public class Phone {
	public PhoneNumber phone1;
	public PhoneNumber phone2;
	public PhoneNumber phone3;
	
	public Phone(PhoneNumber phone1, PhoneNumber phone2, PhoneNumber phone3) {
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
		
		//TODO: error check
	}
	
	public Phone(PhoneNumber phone1, PhoneNumber phone2) {
		this.phone1 = phone1;
		this.phone2 = phone2;
				
		//TODO: error check
	}
	
	public Phone(PhoneNumber phone1) {
		this.phone1 = phone1;
		
		//TODO: error check
	}
	
	public void setPhone1(PhoneNumber phone1) {
		this.phone1 = phone1;
		
		//TODO: error check
	}
	
	public void setPhone2(PhoneNumber phone2) {
		this.phone2 = phone2;
		
		//TODO: error check
	}
	
	public void setPhone3(PhoneNumber phone3) {
		this.phone3 = phone3;
		
		//TODO: error check
	}
	
	public PhoneNumber getPhone1() {
		return phone1;
	}
	
	public PhoneNumber getPhone2() {
		return phone2;
	}
	
	
	public PhoneNumber getPhone3() {
		return phone3;
	}
	

	
}
