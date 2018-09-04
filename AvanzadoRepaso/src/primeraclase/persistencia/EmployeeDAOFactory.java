package primeraclase.persistencia;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class EmployeeDAOFactory {
	
	static String implementacion = "";
	
	public static EmployeeDAO createEmployeeDAO() {
		//Abrir archivo application.properties
		//Buscar el valor de la propiedad dao.impl
		//Si la propiedad es 'file' entonces 
		//devolver FileDAOImpl
		//caso contrario devolver InMemoryDAOImpl
		//Para buscar y cargar la propiedad usar 
		//java.io.FileInputStream / InputStream y 
		//las propiedades usando java.util.Properties
		
		if(implementacion == "") {
			Properties props = new Properties();
			try(InputStream input = new FileInputStream("C:\\Users\\Java\\git\\avanzando\\application.properties")){
				props.load(input);
		
				implementacion = props.getProperty("dao.impl");
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		if(implementacion == "file") {
			return new FileDAOImpl();
		}
				
		return new InMemoryDAOImpl();
	}
}
