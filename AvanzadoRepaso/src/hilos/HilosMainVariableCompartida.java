package hilos;

import java.util.ArrayList;
import java.util.Collection;

public class HilosMainVariableCompartida {

	public static void main(String[] args) throws InterruptedException {
		Hilo1 runnable = new Hilo1();
		Thread h1 = new Thread(runnable);
		Thread h2 = new Thread(runnable);
		Thread h3 = new Thread(runnable);
 		Collection<Thread> hilos = new ArrayList<>();
 	
 		h1.setName("Primero");
 		h2.setName("Segundo");
 		h3.setName("Tercero");
 		
 		hilos.add(h1);
 		hilos.add(h2);
 		hilos.add(h3);
 		
 		for (Thread thread : hilos) {
			thread.start();
		}
 		
 		for (Thread thread : hilos) {
			thread.join();
			System.out.println("Termino: " + thread.getName());
		}
 		
 		System.out.println("Terminaron todos");
 		
		
		//apagarHilo();
		
//		interrumpirHilo();
		
	}

	private static void apagarHilo() throws InterruptedException {
	    HiloRunnableVolatile r1 = new HiloRunnableVolatile();
	    Thread t1 = new Thread(r1);
	    t1.start();
	    Thread.sleep(100L);
	    r1.timeToQuit = true;

	}
	
	private static void interrumpirHilo() throws InterruptedException {
		HiloInterrumpible h2 = new HiloInterrumpible();
		Thread hilo = new Thread(h2);
		
		hilo.start();
		Thread.sleep(100L);
		hilo.interrupt();
		
		
	}
	
}
