package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informa??es de um Funcion?rio
		
		//Tipos num?ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos= 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		//Tipos num?rios reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_789_103.01;
		
		//tipo Boolean;
		boolean estaDeFerias= false; //true
		
		//tipo Caracter
		char status = 'A'; // um ?nico caracter
		
		//Dias de empresa
		System.out.println(anosDeEmpresa*365 + " dias de empresa");
		
		System.out.println(numeroDeVoos/2 + " viagens realizadas");
		
		System.out.println(pontosAcumulados/vendasAcumuladas + " pontos por venda ");
		
		System.out.println(id + " ganha R$" + salario);
		System.out.println("Est? de f?rias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}
	
	
}
