package com.amazoniarc.servicos;

import com.amazoniarc.entidades.Produto;
import com.amazoniarc.servicos.implementacao.DescontoBoleto;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DescontoTest {
    Produto produto;
    @Before
    public void setUp() throws Exception {
        produto = new Produto(500.00);
    }

    @Test
    public void calcula() {
        Desconto boleto = new DescontoBoleto();

    }
}