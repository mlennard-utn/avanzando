package ordenamiento;

public class Estudiante {
	
	private Integer legajo;
	private Integer edad;
	private String nombre;
	
	public Estudiante(Integer legajo, Integer edad, String nombre) {
		super();
		this.legajo = legajo;
		this.edad = edad;
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return String.format("Estudiante [legajo=%s, edad=%s, nombre=%s]", legajo, edad, nombre);
	}

	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
