package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
		
		//Usar o Binary Operator com expressao lambda para somar dois numeros inteiros
		BinaryOperator<Integer> somar = Integer::sum;
	
		//Usa o BinaryOperator para somar todos os numeros
		int resultado = numeros.stream()
				.reduce(0, Integer::sum);
		System.out.println("A soma dos numeros e: " + resultado);
	}
}
