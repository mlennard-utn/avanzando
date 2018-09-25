package hilos;

public class HiloRunnable implements Runnable {

	private volatile int i;
	
	@Override
	public void run() {
		for (i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread());
			System.out.println("i: " + i);
			
		}
	}

}
