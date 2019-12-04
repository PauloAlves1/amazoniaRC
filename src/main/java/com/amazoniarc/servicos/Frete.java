package com.amazoniarc.servicos;

import com.amazoniarc.entidades.Produto;

public interface Frete {
	String calculaFrete(Produto produto);
}
