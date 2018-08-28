package primeraclase.modelo;

public class EmployeeDTO {
	private Integer legajo;
	private String ubicacion;
	private Integer reportTo;
	private String name;
	private Integer[] reportees;
	
	public Integer getLegajo() {
		return legajo;
	}
	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public Integer getReportTo() {
		return reportTo;
	}
	public void setReportTo(Integer reportTo) {
		this.reportTo = reportTo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer[] getReportees() {
		return reportees;
	}
	public void setReportees(Integer[] reportees) {
		this.reportees = reportees;
	}
	
}
