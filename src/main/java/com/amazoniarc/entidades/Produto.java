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
	private Boolean midiaDigital;
	
	public double getValor() {
		return valor;
	}


	public boolean getMidiaDigital() {
		return midiaDigital;
	}
/*	public Produto() {
		
	}*/
	
	public Produto(double valor) {
		this.valor = valor;
	}
	
	
	public Produto(double valor, String peso, String comprimento, String altura, String largura, String diametro, String formato, String maoPropria, String avisoRecebimento, String valorDeclarado, String servico, String retorno, boolean midiaDigital) {
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
		this.midiaDigital = midiaDigital;
	}
	
	public String requestUrl() {
		String requestUrl = "?sCepOrigem=04094-050&sCepDestino=90619-900&nVlPeso="+this.peso+"&nVlComprimento="+this.comprimento+"&nVlAltura="+this.altura+"&nVlLargura="+this.largura+"&nVlDiametro="+this.diametro+"&nCdFormato="+this.formato+"&sCdMaoPropria="+this.maoPropria+"&sCdAvisoRecebimento="+this.avisoRecebimento+"&nVlValorDeclarado="+this.valorDeclarado+"&nCdServico="+this.servico+"&nCdEmpresa=&sDsSenha=&StrRetorno=xml";
		return requestUrl;
	}

}
