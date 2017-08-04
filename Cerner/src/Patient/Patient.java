package Patient;

import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Demographics.Address;
import Demographics.Person;
import Demographics.PhoneNumber;
import utilities.CircularQueue;


public class Patient extends Person{
	public List<Allergy> allergies;
	public List<Diagnosis> diagnosis;
	public List<Medication> medications;
	public CircularQueue<Temperature> temp;
	public Calendar lastSeen;
	public Date dob;
	
	public Patient(String firstName, String lastName, Address address, List<PhoneNumber> phone, Date dob, List<Allergy> allergies, List<Diagnosis> diagnosis, List<Medication> medications, CircularQueue<Temperature> temp, Calendar lastSeen) {
		super(firstName, lastName, address, phone);
		this.allergies = allergies;
		this.diagnosis = diagnosis;
		this.medications = medications;
		this.temp = temp;
		this.lastSeen = lastSeen;
		this.dob = dob;
	}
	
	public Patient(String firstName, String lastName, Address address, List<PhoneNumber> phone, Date dob,List<Allergy> allergies, List<Diagnosis> diagnosis, List<Medication> medications, CircularQueue<Temperature> temp) {
		super(firstName, lastName, address, phone);
		this.allergies = allergies;
		this.diagnosis = diagnosis;
		this.medications = medications;
		this.temp = temp;
		lastSeen = Calendar.getInstance();
		this.dob = dob;
	}
	
	public Patient() {
		super();
		allergies = new ArrayList<Allergy>();
		diagnosis = new ArrayList<Diagnosis>();
		medications = new ArrayList<Medication>();
		temp = new CircularQueue<Temperature>();
		lastSeen = Calendar.getInstance();
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
	
	public void setLastSeenDate(Date lastSeen) {
		this.lastSeen.setTime(lastSeen);
	}
	
	public void addAllergy(Allergy x) {
		allergies.add(x);
	}
	
	public void addDiagnosis(Diagnosis x) {
		diagnosis.add(x);
	}
	
	public void addMedications(Medication x) {
		medications.add(x);
	}
	
	public void addTemperature(Temperature x) {
		temp.add(x);
	}
	
	public void setDob(Date dob) {
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
	
	public Date getLastSeenDate() {
		return lastSeen.getTime();
	}
	
	public Date getDob() {
		return dob;
	}

}
