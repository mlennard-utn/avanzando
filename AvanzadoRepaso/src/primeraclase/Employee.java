package primeraclase;

public class Employee {
	int legajo;
	String ubicacion;
	Manager reportTo;
	String name;
	
	public Employee() {
		
	}
	
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public Manager getReportTo() {
		return reportTo;
	}
	public void setReportTo(Manager reportTo) {
		this.reportTo = reportTo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
