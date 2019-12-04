package com.amazoniarc.servicos.implementacao;

import com.amazoniarc.entidades.Produto;
import com.amazoniarc.integracao.Correios;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Correios.class})
public class SedexFreteTest {

    Produto produto;
    String xmlRespostaCorreios;

    @Before
    public void setUp() throws Exception {
        produto = new Produto(500.00, "1.0", "50", "2", "25", "0.0",
                "1", "N", "N", "0,00", "04510", "xml");
        xmlRespostaCorreios = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?><Servicos><cServico><Codigo>04510" +
                "</Codigo><Valor>24,80</Valor><PrazoEntrega>8</PrazoEntrega><ValorSemAdicionais>24,80</ValorSemAdicionais>" +
                "<ValorMaoPropria>0,00</ValorMaoPropria><ValorAvisoRecebimento>0,00</ValorAvisoRecebimento>" +
                "<ValorValorDeclarado>0,00</ValorValorDeclarado><EntregaDomiciliar>S</EntregaDomiciliar>" +
                "<EntregaSabado>N</EntregaSabado><obsFim></obsFim><Erro>0</Erro><MsgErro></MsgErro></cServico></Servicos>";
    }

    @Test
    public void calculaFrete() throws Exception {

        PowerMockito.mockStatic(Correios.class);
        Correios.fazGET("");
        when(Correios.fazGET(any())).thenReturn(xmlRespostaCorreios);

        SedexFrete sedexFrete = new SedexFrete();

        String resultMethod = sedexFrete.calculaFrete(produto);

        Assert.assertNotNull(resultMethod);
        Assert.assertTrue(xmlRespostaCorreios.equalsIgnoreCase(resultMethod));

    }

    @Test
    public void calculaFreteComErroCorreios() throws Exception {

        PowerMockito.mockStatic(Correios.class);
        Correios.fazGET("");
        when(Correios.fazGET(any())).thenThrow(IOException.class);

        SedexFrete sedexFrete = new SedexFrete();

        String resultMethod = sedexFrete.calculaFrete(produto);

        Assert.assertNull(resultMethod);
    }
}