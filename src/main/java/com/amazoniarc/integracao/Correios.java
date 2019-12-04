package com.amazoniarc.integracao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Correios {
	private final static String GET_URL = "http://ws.correios.com.br/calculador/CalcPrecoPrazo.aspx";

	public static String fazGET(String requestUrl) throws IOException {
		StringBuilder response = new StringBuilder();
		URL obj = new URL(GET_URL + requestUrl);
		HttpURLConnection conexao = (HttpURLConnection) obj.openConnection();
		conexao.setRequestMethod("GET");
		int mensagemRequest = conexao.getResponseCode();
		System.out.println("Mensagem de resposta : " + mensagemRequest); 
		if (mensagemRequest == HttpURLConnection.HTTP_OK) { // sucesso
			try (BufferedReader in = new BufferedReader(new InputStreamReader(
					conexao.getInputStream()))) {
				String inputLine;
	
				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
			}
		} else {
			System.out.println("GET request not worked");
		}
		return response.toString();
	}
}