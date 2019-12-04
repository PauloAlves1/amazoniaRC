package com.amazoniarc.controle;

import com.amazoniarc.entidades.Produto;
import com.amazoniarc.servicos.Desconto;
import com.amazoniarc.servicos.Imposto;
import com.amazoniarc.servicos.implementacao.DescontoPromocao;
import com.amazoniarc.servicos.implementacao.ImpostoINSS;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadorDeImpostoTest {
    Produto produto;
    @Before
    public void setUp() throws Exception {
        produto = new Produto(500.00);
    }

    @Test
    public void calculaImposto() {
        Imposto inss = new ImpostoINSS();
        CalculadorDeImposto calculadorImposto = new CalculadorDeImposto();
        System.out.println("Valores dos desconto na sua compra:");
        calculadorImposto.CalculaImposto(produto, inss);
    }
}