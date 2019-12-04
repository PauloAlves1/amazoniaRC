package com.amazoniarc.controle;

import com.amazoniarc.entidades.Produto;
import com.amazoniarc.servicos.Desconto;

public class CalculadorDeDesconto {
	
	public void CalculaDesconto(Produto produto, Desconto tipoDesconto) {
		
			double valorDesconto = tipoDesconto.calcula(produto);
			System.out.println(valorDesconto);
	}
}
