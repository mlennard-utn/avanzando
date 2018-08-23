package primeraclase.vista;

import primeraclase.modelo.Employee;
import primeraclase.modelo.Votador;
import primeraclase.servicio.GestorEmpleados;

public class CreadorEstructura {

	public static void main(String[] args) {
		Employee presidente = GestorEmpleados.createEmployee(100, "Presidente", "presidencia");
		
		Employee jefeSenado = GestorEmpleados.createEmployee(200, "Jefe Senado", Votador.SENADO);
		GestorEmpleados.establecerJerarquia(jefeSenado, presidente);
		GestorEmpleados.generarEmpleados(jefeSenado);
		
		Employee jefeDiputado = GestorEmpleados.createEmployee(400,"Jefe Diputado", Votador.DIPUTADO);
		GestorEmpleados.establecerJerarquia(jefeDiputado, presidente);
		GestorEmpleados.generarEmpleados(jefeDiputado);
				
		for (String empl : GestorEmpleados.obtenerEmpleados()) {
			System.out.println(empl);
		}
		
//		for (Votador empleado: presidente.getReportees()) {
//			empleado.elegirVoto();
//			System.out.println(empleado.getDecisionVoto());
//		}
		
	}
	
}
