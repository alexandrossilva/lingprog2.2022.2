import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FuncionarioUtil {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Funcionario> listaFunc = new LinkedList<Funcionario>();
		
		int op;
		
		do {
			System.out.println("************ OPERAÇÕES *************");
			System.out.println("* 1 - INSERIR                      *");
			System.out.println("* 2 - ADICIONAR HORAS              *");
			System.out.println("* 3 - LISTAR SALÁRIOS LÍQUIDOS     *");
			System.out.println("* 4 - LISTAR SALÁRIO LÍQUIDO MÉDIO *");
			System.out.println("* 5 - ENCERRAR PROGRAMA            *");			
			System.out.println("************************************");
			System.out.println();
			
			System.out.print("Digite Operação (1-5): ");
			op = scanner.nextInt();
			
			scanner.nextLine();
			
			switch (op) {
				case 1:
					// entrada de dados de funcionário
					System.out.println("NOVO FUNCIONÁRIO");
					System.out.print("Nome..........: ");
					String nome = scanner.nextLine();
					System.out.print("Sobrenome.....: ");
					String sobrenome = scanner.nextLine();
					System.out.print("Valor por Hora: ");
					double valorHora = scanner.nextDouble();
					
					// instanciação de novo objeto de Funcionario
					Funcionario func = new Funcionario(nome, sobrenome, valorHora);
					
					// inserção de objeto em lista
					listaFunc.add(func);
					
					// listagem de quantidade de funcionários 
					System.out.println("Quantidade de funcionários: " + 
						listaFunc.size());
					
					scanner.nextLine();
					break;
				case 2:
					if (listaFunc.isEmpty())
						System.out.println("Não há funcionarios!");
					else {
						System.out.print("Nº Funcionário (1-" + listaFunc.size() + "): ");
						int numFunc = scanner.nextInt();						
						
						if (numFunc <= 0 || numFunc > listaFunc.size())
							System.out.println("Número de funcionário inválido!");
						else {
							func = listaFunc.get(numFunc - 1);							
							
							System.out.print("Horas trabalhadas: ");
							int horas = scanner.nextInt();						
							
							func.adicionarCargaHoraria(horas);
							
							System.out.println("Banco de horas atualizado do funcionário: " + 
							func.getHorasTrabalhadas());
						}						
					}
					break;
				case 3:
					if (listaFunc.isEmpty())
						System.out.println("Não há funcionarios!");
					else {
						Iterator<Funcionario> iterador = listaFunc.iterator();
						
						while (iterador.hasNext()) {
							func = iterador.next();
							System.out.println("Salário Líquido de " +
									func.getNome() + ": " +
									func.getSalarioLiquido());
						}						
					}					
					break;
				case 4:
					if (listaFunc.isEmpty())
						System.out.println("Não há funcionarios!");
					else {
						double soma = 0;
						
						Iterator<Funcionario> iterador = listaFunc.iterator();
						
						while (iterador.hasNext()) {
							func = iterador.next();
							soma += func.getSalarioLiquido();
						}				
						
						double media = soma / listaFunc.size();
						
						System.out.println("Salário Líquido Médio: " +
								media);
					}					
					break;
			}
			
			System.out.println();
			System.out.println();
		} while (op != 5);
		
		scanner.close();
	}
	
}
