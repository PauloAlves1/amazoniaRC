package com.amazoniarc.entidades;

public class Produto {
	private double valor;
	private String peso;
	private String comprimento;
	private String altura;
	private String largura;
	private String diametro;
	private String formato;
	private String maoPropria;
	private String avisoRecebimento;
	private String servico;
	private String valorDeclarado;
	private String retorno;	
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getComprimento() {
		return comprimento;
	}

	public void setComprimento(String comprimento) {
		this.comprimento = comprimento;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getLargura() {
		return largura;
	}

	public void setLargura(String largura) {
		this.largura = largura;
	}

	public String getDiametro() {
		return diametro;
	}

	public void setDiametro(String diametro) {
		this.diametro = diametro;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getMaoPropria() {
		return maoPropria;
	}

	public void setMaoPropria(String maoPropria) {
		this.maoPropria = maoPropria;
	}

	public String getAvisoRecebimento() {
		return avisoRecebimento;
	}

	public void setAvisoRecebimento(String avisoRecebimento) {
		this.avisoRecebimento = avisoRecebimento;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public String getValorDeclarado() {
		return valorDeclarado;
	}

	public void setValorDeclarado(String valorDeclarado) {
		this.valorDeclarado = valorDeclarado;
	}

	public String getRetorno() {
		return retorno;
	}

	public void setRetorno(String retorno) {
		this.retorno = retorno;
	}

	public Produto() {
		
	}
	
	public Produto(double valor) {
		this.valor = valor;
	}
	
	
	public Produto(double valor, String peso, String comprimento, String altura, String largura, String diametro, String formato, String maoPropria, String avisoRecebimento, String valorDeclarado, String servico, String retorno) {
		this.valor = valor;
		this.peso = peso;
		this.comprimento = comprimento;
		this.altura = altura;
		this.largura = largura;
		this.diametro = diametro;
		this.formato = formato;
		this.maoPropria = maoPropria;
		this.avisoRecebimento = avisoRecebimento;
		this.valorDeclarado = valorDeclarado;
		this.servico = servico;
		this.retorno = retorno;
	}
	
	public String requestUrl() {
		String requestUrl = "?sCepOrigem=04094-050&sCepDestino=90619-900&nVlPeso="+this.peso+"&nVlComprimento="+this.comprimento+"&nVlAltura="+this.altura+"&nVlLargura="+this.largura+"&nVlDiametro="+this.diametro+"&nCdFormato="+this.formato+"&sCdMaoPropria="+this.maoPropria+"&sCdAvisoRecebimento="+this.avisoRecebimento+"&nVlValorDeclarado="+this.valorDeclarado+"&nCdServico="+this.servico+"&nCdEmpresa=&sDsSenha=&StrRetorno=xml";
		return requestUrl;
	}

}
