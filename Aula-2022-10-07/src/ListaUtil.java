import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class ListaUtil {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Collection lista = new ArrayList();
		
		int n = 0;
		
		do {
			System.out.print("Digite um número para inserir ou 0 para sair: ");
			n = scanner.nextInt();
			if (n != 0)
				lista.add(n);
		} while (n != 0);
		
		Iterator iterador = lista.iterator();
		
		for (int i = 1; iterador.hasNext(); i++) {
			System.out.println(i + "º Número: " + iterador.next());			
		}
		
		scanner.close();
	}

}
