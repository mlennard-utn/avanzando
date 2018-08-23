package primeraclase.persistencia;

import java.util.List;

import primeraclase.modelo.Employee;

public interface EmployeeDAO {
	
	public void guardar(Employee employee);
	
	public List<Employee> recuperar();
	
}
