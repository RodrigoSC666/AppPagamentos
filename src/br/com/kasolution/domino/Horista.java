package br.com.kasolution.domino;

import br.com.kasolution.util.Formata;

public class Horista extends Funcionario {

    private double valorHora;
    private double horas;

    //construtor
    public Horista(double valorHora, double horas, String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
        this.valorHora = valorHora;
        this.horas = horas;
    }

   //get/set
   public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Valor hora: " + Formata.moeda(valorHora));
        System.out.println("Horas trabalhadas: " + horas);
    }

    @Override
    public double calculaValorPagamento() {
        double total = valorHora * horas;
        return total;
    }
}
