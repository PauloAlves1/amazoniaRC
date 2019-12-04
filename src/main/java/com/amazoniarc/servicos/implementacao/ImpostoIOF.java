package com.amazoniarc.servicos.implementacao;

import com.amazoniarc.entidades.Produto;
import com.amazoniarc.servicos.Imposto;

public class ImpostoIOF implements Imposto {

    @Override
    public double calcula(Produto produto) {
        return produto.getValor() * 0.05;
    }

}
