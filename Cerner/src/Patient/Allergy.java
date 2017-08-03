package Patient;

import utilities.ReportedBy;
import utilities.Severity;

public class Allergy {
	public String allergy;
	public Severity severity;
	public ReportedBy reportedBy;
	public boolean hasAllergy = false;
	
	public Allergy(String allergy, Severity severity, ReportedBy reportedBy) {
		this.allergy = allergy;
		this.severity = severity;
		this.reportedBy = reportedBy;
	}
	
	
	public void setAllergy(String allergy) {
		this.allergy = allergy;
	}
	
	public void setSeverity(Severity severity) {
		this.severity = severity;
	}
	
	public void setReportedBy(ReportedBy reportedBy) {
		this.reportedBy = reportedBy;
	}
	
	public String getAllergy() {
		return allergy;
	}
	
	public Severity getSeverity() {
		return severity;
	}
	
	public ReportedBy getReportedBy() {
		return reportedBy;
	}
	
	
}
