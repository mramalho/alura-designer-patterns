package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoMaiorQuinhentos extends Desconto{
    public DescontoMaiorQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular (Orcamento orcamento){
        if(orcamento.getValor().compareTo(new BigDecimal("500.0"))>0){
            return orcamento.getValor().multiply(new BigDecimal("0.15"));
        }
      return proximo.calcular(orcamento);
    }
}
