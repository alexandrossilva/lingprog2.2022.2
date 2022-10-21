import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CalculoPesoUtil {

	public static void main(String[] args) {
		final int QTD = 2; 		// quantidade de entrada de dados de pessoas

		// listas de nomes de pessoas de acordo com seus IMCs
		List<String> pessoasMagras = new ArrayList<String>();
		List<String> pessoasSaudaveis = new ArrayList<String>();
		List<String> pessoasObsesas = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		
		// entrada de dados das pessoas
		for (int i = 1; i <= QTD; i++) {
			// entrada de nome de enésima pessoa
			System.out.print("Nome de " + i + "º Pessoa: ");
			String nome = scanner.nextLine();
			
			// entrada de peso de enésima pessoa
			System.out.print("Peso de " + i + "º Pessoa: ");
			double peso = scanner.nextDouble();

			// entrada de altura de enésima pessoa
			System.out.print("Altura de " + i + "º Pessoa: ");
			double altura = scanner.nextDouble();
			
			// descarte de caracteres de entrada ainda não processados
			scanner.nextLine();
			
			// cálculo de IMC
			double imc = peso / (altura * altura);
			
			if (imc < 18.5)					// se pessoa magra...
				pessoasMagras.add(nome);
			else if (imc < 25)				// se pessoa com peso saudável...
				pessoasSaudaveis.add(nome);
			else							// caso contrário (pessoa obesa)...
				pessoasObsesas.add(nome);	
		}		
		
		
		System.out.print("\nPessoas Magras: ");
		for (int i = 0; i < pessoasMagras.size(); i++)
			System.out.print(pessoasMagras.get(i) + " ");
		
		System.out.print("\nPessoas Saudáveis: ");
		for (int i = 0; i < pessoasSaudaveis.size(); i++)
			System.out.print(pessoasSaudaveis.get(i) + " ");
		
		System.out.print("\nPessoas Obsesas: ");
		
		Iterator<String> it = pessoasObsesas.iterator();
		while (it.hasNext())
			System.out.print(it.next() + " ");
		
		scanner.close();
	}

}
