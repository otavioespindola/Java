package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		double precofinal1 = p1.precoComDesconto(); 
		double precofinal2 = p2.precoComDesconto(0.15); 
		
		System.out.printf("%s custar� R$%.2f\n", p1.nome, precofinal1);
		System.out.printf("%s custar� R$%.2f", p2.nome, precofinal2);		

	}
}
