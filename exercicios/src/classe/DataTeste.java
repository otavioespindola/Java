package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 20;
		d1.mes = 01;
		d1.ano = 1987;
		
		Data d2 = new Data();
		d2.dia = 25;
		d2.mes = 12;
		d2.ano = 2021;
		
		
		
		System.out.println(d1.dataFormatada());
		
		String data2 = d2.dataFormatada();
		System.out.println(data2);
		
	}
}
