package streamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		int soma = numeros.stream()
		                .filter(n -> n % 2 == 0) // Filtrar números pares
		                .mapToInt(Integer::intValue) // Mapear para tipos primitivos
		                .sum(); // Calcular a soma

		System.out.println("Soma dos números pares: " + soma);

	}
}