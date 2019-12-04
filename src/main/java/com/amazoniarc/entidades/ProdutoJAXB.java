package com.amazoniarc.entidades;

import com.amazoniarc.entidades.dto.CorreiosServico;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class ProdutoJAXB {
	public Object unmarshall(String xml) throws Exception {
	    JAXBContext jaxbContext;
	    try {
	    	jaxbContext = JAXBContext.newInstance(CorreiosServico.class);
	        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	        CorreiosServico correiosServico = (CorreiosServico) jaxbUnmarshaller.unmarshal(new StringReader(xml));
	        return correiosServico;
	    } catch (Exception e) {
	        return null;
	    }
	}
}
