package com.amazoniarc.integracao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import javax.xml.bind.JAXBContext;

import java.io.IOException;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Correios.class})
public class CorreiosTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void fazGET() throws Exception {
        //Given
        String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?><Servicos><cServico><Codigo>04510</Codigo><Valor>24,80</Valor><PrazoEntrega>8</PrazoEntrega><ValorSemAdicionais>24,80</ValorSemAdicionais><ValorMaoPropria>0,00</ValorMaoPropria><ValorAvisoRecebimento>0,00</ValorAvisoRecebimento><ValorValorDeclarado>0,00</ValorValorDeclarado><EntregaDomiciliar>S</EntregaDomiciliar><EntregaSabado>N</EntregaSabado><obsFim></obsFim><Erro>0</Erro><MsgErro></MsgErro></cServico></Servicos>";
        //When
        PowerMockito.mockStatic(Correios.class);
        Correios.fazGET("");
        when(Correios.fazGET(any())).thenReturn(xml);


    }
}