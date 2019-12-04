package com.amazoniarc;

import com.amazoniarc.controle.CalculadorDeImposto;
import com.amazoniarc.entidades.Produto;
import com.amazoniarc.servicos.Imposto;
import com.amazoniarc.servicos.implementacao.ImpostoINSS;
import com.amazoniarc.servicos.implementacao.ImpostoIOF;

public class TesteDeImposto {
    public static void main(String[] args) throws Exception {
        Imposto inss = new ImpostoINSS();
        Imposto iof = new ImpostoIOF();

        CalculadorDeImposto calculadorImposto = new CalculadorDeImposto();

        Produto produto = new Produto(500.00);
        System.out.println("Valores de imposto da sua compra:");
        calculadorImposto.CalculaImposto(produto, iof);
        calculadorImposto.CalculaImposto(produto, inss);
        
    }
}
