package genericos;

import java.util.Date;

public class Persona implements Saludable, Comparable<Persona> {

	private String name;
	private Date fechaNacimiento;
	private transient Double edadActual;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Persona p = (Persona) obj;
		return p.getName().equals(this.getName());
	}

	@Override
	public String toString() {
		return "Soy Persona : " + this.name;
	}

	@Override
	public void imprimirPeso() {
		System.out.println("80");
	}

	@Override
	public int compareTo(Persona o) {
		System.out.println("Usa compareTo : " + this.getName() + " compareTo: " + o.getName());
		return o.getName().compareTo(this.getName());
	}

	@Override
	public int hashCode() {
		System.out.println("Usa hashCode : " + this.getName().hashCode() );
		return this.getName().hashCode();
	}

	
	
}
