public class IdentificadorPrimos implements Runnable {

	private int limiteInf;		// limite inferior de intervalo numérico
	private int limiteSup;		// limite superior de intervalo numérico
	
	public IdentificadorPrimos(int limiteInf, int limiteSup) {
		this.limiteInf = limiteInf;
		this.limiteSup = limiteSup;
	}
	
	// tarefa de identificação de primos em intervao
	public void run() {
		
	}
	
	public boolean ehPrimo(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {	// se divisível por valor atual de contagem...
				return false;	// número não é primo
			}
		}
		
		// número não é primo se nenhuma divisão resultar em resto igual a 0 (zero)
		return true;
	}

}
