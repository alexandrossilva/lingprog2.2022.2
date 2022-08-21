import java.util.Scanner;

// Encapsulamento de operações típicas de contas correntes e considerando, além disso, 
// particularidade de que tarifa de 0,5% é deduzida adicionamente em operações de saque
public class ContaCorrente {

	protected double saldo;			// saldo corrente da conta

	// obtenção de saldo corrente da conta
	public double getSaldo() {
		return saldo;
	}
	
	// operação de depósito com consequente atualização de saldo corrente da conta
	public boolean registrarDeposito(double valor) {
		if (valor <= 0)				// se valor a depositar não for positivo...
			return false;			
		else {						// caso contrário...
			saldo += valor;			// atualização de saldo corrente
			return true;
		}
	}

	// operação de saque com consequente atualização de saldo corrente da conta
	public boolean registrarSaque(double valor) {
		if (valor <= 0)				// se valor a sacar não for positivo...
			return false;
		else {						// caso contrário...
			// cálculo de tarifa (0,5% do valor de saque)
			double tarifa = valor * 0.5 / 100;
			
			// verificação de saldo negativo após dedução de saque e tarifa
			if (saldo < valor + tarifa)
				return false;		// não efetivação, neste caso, de saque
			else {
				// atualização de saldo deduzindo-se saque e tarifa
				saldo -= (valor + tarifa);
				return true;				
			}
		}
	}
	
	// demonstração de capacidades da classe ContaCorrente
	public static void main(String[] args) {
		char resp;
		Scanner scanner = new Scanner(System.in);

		ContaCorrente conta = new ContaCorrente();
		
		System.out.println("Saldo Inicial: " + conta.getSaldo());
		System.out.println("\nOPERAÇÕES DE DEPÓSITO (D) OU SAQUE (S)");
		
		do {
			System.out.print("\nValor de Depósito/Saque: ");
			double v = scanner.nextDouble();
			
			System.out.print("Tipo de Operação (D/S).: ");
			char op = scanner.next().charAt(0);

			if (op == 'D' || op == 'd')
				conta.registrarDeposito(v);
			else if (op == 'S' || op == 's')
				conta.registrarSaque(v);
			
			System.out.println("Saldo Atualizado.......: " + conta.getSaldo());
			
			System.out.print("\nDeseja encerrar (S/N)? ");
			resp = scanner.next().charAt(0);
		} while (resp == 'N' || resp == 'n');
		
		scanner.close();
	}
	
}