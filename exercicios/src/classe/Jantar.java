package classe;


public class Jantar {
	

	public static void main(String[] args) {
		Pessoa joao = new Pessoa("Joao", 86);
		Comida entrada = new Comida("sopa", 0.200);
		Comida prato = new Comida("Macarrao", 0.500);
		
		System.out.println(joao.peso);
			
		joao.Come(entrada);
		
		System.out.println(joao.peso);
		
		joao.Come(prato);
		
		System.out.println(joao.peso);	
		
	}
}
