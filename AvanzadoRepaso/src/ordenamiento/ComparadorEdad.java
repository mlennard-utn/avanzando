package ordenamiento;

import java.util.Comparator;

public class ComparadorEdad implements Comparator<Estudiante> {

	@Override
	public int compare(Estudiante o1, Estudiante o2) {
		return o1.getEdad().compareTo(o2.getEdad());
	}
	
}
