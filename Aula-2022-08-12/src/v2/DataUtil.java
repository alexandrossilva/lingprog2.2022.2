package v2;

import java.util.Scanner;

public class DataUtil {

	public static void main(String[] args) {
		int d, m, a;
		Data data;
		
		Scanner scanner = new Scanner(System.in);			

		System.out.print("Informe Dia (1-31): ");
		d = scanner.nextInt();
		System.out.print("Informe Mês (1-12): ");
		m = scanner.nextInt();
		System.out.print("Informe Ano.......: ");
		a = scanner.nextInt();
					
		data = new Data(d, m, a);
		
		System.out.println("\nData em Formato DD/MM/AAAA: " + data.mostrarData());			

		data.set(31, 10, 1980);
		
		System.out.println("\nData em Formato DD/MM/AAAA: " + data.mostrarData());	
		
		System.out.println("\nDias Restantes (Término de " + a + "): " + data.getDiasTerminoAno());			
		
		scanner.close();
	}

}