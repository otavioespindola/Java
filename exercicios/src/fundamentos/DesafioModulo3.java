package fundamentos;

import java.util.Scanner;

public class DesafioModulo3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n?mero: ");
		double num1 = entrada.nextDouble();
		System.out.println("Digite outro n?mero: ");
		double num2 = entrada.nextDouble();
		System.out.println("Digite uma opera??o: (+ - * / %): ");
		String operador = entrada.next();
		
		double resultado = operador.equals("+")? num1 + num2 : 
			operador.equals("-")?  num1-num2 :
			operador.equals("/")?  num1/num2 :
			operador.equals("*")?  num1*num2 :
			num1%num2;
		
		System.out.println("O resultado ?: " + resultado);
		
		
		entrada.close();
	}
}
