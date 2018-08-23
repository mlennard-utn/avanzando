package primeraclase.persistencia;

import java.util.ArrayList;
import java.util.List;

import primeraclase.modelo.Employee;

public class InMemoryDAOImpl implements EmployeeDAO {
	
	private List<Employee> empleados = new ArrayList<>();
	
	@Override
	public void guardar(Employee employee) {
		empleados.add(employee);
	}

	@Override
	public List<Employee> recuperar() {
		
		return empleados;
	}

	@Override
	public List<String> recuperarEmpleados() {
		List<String> empleadosString = new ArrayList<>();
		for (Employee employee : empleados) {
			empleadosString.add(employee.toString());
		}
		return empleadosString;
	}

}
