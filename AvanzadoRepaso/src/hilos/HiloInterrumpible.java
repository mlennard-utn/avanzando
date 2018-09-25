package hilos;

public class HiloInterrumpible implements Runnable {
	
	@Override
	public void run() {
        System.out.println("Thread started");
        while(!Thread.interrupted()) {
            System.out.println("No me interrumpieron..");
        }
        System.out.println("Thread finishing");
    }


}
