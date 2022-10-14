package atividade3;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class triangular implements Runnable {

	private int limiteInf;
	private int limiteSup;

	public triangular(int limiteInf, int limiteSup) {

		this.limiteInf = limiteInf;
		this.limiteSup = limiteSup;

	}


	public void setLimiteInf( int limiteInf ) {
		this.limiteInf = limiteInf;
	}
	public int getLimiteInf() {
		return limiteInf;
	}

	public void setLimiteSup( int limiteSup ) {
		this.limiteSup = limiteSup;
	}
	public int getLimiteSup() {
		return limiteSup;
	}

	
	@Override
	public void run() {
		 
		int y = 0, contador = 1, contador2 = 1;
		LocalTime inicio = LocalTime.now();
		
		int qtd = 0;  // quantidade de tringulares
		
		for (int i = limiteInf; i <= limiteSup; i++) {
			int num = i;	// número que eu quero testar se é triangular
			int soma = 0;
			
			for (int j = 1; soma <= num; j++) {
				soma += j;
			}
			
			if (soma == num)
				qtd++;			
		}
		
		LocalTime termino = LocalTime.now();
		
		
		long diferenca = inicio.until(termino, ChronoUnit.MICROS);

	}
}
