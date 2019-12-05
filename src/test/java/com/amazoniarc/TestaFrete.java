package com.amazoniarc;

import com.amazoniarc.controle.CalculadorDeFrete;
import com.amazoniarc.entidades.Produto;
import com.amazoniarc.servicos.Frete;
import com.amazoniarc.servicos.implementacao.SedexFrete;

public class TestaFrete {

	public static void main(String[] args) throws Exception {
        Frete sedex = new SedexFrete();
        CalculadorDeFrete calculadorFrete = new CalculadorDeFrete();

        Produto produto1 = new Produto(500.00, "1.0", "50", "2", "25", "0.0", "1", "N", "N", "0,00", "04510", "xml");

        System.out.println("Fazendo a requisitação...");
        calculadorFrete.CalculaFrete(produto1, sedex);
	}

}
