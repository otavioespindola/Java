package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro sal�rio: ");
		String salario1 = entrada.nextLine();
		System.out.println("Digite o segundo sal�rio: ");
		String salario2 = entrada.nextLine();
		System.out.println("Digite o terceiro sal�rio: ");
		String salario3 = entrada.nextLine();
		
		
		double sal1 = Double.parseDouble(salario1.replace(",", ".")); 
		double sal2 = Double.parseDouble(salario2.replace(",", ".")); 
		double sal3 = Double.parseDouble(salario3.replace(",", ".")); 
		
		double media = (sal1 + sal2 + sal3)/3;
		System.out.println("A m�dia salarial �: R$" + media);
		
		entrada.close();
	}
}
