package colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import genericos.Persona;

public class Maps {

	public static void main(String[] args) {
		Map<String, Persona> mapaPersonas = new HashMap<>();
		
		Persona p1 = new Persona();
		p1.setName("AA");
		Persona p4 = new Persona();
		p4.setName("CC");
		Persona p3 = new Persona();
		p3.setName("BB");
		Persona p5 = new Persona();
		p5.setName("BB");
		
		mapaPersonas.put("C", p4);
		mapaPersonas.put("A", p1);
		mapaPersonas.put("B", p3);
		mapaPersonas.put("D", p5);
		
		Set<String> claves = mapaPersonas.keySet();
		
		for (String clave : claves) {
			System.out.println("Clave: " + clave + " valor: " + mapaPersonas.get(clave));
		}
		
	}

}
