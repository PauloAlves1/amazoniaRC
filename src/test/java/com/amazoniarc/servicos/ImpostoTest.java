package com.amazoniarc.servicos;

import com.amazoniarc.entidades.Produto;
import com.amazoniarc.servicos.implementacao.DescontoBoleto;
import com.amazoniarc.servicos.implementacao.ImpostoINSS;
import com.amazoniarc.servicos.implementacao.ImpostoIOF;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImpostoTest {
    Produto produto;
    @Before
    public void setUp() throws Exception {
        produto = new Produto(500.00);
    }

    @Test
    public void calculaINSS() {
        ImpostoINSS inss = new ImpostoINSS();
        System.out.println("O valor do imposto inss na sua compra foi de:");
        double result = inss.calcula(produto);
        assertEquals(75.0, result, 0);
    }
    @Test
    public void calculaIOF() {
        ImpostoIOF iof = new ImpostoIOF();
        System.out.println("O valor do imposto inss na sua compra foi de:");
        double result = iof.calcula(produto);
        assertEquals(25.0, result, 0);
    }

}