package com.amazoniarc.controle;

import com.amazoniarc.entidades.Produto;
import com.amazoniarc.servicos.Desconto;

public class CalculadorDeDesconto {
	
	public double CalculaDesconto(Produto produto, Desconto tipoDesconto) {
		
			double valorDesconto = tipoDesconto.calcula(produto);
			System.out.println(valorDesconto);
		return valorDesconto;
	}
}
