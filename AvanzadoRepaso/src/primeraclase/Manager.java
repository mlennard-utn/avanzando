package primeraclase;

import java.util.List;

public class Manager extends Employee {
	List<Employee> reportees;
	
	public Manager() {
	
	}

	public List<Employee> getReportees() {
		return reportees;
	}

	public void setReportees(List<Employee> reportees) {
		this.reportees = reportees;
	}
}
