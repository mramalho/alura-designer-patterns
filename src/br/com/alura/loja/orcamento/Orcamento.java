package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valor;
    private Integer qtdeItems;

    public Orcamento(BigDecimal valor, Integer quantidaeItems) {
        this.valor = valor;
        this.qtdeItems = quantidaeItems;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Integer getQtdeItems() {
        return qtdeItems;
    }
}
