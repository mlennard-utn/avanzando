package fund.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

public class ObjectFileStream {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1995);
		Date fechaNacimiento = cal.getTime();
		Double edadActual = new Double(10);

		PersonaSerializable s1 = new PersonaSerializable("Nombre1", fechaNacimiento, edadActual);
		cal.set(Calendar.YEAR, 2000);
		PersonaSerializable s2 = new PersonaSerializable("Nombre2", cal.getTime(), new Double(22));
		PersonaSerializable s3 = new PersonaSerializable("Nombre3", cal.getTime(), new Double(32));
		ArrayList<PersonaSerializable> personas = new ArrayList<>();
		personas.add(s1);
		personas.add(s2);
		personas.add(s3);

		Curso p = new Curso(personas);
		try (FileOutputStream fos = new FileOutputStream("C:\\tmp\\objetos.txt");
				ObjectOutputStream out = new ObjectOutputStream(fos)) {
			out.writeObject(p);
		} catch (IOException i) {
			System.out.println("Exception writing out Portfolio: " + i);
		}
		try (FileInputStream fis = new FileInputStream("C:\\tmp\\objetos.txt"); 
				ObjectInputStream in = new ObjectInputStream(fis)) {
			Curso newP = (Curso) in.readObject();
			for (int i = 0; i < newP.getPersonas().length; i++) {
				PersonaSerializable persona = newP.getPersonas()[i];
				System.out.println(persona);
			}
		} catch (ClassNotFoundException | IOException i) {
			System.out.println("Exception reading in Portfolio: " + i);

		}
	}
}
