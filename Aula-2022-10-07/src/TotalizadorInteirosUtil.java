import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class TotalizadorInteirosUtil {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Collection<Integer> lista = new ArrayList<Integer>();
		
		int n = 0;
		
		do {
			System.out.print("Digite um número para inserir ou 0 para sair: ");
			n = scanner.nextInt();
			if (n != 0)
				lista.add(n);
		} while (n != 0);
		
		Iterator<Integer> iterador = lista.iterator();
		
		double soma = 0;
		
		while (iterador.hasNext()) {
			soma += iterador.next();	
		}
		
		System.out.println("Soma = " + soma);
		System.out.println("Média = " + soma / lista.size());
		
		scanner.close();
	}

}
