import java.util.Date;
import java.util.Random;

public class ReservadorVoo implements Runnable {

	private Voo voo;
	
	public ReservadorVoo(int numero, Date dataHorario) {
		voo = new Voo(numero, dataHorario);
	}
	
	public void run() {
		final int MAX = 70;
		Random gerador = new Random();
		
		while (voo.getTotalAssentosLivres() != 0) {
			int assento = gerador.nextInt(MAX) + 1;
			
			voo.ocuparAssento(assento);
			
			try {
				Thread.currentThread().sleep(1000);				
			}
			catch(InterruptedException e) {
				System.out.println("Tentativa de interrupção da thread");				
			}
		}		
	}
	
	public double getTaxaOcupacao() {
		return voo.getTaxaOcupacao();
	}
	
}