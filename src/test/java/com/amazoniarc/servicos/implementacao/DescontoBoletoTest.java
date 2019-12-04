package com.amazoniarc.servicos.implementacao;

import com.amazoniarc.entidades.Produto;
import com.amazoniarc.integracao.Correios;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest({DescontoBoleto.class})
public class DescontoBoletoTest {
    Produto produto;
    @Before
    public void setUp() throws Exception {
        produto = new Produto(500.00);
    }

    @Test
    public void calculaBoleto() {
        when(DescontoBoleto.calcula(any())).thenReturn(50.0);

    }
}