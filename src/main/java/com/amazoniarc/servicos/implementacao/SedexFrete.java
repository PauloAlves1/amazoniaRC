package com.amazoniarc.servicos.implementacao;

import com.amazoniarc.entidades.Produto;
import com.amazoniarc.integracao.Correios;
import com.amazoniarc.servicos.Frete;

import java.io.IOException;

public class SedexFrete implements Frete {

	@Override
	public String calculaFrete(Produto produto) {
		String xml = null;
		try {
			xml = Correios.fazGET(produto.requestUrl());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return xml;
	}



}
