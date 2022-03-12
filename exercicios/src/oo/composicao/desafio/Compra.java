package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	List<Item> itens = new ArrayList<Item>();
	
	double obterTotalCompra() {
		double totalCompra = 0;
		for(Item item: itens) {
			totalCompra += item.produto.preco * item.quantidade;
		}
		return totalCompra;
	}
}
