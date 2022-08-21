// Encapsulamento de dados e operações de quadrados estendendo-se classe abstrata
// e implementando-se, por consequência, método abstrado de cálculo de área
public class Quadrado extends Quadrilatero {

	// construtor com inicialização de comprimentos de lados (todos iguais)
	public Quadrado(double lado) {
		super(lado, lado, lado, lado);
	}
	
	// cálculo e retorno de área (implementação de método abstrato)
	public double area() {
		// retorno de produto dos comprimentos de dois dos lados (todos
		// iguais, conforme implementação de construtor)
		return lado1 * lado1;
	}

}