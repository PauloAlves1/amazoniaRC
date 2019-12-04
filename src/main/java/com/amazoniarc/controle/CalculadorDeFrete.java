package com.amazoniarc.controle;

import com.amazoniarc.entidades.Produto;
import com.amazoniarc.entidades.ProdutoJAXB;
import com.amazoniarc.entidades.dto.CorreiosServico;
import com.amazoniarc.servicos.Frete;

public class CalculadorDeFrete {

    public void CalculaFrete(Produto produto, Frete tipoFrete) throws Exception {
        String parametrosFrete = tipoFrete.calculaFrete(produto);
        ProdutoJAXB obj = new ProdutoJAXB();
        CorreiosServico d = (CorreiosServico) obj.unmarshall(parametrosFrete);
        System.out.println("Esse é o valor do frete desse produto");
        System.out.println(d.getcServico().getValor());
    }
}