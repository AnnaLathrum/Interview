package Patient;

import java.util.List;

public class Diagnosis {
	public String diagnosis;
	public List<Symptom> symptoms;
	
	public Diagnosis(String diagnosis, List<Symptom> symptoms) {
		this.diagnosis = diagnosis;
		this.symptoms = symptoms;
	}
	
	public Diagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	
	public void setDisease(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	
	public void setSymptoms(List<Symptom> symptoms) {
		this.symptoms = symptoms;
	}
	
	public void addSymptom(Symptom symptom) {
		symptoms.add(symptom);
	}
	
	public void removeSymptom(Symptom symptom) {
		symptoms.remove(symptom);
	}
	
	public String getDisease() {
		return diagnosis;
	}
	
	public List<Symptom> getSymptoms(){
		return symptoms;
	}
}
