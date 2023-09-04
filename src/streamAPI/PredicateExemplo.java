package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "Java Script", "C", "Go", "Ruby");
		
		Predicate<String> cincoCaracteres = palavra -> palavra.length() > 5;
		
		//Usar o Stream para filtrar as palavras com mais de 5 caracteres e imprimir cada palavra
		palavras.stream()
			.filter(n -> n.length() < 5)
			.forEach(System.out::println);
	}
}