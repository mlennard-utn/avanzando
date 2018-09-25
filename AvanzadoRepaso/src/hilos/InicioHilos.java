package hilos;

public class InicioHilos {

	public static void main(String[] args) {
		Hilo1 hilo = new Hilo1();
		Hilo2 hilo2Runnable = new Hilo2();
		
		Thread hilo2 = new Thread(hilo2Runnable);
		
		hilo.start();
		hilo2.start();
		
 		
	}

}
