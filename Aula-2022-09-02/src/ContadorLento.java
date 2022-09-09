public class ContadorLento implements Runnable {
	
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("Contagem Atual " + 
								Thread.currentThread().getName() + ": " + i);
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}