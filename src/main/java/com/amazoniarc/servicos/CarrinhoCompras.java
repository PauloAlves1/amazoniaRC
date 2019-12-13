package com.amazoniarc.servicos;

import com.amazoniarc.entidades.Item;

import java.util.ArrayList;
import java.util.List;

public interface CarrinhoCompras {
    List<Item> itens = new ArrayList<Item>();

    double adiciona(Item item);
}
