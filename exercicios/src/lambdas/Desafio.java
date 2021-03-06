package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		Produto p = new Produto("Ipad", 4235.89, 0.13);
		
		
		Function<Produto, Double> precoReal =
				prod -> prod.preco * (1-prod.desconto);

		UnaryOperator<Double> imposto = 
				preco -> preco >= 2500 ? preco *=1.085 
									   : preco;
		
		UnaryOperator<Double> frete = 
				valorFinal -> valorFinal >= 3000.00 ? (valorFinal += 100)
													: (valorFinal += 50);
		
		UnaryOperator<Double> arredonda = 
				valor -> Math.round(valor*100.0)/100.0;
				
		Function<Double, String> formata = 
				valor -> ("R$" + valor).replace(".",",");
				
		var teste = precoReal
				.andThen(imposto)
				.andThen(frete)
				.andThen(arredonda)
				.andThen(formata)
				.apply(p);
		
		System.out.println(teste);
				
				
				
				
				
				
		
	}
}
