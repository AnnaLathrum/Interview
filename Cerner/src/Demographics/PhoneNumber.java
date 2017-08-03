package Demographics;

import utilities.PhoneType;

public class PhoneNumber {
	public String phoneNumber;
	public PhoneType phoneType;
	public boolean isPreferred = true;
	
	
	public PhoneNumber(String phoneNumber, PhoneType phoneType, boolean isPreferred) {
		this.phoneNumber = phoneNumber;
		this.phoneType = phoneType;
		this.isPreferred = isPreferred;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setPhoneType(PhoneType phoneType) {
		this.phoneType = phoneType;
	}
	
	public void setPreferred(boolean isPreferred) {
		this.isPreferred = isPreferred;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public PhoneType getPhoneType() {
		return phoneType;
	}
	
	public boolean getIsPreferred() {
		return isPreferred;
	}
	
	public String toString() {
		return String.format("(" + phoneNumber.substring(0, 2) + ")" + phoneNumber.substring(3, 5) + "-" + phoneNumber.substring(6));
	}
}
