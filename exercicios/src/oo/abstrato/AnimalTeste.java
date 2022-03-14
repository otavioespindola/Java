package oo.abstrato;

public class AnimalTeste {

	public static void main(String[] args) {
		Mamifero cao = new Cachorro();
		
		System.out.println(cao.mamar());
		System.out.println(cao.mover());
		System.out.println(cao.respirar());
		
	}
}
