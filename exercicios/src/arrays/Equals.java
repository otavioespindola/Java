package arrays;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "jose";
		u1.email= "jose@email.com";

		Usuario u2 = new Usuario();
		u2.nome = "jose";
		u2.email= "jose@email.com";
					
		var teste = u2.equals(u1);
		
		System.out.println(teste);
	}
	
	
	
}
