package lista.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Item> itens;
	
	public CarrinhoDeCompras() {
		this.itens = new ArrayList<>();
	}
	
	public void adicionarItem(Item item) {
		itens.add(item);
	}
	
	public float valorTotal() {
		float valorQtd;
		float valorTotal = 0;
		
		for(Item i: itens) {
			valorQtd = i.getPreco() * i.getQtd();
			valorTotal+= valorQtd;
		}
		return valorTotal;
	}

	public void exibirItens() {
		System.out.println(itens);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionarItem(new Item("Camiseta", 9000.99f, 2));
		carrinho.adicionarItem(new Item("Boxer", 4000.99f, 5));
		
		System.out.println("O valor total dos itens e de: " + carrinho.valorTotal() + "Kzs");
		carrinho.exibirItens();
	}
}
