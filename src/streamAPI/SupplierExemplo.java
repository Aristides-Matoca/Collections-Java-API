package streamAPI;

import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.List;

public class SupplierExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> saudacao = () -> "Ola, seja bem-vindo(a)!";
		
		//Usando expressao Lambda
		List<String> listaSaudacao = Stream.generate(() -> "Ola, Seja bem-vindo(a)!")
				.limit(3)
				.toList();
		
		//Usando o classes genericas
		/*List<String> listaSaudacao = Stream.generate(
				new Supplier<String>() {
					@Override
					public String get() {
						return "Ola, seja bem-vindo(a)!";
					}
				}
			)
			.limit(3)
			.toList();*/
		listaSaudacao.forEach(System.out::println);
	}
}
