package Patient;

import Demographics.Person;
import utilities.DateTime;

public class Medication {
	public String medication;
	public DateTime startDate;
	public DateTime endDate;
	public Diagnosis prescribedFor;
	public Person prescribedBy;
	
	public Medication(String medication, DateTime startDate, DateTime endDate, Diagnosis prescribedFor, Person prescribedBy) {
		this.medication = medication;
		this.startDate = startDate;
		this.endDate = endDate;
		this.prescribedFor = prescribedFor;
		this.prescribedBy = prescribedBy;
	}
	
	public Medication(String medication, DateTime startDate, Diagnosis prescribedFor, Person prescribedBy) {
		this.medication = medication;
		this.startDate = startDate;
		this.prescribedFor = prescribedFor;
		this.prescribedBy = prescribedBy;
	}
	
	public Medication(String medication, Diagnosis prescribedFor, Person prescribedBy) {
		this.medication = medication;
		this.prescribedFor = prescribedFor;
		this.prescribedBy = prescribedBy;
	}
	
	
	public void setMedication(String medication) {
		this.medication = medication;
	}
	
	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}
	
	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
	
	public void setPrescribedFor(Diagnosis prescribedFor) {
		this.prescribedFor = prescribedFor;
	}
	
	public void setPrescribedBy(Person prescribedBy) {
		this.prescribedBy = prescribedBy;
	}
	
	public String getMedication() {
		return medication;
	}
	
	public DateTime getStartDate() {
		return startDate;
	}
	
	public DateTime getEndDate() {
		return endDate;
	}
	
	public Diagnosis getPrescribedFor(Diagnosis prescribedFor) {
		return prescribedFor;
	}
	
	public Person getPrescribedBy(Person prescribedBy) {
		return prescribedBy;
	}
}
