package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class PalavrasUnicas {

	private Set<String> palavraSet;
	
	
	
	public PalavrasUnicas() {
		this.palavraSet = new HashSet<>();
	}
	
	public void adicionarPalavra(String palavra) {
		palavraSet.add(palavra);
	}
	
	public void removerPalavra(String palavra) {
		String remover = null;
		
		for(String p: palavraSet) {
			if(p.equalsIgnoreCase(palavra)) {
				remover = p;
				break;
			}
		}
		palavraSet.remove(remover);
	}
	
	public String verificarPalavra(String palavra) {
		String value = "Nao existe";
		
		for(String p: palavraSet) {
			if(p.equalsIgnoreCase(palavra)){
				value = "Exite";
			}
		}
		return value;
	}
	
	public void exibirPalavras() {
		for(String p: palavraSet)
			System.out.println(p);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalavrasUnicas palavra = new PalavrasUnicas();
		
		palavra.adicionarPalavra("Palavra 1");
		palavra.adicionarPalavra("Palavra 2");
		palavra.adicionarPalavra("Palavra 3");
		palavra.adicionarPalavra("Palavra 4");
		
		palavra.removerPalavra("Palavra 4");
		System.out.println(palavra.verificarPalavra("Palavra 2"));
		palavra.exibirPalavras();
		
	}
}