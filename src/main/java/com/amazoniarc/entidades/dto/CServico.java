package com.amazoniarc.entidades.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class CServico {
	
	@XmlElement(name = "Codigo")
	private int codigo;
	@XmlElement(name = "Valor")
	private String valor;
	@XmlElement(name = "PrazoEntrega")
	private int prazoEntrega;
	@XmlElement(name = "ValorSemAdicionais")
	private String valorSemAdicionais;
	@XmlElement(name = "ValorMaoPropria")
	private String valorMaoPropria;
	@XmlElement(name = "ValorAvisoRecebimento")
	private String valorAvisoRecebimento;
	@XmlElement(name = "ValorValorDeclarado")
	private String valorDeclarado;
	@XmlElement(name = "EntregaDomiciliar")
	private String entregaDomiciliar;
	@XmlElement(name = "EntregaSabado")
	private String entregaSabado;
	@XmlElement(name = "obsFim")
	private String obsFim;
	@XmlElement(name = "Erro")
	private int erro;
	@XmlElement(name = "MsgErro")
	private String msgErro;



	public String getValor() {
		return valor;
	}


	public CServico() {
		
	}
	
}
