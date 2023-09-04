package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CostumerExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numeros = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
	
		//Vamos usar o Costumer com expressao Lambda para imprimir os numeros pares
		Consumer<Integer> imprimirPares = numero -> {
			if(numero % 2 == 0) 
				System.out.println(numero);
		};
		
		System.out.println("Teste de stream\n");
		
		numeros.stream()
			.filter(n -> n % 2 == 0)
			.forEach(System.out::println);
	}
}