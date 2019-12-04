package com.amazoniarc.enums;

public enum TipoServicoCorreiosEnum {
	
	 c04510("04510", "PAC sem contrato"),
	 c41068("41068", "PAC com contrato"),
	 c04669("04669", "PAC com contrato"),
	 c41300("41300", "PAC para grandes formatos"),
	 c04014("04014", "Sedex sem contrato"),
	 c40045("40045", "Sedex a Cobrar, sem contrato"),
	 c40126("40126", "Sedex a Cobrar, com contrato"),
	 c40215("40215", "Sedex 10, sem contrato"),
	 c40290("40290", "Sedex Hoje, sem contrato"),
	 c40096("40096", "Sedex com contrato"),
	 c40436("40436", "Sedex com contrato"),
	 c40444("40444", "Sedex com contrato"),
	 c40568("40568", "Sedex com contrato"),
	 c40606("40606", "Sedex com contrato"),
	 c04162("04162", "Sedex com contrato"),
	 c81019("81019", "e-SEDEX, com contrato"),
	 c81027("81027", "e-SEDEX Priorit�rio, com contrato"),
	 c81035("81035", "e-SEDEX Express, com contrato"),
	 c81868("81868", "(Grupo 1) e-SEDEX com contrato"),
	 c81833("81833", "(Grupo 2) e-SEDEX com contrato"),
	 c81850("81850", "(Grupo 2)e-SEDEX com contrato");
	 
	public String codigoServicoCorreio;
	public String nomeServicoCorreio;
	
	TipoServicoCorreiosEnum (String codigo, String nomeServico){
		codigoServicoCorreio = codigo;
		nomeServicoCorreio = nomeServico;
	}
}
