package br.com.kasolution.domino;

import br.com.kasolution.util.Formata;

public class Comissionado extends Funcionario {

    private double vendaBruta;
    private double porcentagemComissao;
    
    //contrutor
    public Comissionado(double vendaBruta, double porcentagemComissao,
            String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
        this.vendaBruta = vendaBruta;
        this.porcentagemComissao = porcentagemComissao;
    }

    //getters/setters
    public double getVendaBruta() {
        return vendaBruta;
    }

    public void setVendaBruta(double vendaBruta) {
        this.vendaBruta = vendaBruta;
    }

    public double getPorcentagemComissao() {
        return porcentagemComissao;
    }

    public void setPorcentagemComissao(double porcentagemComissao) {
        this.porcentagemComissao = porcentagemComissao;
    }

    //imprime
    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Venda bruta: "
                     + Formata.moeda(vendaBruta));
        System.out.println("%Comissão: " + porcentagemComissao);
    }//fim imprime  

    @Override
    public double calculaValorPagamento() {
        double total = vendaBruta * porcentagemComissao;
        return total;
    }
    
    
}
