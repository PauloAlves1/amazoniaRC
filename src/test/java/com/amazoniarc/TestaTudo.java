package com.amazoniarc;

import com.amazoniarc.controle.CalculadorDeDesconto;
import com.amazoniarc.controle.CalculadorDeFrete;
import com.amazoniarc.controle.CalculadorDeImposto;
import com.amazoniarc.entidades.Produto;
import com.amazoniarc.servicos.Desconto;
import com.amazoniarc.servicos.Frete;
import com.amazoniarc.servicos.Imposto;
import com.amazoniarc.servicos.implementacao.*;

import java.util.HashMap;
import java.util.Map;

public class TestaTudo {

	public static void main(String[] args) throws Exception {
		// gerando servi�os
		Desconto boleto = new DescontoBoleto();
		Desconto promocao = new DescontoPromocao();
		Imposto inss = new ImpostoINSS();
		Imposto iof = new ImpostoIOF();
		Frete sedex = new SedexFrete();
		//gerando tratadores de servi�os
		CalculadorDeDesconto calculadorDesconto = new CalculadorDeDesconto();
		CalculadorDeImposto calculadorImposto = new CalculadorDeImposto();
		CalculadorDeFrete calculadorFrete = new CalculadorDeFrete();
		
		//gerando produtos e colocando num hashmap
		Produto produto = new Produto(500.00);
		Produto produto1 = new Produto(500.00, "1.0", "50", "2", "25", "0.0", "1", "N", "N", "0,00", "04510", "xml", false);
		Produto produto2 = new Produto(300.00, "0.3", "30", "2", "15", "0.0", "1", "N", "N", "0,00", "04510", "xml", false);
		Produto produto3 = new Produto(50.00, "0.5", "15", "2", "10", "0.0", "1", "N", "N", "0,00", "04510", "xml", false);
		Map<Produto, String> produtoHashMap = new HashMap<>();
		produtoHashMap.put(produto1, "maxsteel"); 
		produtoHashMap.put(produto2,"avengers: o ultimato");
		produtoHashMap.put(produto3, "uma coca na tia do lanche");
  
		for(Map.Entry<Produto, String> entry : produtoHashMap.entrySet()) {
		System.out.println(entry.getKey() + "=" + entry.getValue()); }
		 
		System.out.println("Detalhes da primeira compra:");
		calculadorDesconto.CalculaDesconto(produto, boleto);
		calculadorImposto.CalculaImposto(produto, inss);
		
		System.out.println("Detalhes da segunda compra:");
		calculadorDesconto.CalculaDesconto(produto, promocao);
		calculadorImposto.CalculaImposto(produto, iof);

		calculadorFrete.CalculaFrete(produto1, sedex);

	}

}
