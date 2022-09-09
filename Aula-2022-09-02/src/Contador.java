public class Contador implements Runnable {
	
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("Contagem Atual " + 
								Thread.currentThread().getName() + ": " + i);
		}
	}

}