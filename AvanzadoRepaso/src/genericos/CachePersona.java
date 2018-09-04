package genericos;

public class CachePersona {
	private Persona p;
	
	public void guardar(Persona per) {
		this.p = per;
	}
	
	public Persona obtener() {
		return this.p;
	}
	
}
