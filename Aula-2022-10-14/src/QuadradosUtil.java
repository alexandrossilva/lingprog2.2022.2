import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class QuadradosUtil {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Collection<Integer> listaNumeros = new ArrayList<Integer>();	// lista
		final int MAX = 1000;					// máximo valor a gerar
		Random gerador = new Random();			// gerador de números
		double soma = 0;						// totalizador
		
		// entrada de quantidade de números a gerar
		System.out.print("Quantidade de Números: ");
		int qtd = scanner.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			int num = gerador.nextInt(MAX);		// geração de próximo número
			soma += num;						// atualização de totalizador
			listaNumeros.add(num);				// inserção em lista
		}
		
		double media = soma / qtd;				// média
		
		System.out.println("Números gerados: " + listaNumeros);
		
		// iterador de números inseridos em lista
		Iterator<Integer> iterador = listaNumeros.iterator();
		
		while (iterador.hasNext()) {			// enquanto houver números a visitar
			int num = iterador.next();			// próximo número visitado
			
			if (num > media) {					// se número superior à média
				int quadrado = num * num;		// quadrado de número
				System.out.println("Quadrado de " + num + " = " + quadrado);
			}
		}
		
		scanner.close();
	}

}