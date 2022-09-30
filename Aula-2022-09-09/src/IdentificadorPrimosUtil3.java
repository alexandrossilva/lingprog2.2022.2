import java.util.Scanner;

public class IdentificadorPrimosUtil3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// entrada de intervalo númerico
		System.out.print("Informe intervalo numérico: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int diferenca = b - a;
		Thread[] threads = new Thread[5];
		
		for (int i = 0; i < 5; i++) {
			int limitesInf = a + diferenca / 5 * i;
			System.out.println(limitesInf);
			
			int limiteSup = i == 4 ? b : limitesInf + diferenca / 5;
			
			Runnable executavel = new IdentificadorPrimos2(limitesInf, limiteSup);
			threads[i] = new Thread(executavel);
		}
		
		for (int i = 0; i < 5; i++) {
			threads[i].start();			
		}
		
		scanner.close();
	}

}
