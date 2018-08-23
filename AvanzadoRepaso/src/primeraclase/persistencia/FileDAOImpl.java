package primeraclase.persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import primeraclase.modelo.Employee;

public class FileDAOImpl implements EmployeeDAO {

	File empleados = new File("empleados.txt");
	
	@Override
	public void guardar(Employee employee) {
		try(Writer output = new BufferedWriter(new FileWriter(empleados.getName(), true));){
			output.write(employee.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Employee> recuperar() {
		
		return null;
	}

	@Override
	public List<String> recuperarEmpleados() {
		List<String> empleadosString = new ArrayList<>();
		try(FileInputStream fos = new FileInputStream(empleados);
			BufferedReader bw = new BufferedReader(new InputStreamReader(fos));){
			bw.lines().forEach(emp -> empleadosString.add(emp));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return empleadosString;
	}

}
