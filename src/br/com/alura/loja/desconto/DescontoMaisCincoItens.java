package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoMaisCincoItens extends Desconto{
    public DescontoMaisCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular (Orcamento orcamento){
        if(orcamento.getQtdeItems() >= 5){
            return orcamento.getValor().multiply(new BigDecimal("0.10"));
        }
      return proximo.calcular(orcamento);
    }
}
