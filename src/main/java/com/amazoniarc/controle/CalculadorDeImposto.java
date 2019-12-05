package com.amazoniarc.controle;

import com.amazoniarc.entidades.Produto;
import com.amazoniarc.servicos.Imposto;

public class CalculadorDeImposto {
	public double CalculaImposto(Produto produto, Imposto tipoImposto) {

		double valorImposto = tipoImposto.calcula(produto);
		System.out.println(valorImposto);
		return valorImposto;
	}

}
