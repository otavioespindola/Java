package oo.composicao.desafio;

public class sistema {

	public static void main(String[] args) {
						
		Produto p1 = new Produto();
		p1.nome="Xampu";
		p1.preco=7.50;
		
		Produto p2 = new Produto();
		p2.nome="Pasta de Dente";
		p2.preco=4.00;
		
		Item item1 = new Item();
		item1.produto = p1;
		item1.quantidade = 3;

		Item item2 = new Item();
		item2.produto = p2;
		item2.quantidade = 5;
		
		Compra compra1 = new Compra();
		compra1.itens.add(item1);
		compra1.itens.add(item2);
		
		double totalCompra1 = compra1.obterTotalCompra();
		System.out.println(totalCompra1);
		
		Item item3 = new Item();
		item3.produto = p2;
		item3.quantidade = 10;

		Item item4 = new Item();
		item4.produto = p1;
		item4.quantidade = 1;
		
		Compra compra2 = new Compra();
		compra2.itens.add(item3);
		compra2.itens.add(item4);
		
		double totalCompra2 = compra2.obterTotalCompra();
		System.out.println(totalCompra2);
		
		Cliente cliente = new Cliente();
		
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		double totalCliente = cliente.obterTotalDeCompras();
		
		System.out.println(totalCliente);
		
		
		
		
		
		
		
		
		
		
		
	}
}
