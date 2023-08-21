package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	
	private Set<Convidado> convidadoSet;
	
	
	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}
	
	public void adicionarConvidado(Convidado convidado) {
		convidadoSet.add(convidado);
	}
	
	public void removerConvidadoPorCodigo(int codigo) {
		Convidado convidadoPorRemover = null;
		
		for(Convidado c: convidadoSet) {
			if(c.getCodigo() == codigo) {
				convidadoPorRemover = c;
				break;
			}
		}
		convidadoSet.remove(convidadoPorRemover);
	}
	
	public int contarConvidado() {
		return convidadoSet.size();
	}
	
	public void exibirConvidado() {
		System.out.println(convidadoSet);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConjuntoConvidados convidados = new ConjuntoConvidados();
		
		convidados.adicionarConvidado(new Convidado("Convidado 1", 1234));
		convidados.adicionarConvidado(new Convidado("Convidado 2", 1235));
		convidados.adicionarConvidado(new Convidado("Convidado 3", 1235));
		convidados.adicionarConvidado(new Convidado("Convidado 4", 1236));
		
		System.out.println("Existem " + convidados.contarConvidado() + " dentro do Set Convidados");
		
		convidados.removerConvidadoPorCodigo(1234);
		
		convidados.exibirConvidado();
	}
}
