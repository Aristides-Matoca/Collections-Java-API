package lista.OperacoesBasicas;

public class Item {
	private String nome;
	private float preco;
	private int qtd;
	
	public Item(String nome, float preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}

	public String getNome() {
		return nome;
	}

	public float getPreco() {
		return preco;
	}

	public int getQtd() {
		return qtd;
	}

	@Override
	public String toString() {
		return "Item [nome=" + nome + ", preco=" + preco + ", qtd=" + qtd + "]";
	}
	
	
}
