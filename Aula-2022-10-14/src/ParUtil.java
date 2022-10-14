import java.util.Scanner;

public class ParUtil {

	public static void main(String[] args) {
		final int TAM = 5;								// quantidade de alunos
		Par<String, Double>[] alunos = new Par[TAM];	// array de alunos
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
			alunos[i - 1] = new Par<String, Double>(nome, media);
		}
		
		double mediaGeral = somaMedias / TAM;			// média geral
		
		System.out.println("\nALUNOS COM MÉDIA SUPERIOR: ");
		
		// listagem de alunos com média superior à média geral
		for (int i = 0; i < TAM; i++) {
			if (alunos[i].getValor2() > mediaGeral) {		// se enésimo aluno com média superior...
				System.out.println(alunos[i].getValor1());	// listagem de nome do aluno
			}
		}
		
		scanner.close();
	}

}
