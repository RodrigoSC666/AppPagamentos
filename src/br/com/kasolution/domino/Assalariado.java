package br.com.kasolution.domino;

import br.com.kasolution.util.Formata;

public class Assalariado extends Funcionario {
    
    private double salarioSemanal;

    public Assalariado(double salarioSemanal, String nome, String sobrenome,
            String cpf) {
        super(nome, sobrenome, cpf);
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }
    
    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Salario Semanal: "
                + Formata.moeda(salarioSemanal));
    }   

    @Override
    public double calculaValorPagamento() {
        double total = salarioSemanal * 4.5;
        return total;
    }
}







