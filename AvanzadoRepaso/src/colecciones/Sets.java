package colecciones;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import genericos.Persona;

public class Sets {

	public static void main(String[] args) {
		Set<Persona> hashSet = new HashSet<>();
		Set<Persona> treeSet = new TreeSet<>();
		
		Persona p1 = new Persona();
		p1.setName("AA");
		
		Persona p4 = new Persona();
		p4.setName("CC");
		
		Persona p3 = new Persona();
		p3.setName("BB");
		
		Persona p5 = new Persona();
		p5.setName("BB");
		
		System.out.println("Agregando HashSet");
		System.out.println(hashSet.add(p5));
		System.out.println(hashSet.add(p1));
		System.out.println(hashSet.add(p3));
		System.out.println(hashSet.add(p4));
		
		System.out.println("Agregando TreeSet");
		System.out.println(treeSet.add(p5));
		System.out.println(treeSet.add(p1));
		System.out.println(treeSet.add(p3));
		System.out.println(treeSet.add(p4));
		
		System.out.println("TreeSet :::");
		for (Persona persona : treeSet) {
			System.out.println(persona);
		}
		
		System.out.println("HashSet :::");
		for (Persona persona : hashSet) {
			System.out.println(persona);
		}
		
		

	}

}
