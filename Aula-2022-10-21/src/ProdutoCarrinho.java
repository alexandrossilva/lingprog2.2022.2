

// Encapsulamento de dados típicos de produtos em carrinho de compras
public class ProdutoCarrinho {
	
	private String nome;			// nome de produto
	private double precoUnitario;	// preço unitário de produto
	private double quantidade;		// quantidade de produto

	public ProdutoCarrinho(String nome, double precoUnitario, double quantidade) {
		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public double getQuantidade() {
		return quantidade;
	}

	// retorno de valor de compra de produto com base em preco unitário e quantidade
	public double getValorProduto() {
		return quantidade * precoUnitario;
	}

}