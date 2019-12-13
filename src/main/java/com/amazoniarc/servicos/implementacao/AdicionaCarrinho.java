package com.amazoniarc.servicos.implementacao;

import com.amazoniarc.entidades.Item;
import com.amazoniarc.servicos.CarrinhoCompras;

public class AdicionaCarrinho implements CarrinhoCompras {
    private Double total = 0.0;
    @Override
    public double adiciona(Item item) {
        itens.add(item);
        total += item.getProduto().getValor() * item.getQuantidade();
        return total;
    }
}
