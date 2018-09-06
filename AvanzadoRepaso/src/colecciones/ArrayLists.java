package colecciones;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		List<Double> elevados = new ArrayList<>(10); 
		
		for (int indice = 0; indice <= 10; indice++) {
			elevados.add(indice, Math.pow(indice+1, 2));
		}
		
		for (Double valor : elevados) {
			System.out.println(valor);
		}
		
		System.out.println(
				String.format("La potencia de %d es %f", 4, elevados.get(3)));
		
	}

}
