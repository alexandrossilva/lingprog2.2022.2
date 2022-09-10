import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.GregorianCalendar;

public class IdentificadorPrimos2 implements Runnable {

	private int limiteInf;		// limite inferior de intervalo numérico
	private int limiteSup;		// limite superior de intervalo numérico
	
	public IdentificadorPrimos2(int limiteInf, int limiteSup) {
		this.limiteInf = limiteInf;
		this.limiteSup = limiteSup;
	}
	
	// tarefa de identificação de primos em intervao
	public void run() {
		// instante de tempo inicial
		LocalTime inicio = LocalTime.now();
		
		for (int i = limiteInf; i <= limiteSup; i++) {
			if (ehPrimo(i)) {
				System.out.println(i + " é um número primo!");
			}
		}
		
		// instante de tempo após término de identificação de primos
		LocalTime termino = LocalTime.now();

		// diferença entre instantes de tempos (em milissegundos)
		long tempo = inicio.until(termino, ChronoUnit.MICROS);
		
		// listagem de tempo em milissegundos para identificação de primos
		System.out.println("Tempo total (" + 
				Thread.currentThread().getName() +
				"): " + tempo);
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
