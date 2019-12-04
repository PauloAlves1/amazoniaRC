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

	

	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getValor() {
		return valor;
	}



	public void setValor(String valor) {
		this.valor = valor;
	}



	public int getPrazoEntrega() {
		return prazoEntrega;
	}



	public void setPrazoEntrega(int prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
	}



	public String getValorSemAdicionais() {
		return valorSemAdicionais;
	}



	public void setValorSemAdicionais(String valorSemAdicionais) {
		this.valorSemAdicionais = valorSemAdicionais;
	}



	public String getValorMaoPropria() {
		return valorMaoPropria;
	}



	public void setValorMaoPropria(String valorMaoPropria) {
		this.valorMaoPropria = valorMaoPropria;
	}



	public String getValorAvisoRecebimento() {
		return valorAvisoRecebimento;
	}



	public void setValorAvisoRecebimento(String valorAvisoRecebimento) {
		this.valorAvisoRecebimento = valorAvisoRecebimento;
	}



	public String getValorDeclarado() {
		return valorDeclarado;
	}



	public void setValorDeclarado(String valorDeclarado) {
		this.valorDeclarado = valorDeclarado;
	}



	public String getEntregaDomiciliar() {
		return entregaDomiciliar;
	}



	public void setEntregaDomiciliar(String entregaDomiciliar) {
		this.entregaDomiciliar = entregaDomiciliar;
	}



	public String getEntregaSabado() {
		return entregaSabado;
	}



	public void setEntregaSabado(String entregaSabado) {
		this.entregaSabado = entregaSabado;
	}



	public String getObsFim() {
		return obsFim;
	}



	public void setObsFim(String obsFim) {
		this.obsFim = obsFim;
	}



	public int getErro() {
		return erro;
	}



	public void setErro(int erro) {
		this.erro = erro;
	}



	public String getMsgErro() {
		return msgErro;
	}



	public void setMsgErro(String msgErro) {
		this.msgErro = msgErro;
	}



	public CServico() {
		
	}
	
}
