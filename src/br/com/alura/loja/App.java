package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("200.00"), 10);
        CalculadoraDeImpostos calcularImposto= new CalculadoraDeImpostos();
        CalculadoraDeDescontos calcularDesconto = new CalculadoraDeDescontos();
        System.out.println(calcularImposto.calcular(orcamento, new ISS()));
        System.out.println(calcularImposto.calcular(orcamento, new ICMS()));
        System.out.println(calcularDesconto.calcular(orcamento));
    }
}
