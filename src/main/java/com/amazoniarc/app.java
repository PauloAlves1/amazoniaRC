package com.amazoniarc;

import com.amazoniarc.entidades.Produto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class app {

    public static void main (String args[]){

        //gerando produtos e colocando num hashmap
        Produto produto = new Produto(500.00);
        Produto produto1 = new Produto(500.00, "1.0", "50", "2", "25", "0.0", "1", "N", "N", "0,00", "04510", "xml", false);
        Produto produto2 = new Produto(300.00, "0.3", "30", "2", "15", "0.0", "1", "N", "N", "0,00", "04510", "xml", true);
        Produto produto3 = new Produto(50.00, "0.5", "15", "2", "10", "0.0", "1", "N", "N", "0,00", "04510", "xml", false);
        Map<String, Produto> produtoHashMap = new HashMap<>();
        produtoHashMap.put("testando imposto/desconto simples", produto);
        produtoHashMap.put("maxsteel", produto1);
        produtoHashMap.put("avengers: o ultimato", produto2);
        produtoHashMap.put("uma coca na tia do lanche", produto3);


        //apresentando o hashmap
        for(Map.Entry<String, Produto> entry : produtoHashMap.entrySet()) {
            System.out.println("---> "+entry.getKey()); }

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Selecione o produto que deseja comprar:");
        Scanner entrada = new Scanner (System.in);
        String produtoEscolhido;
        produtoEscolhido = entrada.nextLine();

        if (produtoHashMap.containsKey( produtoEscolhido )){
            System.out.println("Você escolheu: "+produtoEscolhido+" = "+produtoHashMap.get(produtoEscolhido));
        }else {
            System.out.println("Produto NÃO ENCONTRADO, por favor digite o nome do produto novamente");
        }

        System.out.println("valor é de: "+produtoHashMap.get(produtoEscolhido).getValor()+"R$");

        
    }
}
