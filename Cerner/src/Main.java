import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import Demographics.Address;
import Demographics.Person;
import Demographics.Phone;
import Demographics.PhoneNumber;
import Patient.Allergy;
import Patient.Diagnosis;
import Patient.Medication;
import Patient.Patient;
import Patient.Symptom;
import Patient.Temperature;
import utilities.CircularQueue;
import utilities.DateTime;
import utilities.Location;
import utilities.PhoneType;
import utilities.ReportedBy;
import utilities.Severity;
import utilities.State;

public class Main {

	private static final boolean Temperature = false;

	public static void main(String[] args) throws ParseException {
		Person me = new Person("Mick", "Shinn", new Address("123 East", "Kansas City", State.MO, "64118", "USA"), new Phone(new PhoneNumber("8168533069", PhoneType.Cell, true)));
		
		Patient newMe = new Patient("Anna", "Lathrum", new Address("123 East", "Kansas City", State.MO, "64118", "USA"), 
						new Phone(new PhoneNumber("8168533069", PhoneType.Cell, true)), new DateTime("08", "22", "1988"));
		
		newMe.setAllergies(new ArrayList<Allergy>(Arrays.asList(
				new Allergy("Penicillin", Severity.Medium, ReportedBy.patient),
				new Allergy("Pertussis", Severity.Medium, ReportedBy.patient),
				new Allergy("Beets", Severity.Low, ReportedBy.parent))));
		
		newMe.setDiagnosis(new ArrayList<Diagnosis>(Arrays.asList(
				new Diagnosis("High Blood Pressure", new ArrayList<Symptom>(Arrays.asList(
						new Symptom("Swelling", new DateTime("2016", "11", "16"), Severity.Medium),
						new Symptom("Dystolic High", Severity.High)))),
				new Diagnosis("Depression", new ArrayList<Symptom>(Arrays.asList(
						new Symptom("Insomnia", new DateTime("2015", "01", "15"), Severity.High),
						new Symptom("Lack of Appetite", new DateTime("2014", "02", "14"), Severity.High)))))));
		
		
		newMe.setMedications(new ArrayList<Medication>(Arrays.asList(
				new Medication("HCTZ", new DateTime("2016", "11", "16"), new DateTime("2099", "12", "31"), newMe.getDiagnosis().get(0), me),
				new Medication("Buproprion", new DateTime("2014", "2", "14"), newMe.getDiagnosis().get(1), me))));
		
		newMe.setTemperature(new CircularQueue<Temperature>());
		
		for(int i =0; i < 24; i++) {
			newMe.getTemperature().add(new Temperature(97.8, Location.Auxillery));
		}
		
		newMe.getTemperature().add(new Temperature(0, Location.Oral));
		newMe.getTemperature().add(new Temperature(0, Location.Oral));
		newMe.getTemperature().add(new Temperature(0, Location.Oral));
		newMe.getTemperature().add(new Temperature(0, Location.Oral));
		
		newMe.getTemperature().printQueue();
		
//		printMedicationList(newMe);
//		
//		System.out.println(newMe.lastSeen);
//		
//		newMe.setFistName("Moose");
//		
//		printMedicationList(newMe);
	}
	
	public static void printMedicationList(Patient newMe) {
		System.out.printf("%s, %s %s\n", newMe.lastName, newMe.firstName, newMe.dob);
		for(Medication med : newMe.getMedications()) {
			System.out.printf("%s : %s \n", med.medication, med.prescribedFor.diagnosis);
		}
	}
	
	public static void printTemperatures(Patient newMe) {
		for(Temperature temp : newMe.getTemperature()) {
			System.out.printf("%f - %s\n", temp.temp, temp.location);
		}
	}
	

}

