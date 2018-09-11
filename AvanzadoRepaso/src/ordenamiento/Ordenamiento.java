package ordenamiento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ordenamiento {

	public static void main(String[] args) {
		List<Estudiante> lista = new ArrayList<>();
		
		lista.add(new Estudiante(123, 22, "Martin"));
		lista.add(new Estudiante(124, 23, "Tobias"));
		lista.add(new Estudiante(125, 21, "Adrian"));
		lista.add(new Estudiante(126, 22, "Diego"));
		lista.add(new Estudiante(120, 27, "Susana"));
		lista.add(new Estudiante(121, 30, "Sebastian"));
		lista.add(new Estudiante(122, 23, "Juan Pablo"));

		System.out.println("Lista sin ordenar ");
		
		for (Estudiante estudiante : lista) {
			System.out.println(estudiante);
		}
		
		Collections.sort(lista, new ComparadorEdad());
		System.out.println("Lista ordenada por edad ");
		for (Estudiante estudiante : lista) {
			System.out.println(estudiante);
		}
		
		Collections.sort(lista, new Comparator<Estudiante>() {
			@Override
			public int compare(Estudiante o1, Estudiante o2) {
				return o1.getNombre().compareTo(o2.getNombre());
			}
		}  );
		
		Comparator<Estudiante> porNombre = 
				(Estudiante o1, Estudiante o2)->
					o1.getNombre().compareTo(o2.getNombre());
		System.out.println("Lista ordenada por nombre ");
		Collections.sort(lista, porNombre);			
		for (Estudiante estudiante : lista) {
			System.out.println(estudiante);
		}			
		
	}

}
