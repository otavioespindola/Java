package classe;

public class Pessoa {

	String nome;
	double peso;
	
	 Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	 
	void Come(Comida c) {
			this.peso += c.peso;		
		}
	
}
