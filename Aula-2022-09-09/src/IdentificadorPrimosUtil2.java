import java.util.Scanner;

public class IdentificadorPrimosUtil2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// entrada de intervalo númerico
		System.out.print("Informe intervalo numérico: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		Runnable executavel = new IdentificadorPrimos2(a, b);
		Thread thread = new Thread(executavel);
		thread.start();
		
		scanner.close();
	}

}
