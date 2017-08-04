import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import Demographics.Address;
import Demographics.Person;
import Demographics.PhoneNumber;
import Patient.Allergy;
import Patient.Birth;
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

	public static void main(String[] args) throws ParseException {
		
		Patient one = new Patient();
		
		one.setFirstName("Neptune");
		one.addPhone(new PhoneNumber("8168533069", PhoneType.Home, true));
		one.addPhone(new PhoneNumber("8167192782", PhoneType.Cell, false));
		
		one.setAddress(new Address("123 Anywhere", "Kansas City", State.MO, "64118", "USA"));
		one.setLastSeenDate(new GregorianCalendar(1988, 7, 22).getTime());
		
		one.addAllergy(new Allergy("Bugs", Severity.High, ReportedBy.patient));
		one.addAllergy(new Allergy("Vacuum", Severity.High, ReportedBy.guardian));
		
		one.addDiagnosis(new Diagnosis("Herpes", new ArrayList<Symptom>(Arrays.asList(
				new Symptom("Swelling", new DateTime("2016", "11", "16"), Severity.Medium),
				new Symptom("Dystolic High", Severity.High)))));
		
//		printAllergyList(one);
//		printDiagnosisList(one);
	
		Birth baby = new Birth(new Date(), "America", "Chicago");
		
		System.out.println(baby.getCountry());
		System.out.println(baby.getCity());
		
		System.out.println(baby.getBirth());
		
		System.out.println(baby.getBirthInOtherTimeZone("America", "New_York"));
		
	}
	
	public static void printPhoneList(Patient x) {
		for(PhoneNumber phone : x.getPhone()) {
			System.out.printf("\n%s", phone);
		}
	}
	
	public static void printAllergyList(Patient newMe) {
		for(Allergy x : newMe.getAllergies()) {
			System.out.printf("%s : %s Reported By: %s\n", x.allergy, x.severity, x.reportedBy);
		}
	}
	
	public static void printDiagnosisList(Patient newMe) {
		for(Diagnosis x : newMe.getDiagnosis()) {
			System.out.printf("%s : ", x.diagnosis);
			for(Symptom y : x.getSymptoms()) {
				System.out.printf(" %s |", y.symptom);
			}
		}
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

