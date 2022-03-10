package fundamentos;

import java.util.Scanner;

public class DesafioModulo3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double num1 = entrada.nextDouble();
		System.out.println("Digite outro número: ");
		double num2 = entrada.nextDouble();
		System.out.println("Digite uma operação: (+ - * / %): ");
		String operador = entrada.next();
		
		double resultado = operador.equals("+")? num1 + num2 : 
			operador.equals("-")?  num1-num2 :
			operador.equals("/")?  num1/num2 :
			operador.equals("*")?  num1*num2 :
			num1%num2;
		
		System.out.println("O resultado é: " + resultado);
		
		
		entrada.close();
	}
}
