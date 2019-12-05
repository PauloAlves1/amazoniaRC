package com.amazoniarc.entidades.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Servicos")
@XmlAccessorType(XmlAccessType.FIELD)
public class CorreiosServico {
	
	@XmlElement(name = "cServico")
	CServico cServico;
	
	public CServico getcServico() {
		return cServico;
	}

}
