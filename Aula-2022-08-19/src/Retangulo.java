// Encapsulamento de dados e operações de retângulos estendendo-se classe abstrata
// e implementando-se, por consequência, método abstrado de cálculo de área
public class Retangulo extends Quadrilatero {

	// construtor com inicialização de comprimentos de lados (iguais, dois a dois)
	public Retangulo(double base, double altura) {
		super(base, altura, base, altura);
	}
	
	// cálculo e retorno de área (implementação de método abstrato)
	public double area() {
		// retorno de produto dos comprimentos de dois lados que representam, 
		// respectivamente, base e altura do retângulo (vide construtor)
		return lado1 * lado2;
	}

}