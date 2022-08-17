package v2;

/* Classe de encapulamento de datas indicadas por dia do mês, mês e ano distinguindo-se da 
 * classe homônima do pacote v1 em relação à implementação do método mostrarData (substituição
 * de operador ternário) e de incorporação de método para obtenção de dias restantes para o 
 * término do ano no qual se situa data encapsulada
 */
public class Data {

	private int dia;	// dia (um inteiro entre 1 e, a depender do mês e ano, 28, 29, 30 ou 31)
	private int mes;	// mês (um inteiro entre 1 e 12)
	private int ano;	// ano (um inteiro de 4 dígitos)
	
	// obtenção de dia da data encapsulada
	public int getDia() {
		return dia;
	}
	
	// método para modificação de dia da data encapsulada
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	// obtenção de mês da data encapsulada
	public int getMes() {
		return mes;
	}
	
	// método para modificação de mês da data encapsulada
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	// obtenção de ano da data encapsulada
	public int getAno() {
		return ano;
	}
	
	// método para modificação de ano da data encapsulada
	public void setAno(int ano) {
		this.ano = ano;
	}

	// método para modificação simultânea de dia, mês e ano de data
	public void set(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	// construtor para indicação de data a partir de dia, mês e ano
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	// retorno de string representativa da data encapsulada no formado DD/MM/AAAA
	public String mostrarData() {
		String s = "";							// string de retorno
		
		// concatenação de dígitos correspondentes ao dia (inclusive de dígito 0, se necessário)
		if (dia < 10) { s += "0" + dia; }
		else          { s += dia;       }
		
		// concatenação de caractere de barra para separação entre dia e mês
		s += "/";
		
		// concatenação de dígitos correspondentes ao mês (inclusive de dígito 0, se necessário)
		if (mes < 10) { s += "0" + mes; }
		else          { s += mes;       }
		
		// concatenação de caractere de barra para separação entre mês e ano
		s += "/";
		
		// concatenação de dígitos correspondentes ao ano supondo-se que ele tenha 4 dígitos	
		s += ano;
		
		return s;								// retorno de string
	}

	// retorno de quantidade de dias restantes para o término do ano em que se situa a data encapsulada
	public int getDiasTerminoAno() {
		// quantidade total de dias de cada mês do ano
		int[] qtdDias = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// alteração de quantidade total de dias do mês de fevereiro se data for de ano bissexto
		if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0)))
			qtdDias[1]++;				

		if (mes == 12) {						// se mês da data for dezembro...
			// dias restantes equivalente à diferença entre 31 e dia da data acrescida de 1 (um)
			return 31 - dia + 1;
		}
		else {									// caso contrário (mês anterior a dezembro)...
			// diferença entre total de dias do mês e dia da data acrescida de 1 (um)
			int diasRestantes = qtdDias[mes-1] - dia + 1;

			// contibilização de total de dias dos meses subsequentes (até alcançar o mês de dezembro)
			for (int i = mes + 1; i <= 12; i++)
				diasRestantes += qtdDias[i-1];	// acréscimo de total de dias do enésimo mês à diferença inicial 
				
			return diasRestantes;				// retorno de total de dias restantes
		}
	}
	
}