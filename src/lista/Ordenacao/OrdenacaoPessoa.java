package lista.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
	private List<Pessoa> pessoaList;
	
	public OrdenacaoPessoa() {
		this.pessoaList = new ArrayList<>();
	}

	public void adicionarPessoa(Pessoa pessoa) {
		pessoaList.add(pessoa);
	}
	
	public List<Pessoa> ordernarIdade(){
		List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
		Collections.sort(pessoaPorIdade); //Interface com o metodo sort para ordenar por idade atraves do comparable que esta na classe Pessoa
		return pessoaPorIdade;
	}
	
	public List<Pessoa> ordenarAltura(){
		List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
		Collections.sort(pessoaPorAltura, new ComparatorPorAltura()); 
		return pessoaPorAltura;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrdenacaoPessoa ordenar = new OrdenacaoPessoa();
		ordenar.adicionarPessoa(new Pessoa("Nome 1", 20, 1.56));
		ordenar.adicionarPessoa(new Pessoa("Nome 2", 30, 1.80));
		ordenar.adicionarPessoa(new Pessoa("Nome 3", 25, 1.70));
		ordenar.adicionarPessoa(new Pessoa("Nome 4", 17, 1.56));
		
		System.out.println(ordenar.ordernarIdade());
		System.out.println(ordenar.ordenarAltura());
	}
}
