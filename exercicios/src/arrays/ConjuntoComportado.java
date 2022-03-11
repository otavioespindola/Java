package arrays;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		Set<String> lista = new HashSet<>();
		
		lista.add("Aldebaran");
		lista.add("Bison");
		lista.add("Chacka");
		
		for (String candidato: lista) {
			System.out.println(candidato);
		}
		
	}
}
