package lista.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	private List<Livro> livroList;

	public CatalogoLivros() {
		super();
		this.livroList = new ArrayList<>();
	}
	
	public void adicionarLivro(Livro livro) {
		livroList.add(livro);
	}
	
	public List<Livro> pesquisarAutor(String autor){
		List<Livro> livrosAutor = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for(Livro l: livroList) {
				if(l.getAutor().equalsIgnoreCase(autor))
					livrosAutor.add(l);
			}
		}
		return livrosAutor;
	}
	
	public List<Livro> pesquisarAno(int anoInicial, int anoFinal){
		List<Livro> livrosPorAno = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for(Livro l: livroList) {
				if((l.getAno() >= anoInicial) && (l.getAno() <= anoFinal))
					livrosPorAno.add(l);
			}
		}
		return livrosPorAno;
	}
	
	public Livro pesquisarTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if(!livroList.isEmpty()) {
			for(Livro l: livroList) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		return livroPorTitulo;
	}
	
	public static void main(String[] args) {
		CatalogoLivros catalogo = new CatalogoLivros();
		catalogo.adicionarLivro(new Livro("Livro 1", "Autor 1", 2020));
		catalogo.adicionarLivro(new Livro("Livro 2", "Autor 2", 2021));
		catalogo.adicionarLivro(new Livro("Livro 2", "Autor 2", 2022));
		catalogo.adicionarLivro(new Livro("Livro 3", "Autor 3", 2023));
		catalogo.adicionarLivro(new Livro("Livro 4", "Autor 4", 1994));
		
		System.out.println(catalogo.pesquisarAutor("Autor 4"));
		System.out.println(catalogo.pesquisarAno(2020, 2022));
		System.out.println(catalogo.pesquisarTitulo("Livro 1"));
	}
}