package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		//Calculo m�dia par ao aluno A
		
		double[] notasAlunoA = new double[4];
		notasAlunoA[0]=7.9;
		notasAlunoA[1]=8;
		notasAlunoA[2]=6.7;
		notasAlunoA[3]=9.7;		
		System.out.println(Arrays.toString(notasAlunoA));		
		double totalA=0;		
//		for (int i=0 ; i<notasAlunoA.length ; i++) {
//			totalA += notasAlunoA[i];
//		}
		
		for(double nota: notasAlunoA) {
			totalA += nota;
		}
		
		double mediaA = totalA/notasAlunoA.length;		
		System.out.println(mediaA);
		
		//Calculo da m�dia para aluno B
		double[] notasAlunoB = { 6.9, 8.9 , 5.5 , 10 };
		System.out.println(Arrays.toString(notasAlunoB));
		double totalB = 0;
		for (int i=0; i<notasAlunoB.length; i++) {
			totalB += notasAlunoB[i];
		}
		double mediaB = totalB/notasAlunoB.length;
		System.out.println(mediaB);
		
		
		
	}
	
}
