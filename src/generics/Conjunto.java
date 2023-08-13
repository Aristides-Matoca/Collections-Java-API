package generics;

import java.util.HashSet;
import java.util.Set;

public class Conjunto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Object> setUngeneric = new HashSet<>();
		setUngeneric.add("Angola");
		setUngeneric.add(10.6);
		
		for(Object a: setUngeneric)
			System.out.println(a);
		
		Set<Integer> setGeneric = new HashSet<>();
		setGeneric.add(10);
		setGeneric.add(12);
		
		for(int b: setGeneric)
			System.out.println(b);
	}
}