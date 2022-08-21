// Encapsulamento de dados e operações de quadriláteros implementando-se
// apenas um dos métodos definidos em interface FormaGeometrica (métodos
// restantes serão abstrados em virtude da classe ser abstrata)
public abstract class Quadrilatero implements FormaGeometrica {

	// comprimentos dos lados
	protected double lado1, lado2, lado3, lado4;
	
	// construtor para inicialização de comprimentos dos lados
	public Quadrilatero(double lado1, double lado2, double lado3, double lado4) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
	}

	// métodos de obtenção de comprimentos dos lados
	public double getLado1() {
		return lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public double getLado4() {
		return lado4;
	}

	// métodos de atualização de comprimentos dos lados
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	public void setLado4(double lado4) {
		this.lado4 = lado4;
	}

	// implementação de cálculo e retorno de perímetro do quadrilátero
	public double perimetro() {
		// retorno da soma dos comprimentos dos 4 (quatro) lados
		return lado1 + lado2 + lado3 + lado4;
	}

}