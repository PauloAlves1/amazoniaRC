package com.amazoniarc.controle;

import com.amazoniarc.entidades.Produto;
import com.amazoniarc.servicos.Desconto;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculadorDeDescontoTest {
    Produto produto1;
    Produto produto;
    Desconto boleto;
    Desconto promocao;
    private Object IOException;

    @Before
    public void setUp() throws Exception {
        produto = new Produto(500.00);
        boleto = mock(Desconto.class);
        promocao = mock(Desconto.class);
    }

    @Test
    public void calculaDescontoBoleto() throws Exception {
        CalculadorDeDesconto calculadorDesconto = new CalculadorDeDesconto();
        when(boleto.calcula(any(Produto.class))).thenReturn(50.0);

        System.out.println("Valor da desconto de boleto na sua compra foi de:");
        double result = calculadorDesconto.CalculaDesconto(produto, boleto);
        assertEquals(50.0, result, 0);
        System.out.println(result);

    }
    @Test
    public void calculaDescontoPromocao() throws Exception {
        CalculadorDeDesconto calculadorDesconto = new CalculadorDeDesconto();
        when(promocao.calcula(any(Produto.class))).thenReturn(150.0);

        System.out.println("Valor da desconto de promocao na sua compra foi de:");
        double result = calculadorDesconto.CalculaDesconto(produto, promocao);
        assertEquals(150.0, result, 0);
        System.out.println(result);

    }

}