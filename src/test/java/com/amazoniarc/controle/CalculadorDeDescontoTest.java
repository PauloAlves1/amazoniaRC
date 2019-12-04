package com.amazoniarc.controle;

import com.amazoniarc.entidades.Produto;
import com.amazoniarc.servicos.Desconto;
import com.amazoniarc.servicos.implementacao.DescontoBoleto;
import org.junit.Before;
import org.junit.Test;

public class CalculadorDeDescontoTest {

    Produto produto;
    @Before
    public void setUp() throws Exception {
        produto = new Produto(500.00);
     }

    @Test
    public void calculaDesconto() {

        Desconto boleto = new DescontoBoleto();
        CalculadorDeDesconto calculadorDesconto = new CalculadorDeDesconto();
        System.out.println("Valores dos desconto na sua compra:");
        calculadorDesconto.CalculaDesconto(produto, boleto);

    }
}