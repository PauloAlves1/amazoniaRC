package com.amazoniarc.servicos.implementacao;

import com.amazoniarc.entidades.Produto;
import com.amazoniarc.servicos.Desconto;

public class DescontoBoleto implements Desconto {

	@Override
	public double calcula(Produto produto) {
		return produto.getValor() * 0.1;
	}
}
