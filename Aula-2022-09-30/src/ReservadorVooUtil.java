import java.util.Scanner;

public class ReservadorVooUtil {

	public static void main(String[] args) {
		ReservadorVoo rv = new ReservadorVoo(1, null);
		Thread t = new Thread(rv);
		t.start();
		
		Scanner scanner = new Scanner(System.in);
		
		String op;
		
		do {
			System.out.println("Consultar Ocupação de Voo ou Encerrar (O/E)? ");
			op = scanner.nextLine().toLowerCase();
			
			if (op.equals("o")) {
				System.out.println("Ocupação Atual de Voo: " + rv.getTaxaOcupacao() + "%");
			}
		} while(op != "e");
		
		scanner.close();
	}

}
