package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
	
	private Map<Long, Produto> estoqueProdutoMap;

	public EstoqueProduto() {
		this.estoqueProdutoMap = new HashMap<>();
	}
	
	public void adicionarProduto(Long cod, Produto produto) {
		estoqueProdutoMap.put(cod, produto);
	}
	
	public void exibirProduto() {
		System.out.println(estoqueProdutoMap);
	}

	public double calcularTotalEstoque() {
		double valorTotal = 0d;
		if(!estoqueProdutoMap.isEmpty()) {
			for(Produto p: estoqueProdutoMap.values()) {
				valorTotal += p.getQuantidade() * p.getPreco();
			}
		}
		return valorTotal;
	}
	
	public Produto obterProdutoCaro() {
		Produto produtoCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		if(!estoqueProdutoMap.isEmpty()) {
			for(Produto p: estoqueProdutoMap.values()) {
				if(p.getPreco() > maiorPreco)
					produtoCaro = p;
			}
		}
		return produtoCaro;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EstoqueProduto estoque = new EstoqueProduto();
		
		estoque.adicionarProduto(1L, new Produto("Produto A", 5.0, 10));
		estoque.adicionarProduto(2L, new Produto("Produto B", 10.0, 5));
		estoque.adicionarProduto(3L, new Produto("Produto C", 15.0, 2));
		
		estoque.exibirProduto();
		System.out.println("Valor total so estoque: R$" + estoque.calcularTotalEstoque());
		System.out.println("Produto mais caro: " + estoque.obterProdutoCaro());
		
	}
}
