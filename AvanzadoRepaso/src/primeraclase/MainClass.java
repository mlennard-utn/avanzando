package primeraclase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		Manager presidente = createManager("Presidente", "presidencia", 100);
		
		Manager jefeSenado = createManager("Jefe Senado", "senado", 200);
		jefeSenado.setReportTo(presidente);
		
		
		jefeSenado.setReportees(generateRandomEmployees(generarRandomInt(10,100), "senado", 200, jefeSenado));
		
		Manager jefeDiputado = createManager("Jefe Diputado", "congreso", 300);
		jefeDiputado.setReportTo(presidente);
		
		
		
	}
	
	private static int generarRandomInt(int minimo, int maximo) {
		Random generadorRandom = new Random();
		int cantidad = generadorRandom.nextInt(maximo);
		while(cantidad < minimo) {
			cantidad = generadorRandom.nextInt(maximo);
		}
		
		return cantidad;
	}

	private static Manager createManager(String nombre, String ubicacion, int legajo){
		Manager man = new Manager();
		man.setLegajo(legajo);
		man.setName(nombre);
		man.setUbicacion(ubicacion);
		
		return man;
	}
	
	private static List<Employee> generateRandomEmployees(int cantidad, String nombreBase, int legajoBase, Manager report){
		List<Employee> employees = new ArrayList<Employee>();
		Employee emp = null;
		for (int i = 1; i <= cantidad; i++) {
			emp = new Employee();
			emp.setLegajo(legajoBase + i);
			emp.setName(nombreBase+emp.getLegajo());
			emp.setUbicacion(report.getUbicacion());
			emp.setReportTo(report);
			employees.add(emp);
		}
		
		return employees;
	}
	
}
