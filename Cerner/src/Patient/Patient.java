package Patient;

import java.util.List;

import Demographics.Address;
import Demographics.Person;
import Demographics.Phone;
import utilities.CircularQueue;
import utilities.DateTime;

public class Patient extends Person{
	public List<Allergy> allergies;
	public List<Diagnosis> diagnosis;
	public List<Medication> medications;
	public CircularQueue<Temperature> temp;
	public DateTime lastSeen;
	public DateTime dob;
	
	public Patient(String firstName, String lastName, Address address, Phone phone, DateTime dob, List<Allergy> allergies, List<Diagnosis> diagnosis, List<Medication> medications, CircularQueue<Temperature> temp, DateTime lastSeen) {
		super(firstName, lastName, address, phone);
		this.allergies = allergies;
		this.diagnosis = diagnosis;
		this.medications = medications;
		this.temp = temp;
		this.lastSeen = lastSeen;
		this.dob = dob;
	}
	
	public Patient(String firstName, String lastName, Address address, Phone phone, DateTime dob,List<Allergy> allergies, List<Diagnosis> diagnosis, List<Medication> medications, CircularQueue<Temperature> temp) {
		super(firstName, lastName, address, phone);
		this.allergies = allergies;
		this.diagnosis = diagnosis;
		this.medications = medications;
		this.temp = temp;
		lastSeen = new DateTime();
		this.dob = dob;
	}
	
	public Patient(String firstName, String lastName, Address address, Phone phone, DateTime dob, List<Allergy> allergies, List<Diagnosis> diagnosis, List<Medication> medications) {
		super(firstName, lastName, address, phone);
		this.allergies = allergies;
		this.diagnosis = diagnosis;
		this.medications = medications;
		lastSeen = new DateTime();
		this.dob = dob;
	}
	
	public Patient(String firstName, String lastName, Address address, Phone phone, DateTime dob, List<Allergy> allergies, List<Diagnosis> diagnosis) {
		super(firstName, lastName, address, phone);
		this.allergies = allergies;
		this.diagnosis = diagnosis;
		lastSeen = new DateTime();
		this.dob = dob;
	}
	
	public Patient(String firstName, String lastName, Address address, Phone phone, DateTime dob, List<Allergy> allergies) {
		super(firstName, lastName, address, phone);
		this.allergies = allergies;
		lastSeen = new DateTime();
		this.dob = dob;
	}
	
	public Patient(String firstName, String lastName, Address address, Phone phone, DateTime dob) {
		super(firstName, lastName, address, phone);
		lastSeen = new DateTime();
		this.dob = dob;
	}
	
	public void setAllergies(List<Allergy> allergies) {
		this.allergies = allergies;
	}
	
	public void setDiagnosis(List<Diagnosis> diagnosis) {
		this.diagnosis = diagnosis;
	}
	
	public void setMedications(List<Medication> medications) {
		this.medications = medications;
	}
	
	public void setTemperature(CircularQueue<Temperature> temp) {
		this.temp = temp;
	}
	
	public void setLastSeenDate(DateTime lastSeen) {
		this.lastSeen = lastSeen;
	}
	
	public void setDob(DateTime dob) {
		this.dob = dob;
	}
	
	public List<Allergy> getAllergies() {
		return allergies;
	}
	
	public List<Diagnosis> getDiagnosis() {
		return diagnosis;
	}
	
	public List<Medication> getMedications() {
		return medications;
	}
	
	public CircularQueue<Temperature> getTemperature() {
		return temp;
	}
	
	public DateTime getLastSeenDate() {
		return lastSeen;
	}
	
	public DateTime getDob() {
		return dob;
	}

}
