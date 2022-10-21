import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;
import java.util.Scanner;

public class PilhaUtil {

	public static void main(String[] args) {
		final int MAX = 1000;
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		Deque<Integer> pilha = new ArrayDeque<Integer>();
		double soma = 0;
		
		// entrada de quantidade de números
		System.out.print("Quantidade de Números: ");
		int qtd = scanner.nextInt();
		
		// geração e empilhamento de números
		for (int i = 0; i < qtd; i++) {
			int n = random.nextInt(MAX);	// geração de número
			pilha.push(n);					// empilhamento
			soma += n;						// atualização de totalizador
		}
		
		// listagem de números empilhados
		System.out.println("Pilha de Números: " + pilha);
		
		double media = soma / qtd;			// média de números gerados

		System.out.println("Quadrados de Números Superiores à Média");
		
		while (!pilha.isEmpty()) {			// enquanto pilha não vazia...
			int n = pilha.pop();			// desempilhamento de próximo número
			if (n > media) {				// se número superior à média...
				int quadrado = n * n;		// quadrado de número
				// listagem de quadrado de número
				System.out.println("Quadrado de " + n + " = " + quadrado);
			}
		}
		
		scanner.close();
	}

}
