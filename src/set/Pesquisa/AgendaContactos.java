package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContactos {

	private Set<Contacto> contactoSet;
	
	public AgendaContactos() {
		this.contactoSet = new HashSet<>();
	}

	public void adicionarContacto(Contacto contacto) {
		contactoSet.add(contacto);
	}
	
	public void exibirContactos() {
		System.out.println(contactoSet);
	}
	
	public Set<Contacto> pesquisarPorNome(String nome) {
		Set<Contacto> contactosNome = new HashSet<>();
		
		for(Contacto c: contactoSet) {
			if(c.getNome().equalsIgnoreCase(nome))
				contactosNome.add(c);
		}
		return contactosNome;
	}
	
	public Contacto actulizarContacto(Contacto contacto) {
		Contacto atualizado = null;
		
		for(Contacto c: contactoSet) {
			if(c.getNome().equalsIgnoreCase(contacto.getNome())) {
				c.setNumero(contacto.getNumero());
				atualizado = c;
				break;
			}
		}
		return atualizado;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgendaContactos agenda = new AgendaContactos();
		
		agenda.adicionarContacto(new Contacto("Aristides", 123456));
		agenda.adicionarContacto(new Contacto("Aristides", 0));
		agenda.adicionarContacto(new Contacto("Matoca", 111111));
		agenda.adicionarContacto(new Contacto("Camila", 654321));
		agenda.adicionarContacto(new Contacto("Camila Aristides", 111111));
		
		agenda.exibirContactos();
		
		System.out.println(agenda.pesquisarPorNome("Camila"));
		System.out.println("Contacto atualizado: " + agenda.actulizarContacto(new Contacto("Camila", 253633)));
		agenda.exibirContactos();
	}

}
