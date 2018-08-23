package primeraclase.modelo;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Votador {
	int legajo;
	String ubicacion;
	Employee reportTo;
	String name;
	List<Employee> reportees;
	private Boolean voto;
	
	public Employee() {
		reportees = new ArrayList<>();
	}
	
	
	
	@Override
	public String toString() {
		return String.format("legajo=%s, ubicacion=%s, reportTo=%s, name=%s, reportees=%d", legajo,
				ubicacion, reportTo!=null?reportTo.getName():"", name, reportees.size());
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
	public Employee getReportTo() {
		return reportTo;
	}
	public void setReportTo(Employee reportTo) {
		this.reportTo = reportTo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Employee> getReportees() {
		return reportees;
	}

	public void setReportees(List<Employee> reportees) {
		this.reportees = reportees;
	}

	@Override
	public Boolean getDecisionVoto() {
		return voto;
	}

	@Override
	public void elegirVoto() {
		Boolean valorRetorno = null;
		if (reportees != null && reportees.size() >= 2) {
			valorRetorno = Boolean.FALSE;
			if(ubicacion.equals(SENADO) && legajo % 2 == 0)
				valorRetorno = Boolean.TRUE;
			if(ubicacion.equals(DIPUTADO) && legajo % 3 == 0)
				valorRetorno = Boolean.TRUE;
		}	
		voto = valorRetorno;
	}
	
}
