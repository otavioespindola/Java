package oo.abstrato;

public class Cachorro extends Mamifero {
	
	@Override
	public String mamar() {
		
		return "Com leite";
	}

	@Override
	public String mover() {
		
		return "Usando as patas";
	}
	
	public String respirar() {
		return "usando O2";
	};
	
	
	

}
