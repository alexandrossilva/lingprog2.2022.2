import java.util.Date;

// Encapsulamento de dados de voos e respectivas operações
public class Voo {

	public final static int TAM = 5;	// capacidade de assentos de cada voo
	
	// array para indicação de situação de cada assento (livre, se true, ou ocupado, se false)
	protected boolean[] assentos;
	protected int numero;				// número de voo
	protected Date dataHorario;			// data e horário de voo
		
	public Voo(int numero, Date dataHorario) {
		assentos = new boolean[TAM];	// inicialização de capacidade de voo
		this.numero = numero;
		this.dataHorario = dataHorario;
	}
	
	public int getNumero() {
		return numero;
	}

	public Date getDataHorario() {
		return dataHorario;
	}

	// obtenção de número de próximo assento livre (entre 1 e a capacidade do voo)
	public int getProximoAssentoLivre() {
		// consulta de situação de assentos de acordo com valores booleanos de array
		for (int i = 0; i < assentos.length; i++) {
			if (!assentos[i])		// se enésimo valor for false (assento livre)...
				return i + 1;		// retorno de número de enésimo assento
		}
		
		return -1; 					// indicativo de ausência de assentos livres (se for o caso)
	}
	
	// obtenção de quantidade total de assentos livres
	public int getTotalAssentosLivres() {
		int qtd = 0;				// inicalização de totalizador
		
		// consulta de situação de assentos de acordo com valores booleanos de array
		for (int i = 0; i < assentos.length; i++) {
			if (!assentos[i])		// se enésimo valor for false (assento livre)...
				qtd++;				// incremento de totalizador em 1 (um) unidade
		}
		
		return qtd;					// retorno de total de assentos livres
	}
	
	// obtenção de quantidade total de assentos livres
	public double getTaxaOcupacao() {
		// obtenção de quantidade de assentos livres
		int assentosLivres = getTotalAssentosLivres();
		
		// obtenção de quantidade de assentos ocupados a partir de assentos livres
		int assentosOcupados = assentos.length - assentosLivres;
		
		// cálculo e retorno de percentual de ocupação considerando capacidade de cada voo
		return assentosOcupados * 100.0 / assentos.length;
	}

	// reserva de assento com retorno de valor booleano de acordo com resultado da operação
	public boolean ocuparAssento(int n) {
		if (n < 1 || n > assentos.length)	// se número de assento inválido...
			return false;					// retorno de false (reserva de assento não efetivada)
		else if (assentos[n - 1])			// se assento estiver ocupado...
			return false;					// retorno de false (reserva de assento não efetivada)
		else {								// caso contrário...
			// atualização de valor boleano em índice de array correspondente ao número de assento
			assentos[n - 1] = true;
			return true;					// retorno de true (reserva de assento efetivada)
		}
	}
	
	
	
	
	
	
	
}