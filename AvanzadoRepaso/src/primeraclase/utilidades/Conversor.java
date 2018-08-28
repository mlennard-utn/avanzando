package primeraclase.utilidades;

import primeraclase.modelo.Employee;
import primeraclase.modelo.EmployeeDTO;

public class Conversor {
	
	public static EmployeeDTO convert(Employee emp) {
		EmployeeDTO dto = new EmployeeDTO();
		dto.setLegajo(emp.getLegajo());
		dto.setName(emp.getName());
		dto.setReportTo(emp.getReportTo() != null ? emp.getReportTo().getLegajo():null);
		dto.setUbicacion(emp.getUbicacion());
		
		return dto;
	}
	
}
