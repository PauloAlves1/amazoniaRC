package com.amazoniarc;

import com.amazoniarc.controle.CalculadorDeDesconto;
import com.amazoniarc.entidades.Produto;
import com.amazoniarc.servicos.Desconto;
import com.amazoniarc.servicos.implementacao.DescontoBoleto;
import com.amazoniarc.servicos.implementacao.DescontoPromocao;

public class TesteDeBoleto {
    public static void main(String[] args) throws Exception {
        Desconto boleto = new DescontoBoleto();
        Desconto promocao = new DescontoPromocao();

        CalculadorDeDesconto calculadorDesconto = new CalculadorDeDesconto();

        Produto produto = new Produto(500.00);
        System.out.println("Valores dos desconto na sua compra:");
        calculadorDesconto.CalculaDesconto(produto, promocao);
        calculadorDesconto.CalculaDesconto(produto, boleto);

    }
}
