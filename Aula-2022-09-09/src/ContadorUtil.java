public class ContadorUtil {

	public static void main(String[] args) {
		System.out.println("Nome da Thread: " +
				Thread.currentThread().getName());
		
		Runnable c = new Contador();
		Runnable c2 = new Contador();
		
		Thread t = new Thread(c, "flamengo");
		Thread t2 = new Thread(c2, "palmeiras");
		
		t.start();
		t2.start();
	}

}
