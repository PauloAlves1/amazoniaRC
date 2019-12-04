package com.amazoniarc.servicos.implementacao;

import com.amazoniarc.entidades.Produto;
import com.amazoniarc.servicos.Desconto;

public class DescontoPromocao implements Desconto {

	@Override
	public double calcula(Produto produto) {
		return produto.getValor() * 0.3;
	}
}
