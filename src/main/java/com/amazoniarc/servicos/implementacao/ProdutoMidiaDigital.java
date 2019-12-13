package com.amazoniarc.servicos.implementacao;

import com.amazoniarc.entidades.Produto;

import java.util.function.Predicate;

public class ProdutoMidiaDigital implements Predicate<Produto> {
    @Override
    public boolean test(Produto produto) {
        return produto.getMidiaDigital();
    }
}
