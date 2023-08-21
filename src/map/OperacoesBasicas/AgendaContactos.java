package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContactos {
	private Map<String, Integer> agendaContactosMap;

	public AgendaContactos() {
		this.agendaContactosMap = new HashMap<>();
	}
	
	public void adicionarContacto(String nome, Integer telefone) {
		agendaContactosMap.put(nome, telefone);
	}
	
	public void removerContacto(String nome) {
		if(!agendaContactosMap.isEmpty())
			agendaContactosMap.remove(nome);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if(!agendaContactosMap.isEmpty())
			numeroPorNome = agendaContactosMap.get(nome);
		return numeroPorNome;
	}
	
	public void exibirContacto() {
		System.out.println(agendaContactosMap);
	}
	
	public static void main(String[] args) {
		AgendaContactos contacto = new AgendaContactos();
		
		contacto.adicionarContacto("Aristides", 12345);
		contacto.adicionarContacto("Aristides", 5665);
		contacto.adicionarContacto("Aristides Matoca", 1111111);
		contacto.adicionarContacto("Aristides DIO", 654321);
		contacto.adicionarContacto("Camila", 1111111);
		contacto.adicionarContacto("Aristides", 444444);
		
		contacto.exibirContacto();
		contacto.removerContacto("Aristides Matoca");
		contacto.exibirContacto();
		
		System.out.println("O numero e: " + contacto.pesquisarPorNome("Aristides DIO"));
	}
}
