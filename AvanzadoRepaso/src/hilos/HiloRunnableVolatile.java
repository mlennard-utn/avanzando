package hilos;

public class HiloRunnableVolatile implements Runnable {
	public volatile boolean timeToQuit = false;
	
	@Override
	public void run() {
        System.out.println("Thread started");
        while(!timeToQuit) {
            System.out.println("Esperando me terminen");
        }
        System.out.println("Thread finishing");


	}

}
