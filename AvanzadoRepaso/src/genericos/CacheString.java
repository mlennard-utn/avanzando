package genericos;

public class CacheString {
	private String s;
	
	public void guardar(String string) {
		this.s = string;
	}
	
	public String obtener() {
		return this.s;
	}
	
}
