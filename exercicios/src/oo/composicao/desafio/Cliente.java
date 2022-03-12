package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String nome;
	List<Compra> compras = new ArrayList<Compra>() ;
	
	double obterTotalDeCompras() {
		double totalDeCompras = 0;
		
		for(Compra compra: compras) {
			totalDeCompras += compra.obterTotalCompra();
		}		
		return totalDeCompras;		
	}
}
