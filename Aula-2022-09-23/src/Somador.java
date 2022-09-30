import java.util.Scanner;

public class Somador {

	public static int soma(int[] numeros) {
		int t = 0;				// totalizador de números
		
		for (int i = 0; i < numeros.length; i++)
			t += numeros[i];	// atualização de totalizador
		
		return t;				// retorno de totalizador
	}
	
	public static double soma(double[] numeros) {
		double t = 0;			// totalizador de números
		
		for (int i = 0; i < numeros.length; i++)
			t += numeros[i];	// atualização de totalizador
		
		return t;				// retorno de totalizador
	}
	
	public static <T> void imprimir(T[] seq) {
		for (int i = 0; i < seq.length; i++) {
			if (i != 0)							// se não for primeiro valor
				if (i != seq.length - 1)		// se não for último valor...
					System.out.print(", ");		// impressão de vírgula
				else
					System.out.print(" e ");	// impressão de "e"
					
			System.out.print(seq[i]);			// impressão de enésimo valor
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int TAM = 5;
		
		Integer[] seq1 = new Integer[TAM];			// array de inteiros
		Double[] seq2 = new Double[TAM];	// array de doubles
		
		System.out.print("Digite " + TAM + " inteiros: ");
		for (int i = 0; i < TAM; i++)
			seq1[i] = scanner.nextInt();		// leitura de enésimo inteiro
		
		// descarte de caracteres não processados em última operação de leitura
		scanner.nextLine();	
		
		System.out.print("Digite " + TAM + " doubles: ");
		for (int i = 0; i < TAM; i++)
			seq2[i] = scanner.nextDouble();		// leitura de enésimo double		
		
		// descarte de caracteres não processados em última operação de leitura
		scanner.nextLine();	
		
		
		System.out.print("Sequencia 1: ");
		imprimir(seq1);
		System.out.println();
		System.out.print("Sequencia 2: ");
		imprimir(seq2);
		System.out.println();

		/*
		int t1 = soma(seq1);					// soma de inteiros
		double t2 = soma(seq2);					// soma de doubles
	
		System.out.println("Soma de Sequencia 1: " + t1);
		System.out.println("Soma de Sequencia 2: " + t2);
		*/
	}
	

	
}
