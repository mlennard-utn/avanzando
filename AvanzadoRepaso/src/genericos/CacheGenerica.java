package genericos;

public class CacheGenerica <T extends Saludable> {
	
	private T x;
	
	public void guardar(T t) {
		this.x = t;
	}
	
	public T obtener() {
		return this.x;
	}
	
	public void imprimirContenido() {
		this.x.imprimirPeso();
	}
	
}
