package primeraclase.servicio;

import java.util.ArrayList;
import java.util.List;

import primeraclase.modelo.Employee;
import primeraclase.persistencia.EmployeeDAO;
import primeraclase.persistencia.FileDAOImpl;
import primeraclase.persistencia.InMemoryDAOImpl;

public class GestorEmpleados {
	
	private static EmployeeDAO dao = new FileDAOImpl();
	
	public static List<Employee> generateRandomEmployees(int cantidad, String nombreBase, int legajoBase, Employee report){
		List<Employee> employees = new ArrayList<Employee>();
		Employee emp = null;
		for (int i = 1; i <= cantidad; i++) {
			emp = new Employee();
			emp.setLegajo(legajoBase + i);
			emp.setName(nombreBase+emp.getLegajo());
			emp.setUbicacion(report.getUbicacion());
			emp.setReportTo(report);
			
			dao.guardar(emp);
			
			employees.add(emp);
		}
		
		return employees;
	}
	
	public static void establecerJerarquia(Employee empleado, Employee manager) {
		empleado.setReportTo(manager);
		manager.getReportees().add(empleado);
	}
	
	public static Employee createEmployee(int legajo, String nombre, String ubicacion) {
		Employee empl = new Employee();
		empl.setLegajo(legajo);
		empl.setName(nombre);
		empl.setUbicacion(ubicacion);
		
		dao.guardar(empl);
		
		return empl;
	}
	
	public static void generarEmpleados(Employee empleado) {
		empleado.setReportees(generateRandomEmployees(Utilidades.generarRandomInt(10,100), empleado.getUbicacion(), empleado.getLegajo(), empleado));
	}
	
	public static void generarAsesores(Employee empleado) {
		//Generar empleados cantidad de 0 a 10 ... 
		//  despues la misma logica que la generacion de empleados
	}
	
	public static List<String> obtenerEmpleados(){
		return dao.recuperarEmpleados();
	}

}
