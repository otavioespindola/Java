package fundamentos;

public class DesafioOperadores {
	public static void main(String[] args) {
		
		double numerador1 = Math.pow((6*(3+2)), 2);
		double denominador1 = 3*2;
		
		double primeirafracao = numerador1/denominador1;
		
		double numerador2 = (1-5)*(2-7);
		double denominador2 = 2;
		
		
		double  segundafracao = Math.pow(numerador2/denominador2, 2);
//		System.out.println(segundafracao);
		
		double numeradorTotal = Math.pow(primeirafracao-segundafracao,3);
		double denominadorTotal = Math.pow(10, 3);
		
		double resultado = numeradorTotal/denominadorTotal;
		
		System.out.println(resultado);
	}
}
