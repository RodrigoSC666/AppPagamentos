package br.com.kasolution.domino;

import br.com.kasolution.util.Formata;

public class ComissionadoAssalariado extends Comissionado {
    
    private double salarioMensal;

    public ComissionadoAssalariado(double salarioMensal, double vendaBruta, double porcentagemComissao, String nome, String sobrenome, String cpf) {
        super(vendaBruta, porcentagemComissao, nome, sobrenome, cpf);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Salário Mensal: " +
                Formata.moeda(salarioMensal));
    }

    @Override
    public double calculaValorPagamento() {
        double total = super.calculaValorPagamento() + salarioMensal;
        return total;
    }
}
