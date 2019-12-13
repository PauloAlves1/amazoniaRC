package com.amazoniarc.controle;

import com.amazoniarc.entidades.Carrinho;
import com.amazoniarc.entidades.Item;
import com.amazoniarc.servicos.CarrinhoCompras;

public class CalculadorDeCarrinhosCompras {
    private final Carrinho carrinho;

    public CalculadorDeCarrinhosCompras(Carrinho carrinho) {
        this.carrinho = carrinho;
    }
    public double AlteraCarrinho(Item item, CarrinhoCompras acao) {
        double valorCarrinho = acao.adiciona(item);
        return valorCarrinho;

    }



}
