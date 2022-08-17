package v1;

// Classe de encapulamento de datas indicadas por dia do mês, mês e ano 
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
		return (dia < 10 ? "0" : "") + dia + "/" + 
			   (mes < 10 ? "0" : "") + mes + "/" + 
			   ano;
	}

}