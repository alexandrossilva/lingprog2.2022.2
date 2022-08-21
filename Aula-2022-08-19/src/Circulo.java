// Encapsulamento de dados e operações de círculos 
// implementando-se interface FormaGeometrica
public class Circulo implements FormaGeometrica {

	// comprimento de raio do círculo
	private double raio;
	
	// construtor com inicialização de comprimentos de raio
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	// cálculo e retorno de perímetro (implementação de método de inteface)
	public double perimetro() {
		return 2 * Math.PI * raio;
	}

	// cálculo e retorno de área (implementação de método de inteface)
	public double area() {
		return Math.PI * raio * raio;
	}

}