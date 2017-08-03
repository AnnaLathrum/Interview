package Patient;

import utilities.DateTime;
import utilities.Severity;

public class Symptom {
	public String symptom;
	public DateTime reportedDate;
	public Severity severity;
	
	public Symptom(String symptom, DateTime reportedDate, Severity severity) {
		this.symptom = symptom;
		this.reportedDate = reportedDate;
		this.severity = severity;
	}
	
	public Symptom(String symptom, Severity severity) {
		this.symptom = symptom;
		this.reportedDate = new DateTime();
		this.severity = severity;
	}
	
	
	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}
	
	public void setSeverity(Severity severity) {
		this.severity = severity;
	}
	
	public void setReportedDate(DateTime reportedDate) {
		this.reportedDate = reportedDate;
	}
	
	public String getSymptom() {
		return symptom;
	}
	
	public Severity getSeverity() {
		return severity;
	}
	
	public DateTime getReportedDate() {
		return reportedDate;
	}
}
