package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas? ");
		int qtd = entrada.nextInt();
		double[] notas = new double[qtd];
		
		for (int i = 0; i <= notas.length-1 ; i++) {
			System.out.printf("Digite a %d nota: \n", i+1);
//			String aux = entrada.next();
//			notas[i] = Double.parseDouble(aux);
			notas[i] = entrada.nextDouble();
		}
		
		double total = 0;
		for (double nota: notas) {
			total += nota;
		}
		
		double media = total/notas.length;
		
		System.out.printf("A m?dia do aluno ? %f \n", media);		
		
		entrada.close();
		
	}
}
