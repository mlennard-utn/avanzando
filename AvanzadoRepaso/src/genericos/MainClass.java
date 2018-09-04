package genericos;

public class MainClass {

	public static void main(String[] args) {
		//Cache con tipos especificos
		CachePersona cp = new CachePersona();
		CacheString cs = new CacheString();
		
		//Caches genericas
		CacheGenerica<Persona> cgp = new CacheGenerica<>();
		
		cgp.guardar(new Persona());

		cgp.imprimirContenido();
		
		
	}

}
