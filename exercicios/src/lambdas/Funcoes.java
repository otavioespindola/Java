package lambdas;

import java.util.function.Function;

public class Funcoes {

	
	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0 ? "Par" : "Impar";

		System.out.println(parOuImpar.apply(5));
		
		Function<String, String> oResultadoE = valor -> "O resultado ?: " + valor;
		
		System.out.println(oResultadoE.apply(parOuImpar.apply(5)));
		
		String resultadoFinal = parOuImpar.andThen(oResultadoE).apply(42);
		
		System.out.println(resultadoFinal);
				
	}
	
	
	
	
}
