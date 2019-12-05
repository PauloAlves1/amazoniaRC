package com.amazoniarc.servicos;

import com.amazoniarc.entidades.Produto;
import com.amazoniarc.servicos.implementacao.DescontoBoleto;
import com.amazoniarc.servicos.implementacao.DescontoPromocao;
import com.amazoniarc.servicos.implementacao.ImpostoIOF;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.powermock.api.mockito.PowerMockito.when;

public class DescontoTest {
    Produto produto;
    @Before
    public void setUp() throws Exception {
        produto = new Produto(500.00);
    }

    @Test
    public void calculaBoleto() {

        DescontoBoleto boleto = new DescontoBoleto();
        System.out.println("Valor da desconto de boleto na sua compra foi de:");
        double result = boleto.calcula(produto);
        assertEquals(50.0, result, 0);

    }
    @Test
    public void calculaPromocao() {
        DescontoPromocao promocao = new DescontoPromocao();
        System.out.println("Valor da desconto de promocao na sua compra foi de:");
        double result = promocao.calcula(produto);
        assertEquals(150.0, result, 0);
    }

}