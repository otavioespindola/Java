package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
//		double a = 2.3;
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!");
		System.out.println(s);
		
		String x = "otavio".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Augusto")
				.concat("!!!")
				.toUpperCase();
		
		System.out.println(y);
		
		//tipos primitivos n?o possuem operador "."

	}
}
