package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		//Hash converte os tipos primitivos em seus wrappers
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');	
		
		System.out.println(conjunto.size());
	
		//tentar adicionar elemento j? existente, comando ? ignorado
		conjunto.add("Teste");
		System.out.println(conjunto.size());
		
		// metodo remove retorna verdadeiro caso o elemento exista e falso caso n?o exista
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		
		//metodo contains verifica se o conjunto contem o argumento
		System.out.println(conjunto.contains('x'));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		//conjunto.addAll(nums);
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
	}
}
