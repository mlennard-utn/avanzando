package deques;

import java.util.ArrayDeque;
import java.util.Deque;

import genericos.Persona;

public class MainClassDeques {

	public static void main(String[] args) {
		Deque<Persona> pila = new ArrayDeque<>();
		Deque<Persona> cola = new ArrayDeque<>();
		
		Persona p1 = new Persona();
		p1.setName("AA");
		Persona p4 = new Persona();
		p4.setName("CC");
		Persona p3 = new Persona();
		p3.setName("CC");
		Persona p5 = new Persona();
		p5.setName("DD");
		
		Persona p11 = new Persona();
		p11.setName("AA");
		Persona p14 = new Persona();
		p14.setName("BB");
		Persona p13 = new Persona();
		p13.setName("CC");
		Persona p15 = new Persona();
		p15.setName("DD");
		
		cola.add(p11);
		cola.add(p13);
		cola.add(p14);
		cola.add(p15);
		
		pila.push(p1);
		pila.push(p3);
		pila.push(p4);
		pila.push(p5);

		
		for (Persona persona : pila) {
			System.out.println("Pila: " + pila.pop());
			//System.out.println("For-each: " + persona);
		}

		System.out.println("-------------");
		
		for (Persona persona : cola) {
			System.out.println("Cola: " + cola.remove());
			System.out.println("For-each: " + persona);
		}
		
		
	}

}
