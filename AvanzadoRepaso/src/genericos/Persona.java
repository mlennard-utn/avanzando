package genericos;

public class Persona implements Saludable {

	@Override
	public String toString() {
		return "Soy Persona";
	}

	@Override
	public void imprimirPeso() {
		System.out.println("80");
	}

	
	
}
