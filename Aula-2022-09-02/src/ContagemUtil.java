public class ContagemUtil {

	public static void main(String[] args) throws InterruptedException {
		Thread t = new ContadorThread();
		t.start();
		
		Thread t2 = new ContadorThread();
		t2.start();
	}

}