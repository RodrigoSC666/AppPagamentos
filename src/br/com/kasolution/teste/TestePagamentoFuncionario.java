package br.com.kasolution.teste;

import br.com.kasolution.dados.BDFuncionario;
import br.com.kasolution.domino.Fatura;
import br.com.kasolution.domino.Funcionario;
import br.com.kasolution.domino.Pagavel;
import br.com.kasolution.util.Formata;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class TestePagamentoFuncionario {

    public static void main(String[] args) {
        File arquivo = new File("C:/temp/ordem_pagamento.txt");
        try {
            System.setOut(new PrintStream(arquivo));

            ArrayList<Funcionario> funcionarios = BDFuncionario.getFuncionarios();
            Fatura fatura = new Fatura("Notebook Lenovo", 5, 2500.00);

            ArrayList<Pagavel> pagaveis = new ArrayList<>();
            pagaveis.addAll(funcionarios);
            pagaveis.add(fatura);

            for (Pagavel p : pagaveis) {
                System.out.println("Dados pagável: ");
                p.imprime();
                System.out.print("Valor pagamento: "
                        + Formata.moeda(p.calculaValorPagamento()));
                System.out.println("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao criar arquivo: "
                    + e.getLocalizedMessage());
        }
    }
}
