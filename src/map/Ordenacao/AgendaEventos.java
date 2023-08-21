package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {

	private Map<LocalDate, Evento> eventosMap;
	
	
	public AgendaEventos() {
		this.eventosMap = new HashMap<>();
	}

	public void adicionarEvento(LocalDate data, Evento evento) {
		eventosMap.put(data, evento);
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
	System.out.println(eventosTreeMap);
	}
	
	public void obterProximoEvento() {
		//Set<LocalDate> dataSet = eventosMap.keySet();
		//Collection<Evento> values = eventosMap.values();
		//eventosMap.get();
		
		LocalDate dataAtual = LocalDate.now();
		LocalDate proximaData = null;
		Evento proximoEvento = null;
		
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		for(Map.Entry<LocalDate, Evento> entry: eventosMap.entrySet()) {
			if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				proximaData = entry.getKey();
				proximoEvento = entry.getValue();
				System.out.println("O proximo evento: " + proximoEvento + " acontecera na data " + proximaData);
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgendaEventos eventos = new AgendaEventos();
		
		eventos.adicionarEvento(LocalDate.of(2022, Month.AUGUST, 21), new Evento("Evento 1", "Atracao 1"));
		eventos.adicionarEvento(LocalDate.of(2022, Month.JANUARY, 9), new Evento("Evento 2", "Atracao 2"));
		eventos.adicionarEvento(LocalDate.of(2000, 8, 10), new Evento("Evento 3", "Atracao 3"));
		eventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 21), new Evento("Evento 5", "Atracao 5"));
		eventos.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 20), new Evento("Evento 6", "Atracao 6"));
	
		eventos.exibirAgenda();
		eventos.obterProximoEvento();
	}
}
