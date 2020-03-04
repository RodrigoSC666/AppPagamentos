package br.com.kasolution.domino;

import br.com.kasolution.util.Formata;

public class Fatura implements Pagavel {
    private String descricao;
    private int quantidade;
    private double valorUnitario;

    public Fatura(String descricao, int quantidade, double valorUnitario) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void imprime() {
        System.out.println("Descrição: " + descricao);
        System.out.println("Qtd. item: " + quantidade);
        System.out.println("Val. item: " + Formata.moeda(valorUnitario));
    }

    @Override
    public double calculaValorPagamento() {
        double total = quantidade * valorUnitario;
        return total;
    }
}
