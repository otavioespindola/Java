package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (F - 32)* 5/9 = C;
		
		double F = 86;
		final double AJUSTE = 32.0;
		final double FATOR = 5.0/9.0;
		double C = (F-AJUSTE)*FATOR;
		System.out.println(C);
		
		F = 126;
		C = (F-AJUSTE)*FATOR;
		System.out.println(C);
	}
}
