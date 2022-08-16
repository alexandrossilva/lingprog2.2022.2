package v2;

public class Data {

	private int dia;
	private int mes;
	private int ano;
	
	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}

	public void set(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public int getDiasTerminoAno() {
		int[] qtdDias = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// verificação de ano bissexto
		if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0)))
				qtdDias[1]++;				

		if (mes == 12) {
			return 31 - dia + 1;
		}
		else {
			int totalDias = qtdDias[mes-1] - dia + 1;

			for (int i = mes + 1; i <= 12; i++)
				totalDias += qtdDias[i-1]; 
				
			return totalDias;
		}
	}
	
	public String mostrarData() {
		String s = "";
		
		if (dia < 10) { s += "0" + dia; }
		else          { s += dia;       }
		
		s += "/";
		
		if (mes < 10) { s += "0" + mes; }
		else          { s += mes;       }
		
		s += "/" + ano;
		
		return s;
	}

}