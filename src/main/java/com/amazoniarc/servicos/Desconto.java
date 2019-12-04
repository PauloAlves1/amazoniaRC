package com.amazoniarc.servicos;

import com.amazoniarc.entidades.Produto;

public interface Desconto {
    double calcula(Produto produto);
}
