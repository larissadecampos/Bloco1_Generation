package Atividades;

public class Estoque {
/*Crie uma um programa para trabalhar com estoque de uma loja, 
 *o programa deverá trabalhar com Collection do tipo List do 
 *Java para manipular os dados desse estoque, o programa deverá 
 *atender as seguintes funcionalidades:
  Armazenar dados da List
  Remover dados da list;
  Atualizar dados da list.
  Apresentar todos os dados da list.
  */
	
	//Variáveis
	
	private String produto;
	private double preço;
	private int quantidade;
	
	@Override
	public String toString() {
		return "\nproduto=" + produto + ", preço=" + preço + ", quantidade=" + quantidade;
	}
	
	
	public Estoque(String produto, double preço, int quantidade) {
		super();
		this.produto = produto;
		this.preço = preço;
		this.quantidade = quantidade;
	}


	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
	
		
	