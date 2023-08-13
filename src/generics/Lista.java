package generics;
import java.util.ArrayList;
import java.util.List;

class Lista {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> listaUngenerics = new ArrayList<>();
		listaUngenerics.add("Aristides");
		listaUngenerics.add(10);
		
		for(Object a: listaUngenerics)
			System.out.println(a);
		
		List<String> listaGenerics = new ArrayList<>();
		listaGenerics.add("Something");
		listaGenerics.add("Somebody");
		
		System.out.println();
		for(String b: listaGenerics)
			System.out.println(b);
	}
}