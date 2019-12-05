package com.amazoniarc.controle;

import com.amazoniarc.entidades.Produto;
import com.amazoniarc.servicos.Desconto;
import com.amazoniarc.servicos.Imposto;
import com.amazoniarc.servicos.implementacao.DescontoPromocao;
import com.amazoniarc.servicos.implementacao.ImpostoINSS;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculadorDeImpostoTest {
    Produto produto;
    Imposto inss;
    Imposto iof;
    @Before
    public void setUp() throws Exception {
        produto = new Produto(500.00);
        inss = mock(Imposto.class);
        iof = mock(Imposto.class);
    }

    @Test
    public void calculaImpostoINSS() {
        CalculadorDeImposto calculaImposto = new CalculadorDeImposto();
        when(inss.calcula(any(Produto.class))).thenReturn(75.0);

        System.out.println("O valor do imposto inss na sua compra foi de:");
        double result = calculaImposto.CalculaImposto(produto, inss);
        assertEquals(75.0, result, 0);
        System.out.println(result);
    }
    @Test
    public void calculaImpostoIOF() {
        CalculadorDeImposto calculaImposto = new CalculadorDeImposto();
        when(iof.calcula(any(Produto.class))).thenReturn(25.0);

        System.out.println("O valor do imposto iof na sua compra foi de:");
        double result = calculaImposto.CalculaImposto(produto, iof);
        assertEquals(25.0, result, 0);
        System.out.println(result);
    }
}