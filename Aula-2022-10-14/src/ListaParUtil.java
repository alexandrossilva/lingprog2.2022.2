import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class ListaParUtil {

	public static void main(String[] args) {
		final int TAM = 5;								// quantidade de alunos
		Collection<Par<String, Double>> alunos = new ArrayList<Par<String, Double>>();		
		Scanner scanner = new Scanner(System.in);
		double somaMedias = 0;							// totalizador de médias
		
		// entrada de dados de alunos de acordo com quantidade definida
		for (int i = 1; i <= TAM; i++) {
			// entrada de nome
			System.out.print("Aluno " + i + ": ");
			String nome = scanner.nextLine().toUpperCase();
			
			// entrada de média
			System.out.print("Média de " + nome + ": ");
			double media = scanner.nextDouble();
			
			// descarte de caracteres não processados em última operação de entrada
			scanner.nextLine();
			
			somaMedias += media;						// atualização de totalizador de médias

			// instanciação de novo par de valores com dados de desempenho do aluno
			Par<String, Double> par = new Par<String, Double>(nome, media);
			
			// inserção de par de valores na coleção
			alunos.add(par);
		}
		
		double mediaGeral = somaMedias / TAM;			// média geral
		
		System.out.println("\nALUNOS COM MÉDIA SUPERIOR: ");
				
		Iterator<Par<String, Double>> iterador = alunos.iterator();
		
		// listagem de alunos com média superior à média geral
		while (iterador.hasNext()) {
			Par<String, Double> par = iterador.next();
			
			if (par.getValor2() > mediaGeral) {			// se próximo aluno com média superior...
				System.out.println(par.getValor1());	// listagem de nome do aluno
			}
		}
		
		scanner.close();
	}

}