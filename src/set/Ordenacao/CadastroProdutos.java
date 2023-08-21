package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

	private Set<Produto> cadastroSet;
	
	public CadastroProdutos() {
		this.cadastroSet = new HashSet<>();
	}
	
	public void adicionarProduto(Produto produto) {
		cadastroSet.add(produto);
	}
	
	public Set<Produto> exibirPorNome(){
		Set<Produto> produtoNome = new TreeSet<>(cadastroSet);
		return produtoNome;
	}
	
	public Set<Produto> exibirPorPreco(){
		Set<Produto> produtoPreco = new TreeSet<>(new ComparatorPorPreco());
		produtoPreco.addAll(cadastroSet);
		return produtoPreco;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CadastroProdutos cadastro = new CadastroProdutos();
		
		cadastro.adicionarProduto(new Produto(1L, "Produto 5", 15d, 5));
		cadastro.adicionarProduto(new Produto(2L, "Produto 0", 20d, 10));
		cadastro.adicionarProduto(new Produto(3L, "Produto 3", 10d, 2));
		cadastro.adicionarProduto(new Produto(9L, "Produto 9", 02d, 2));
		
		System.out.println(cadastro.cadastroSet);
		System.out.println(cadastro.exibirPorNome());
		System.out.println(cadastro.exibirPorPreco());
	}
}
