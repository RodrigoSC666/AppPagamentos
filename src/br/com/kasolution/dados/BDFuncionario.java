package br.com.kasolution.dados;

import br.com.kasolution.domino.Assalariado;
import br.com.kasolution.domino.Comissionado;
import br.com.kasolution.domino.ComissionadoAssalariado;
import br.com.kasolution.domino.Funcionario;
import br.com.kasolution.domino.Horista;
import java.util.ArrayList;

public class BDFuncionario {
    
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public static ArrayList<Funcionario> getFuncionarios() {
        funcionarios.add(
                new Assalariado(7500, "Victor", "Souza", "154.141.910-34"));
        funcionarios.add(
                new Comissionado(45000, 0.1, "Marcelo", "Oliveira",
                        "519.529.130-13"));
        funcionarios.add(
                new Horista(100, 120, "Cintaia", "Castro", "822.170.190-40"));
        funcionarios.add(
                new ComissionadoAssalariado(3500, 60_000, 0.1, "Jaqueline",
                        "Costa", "055.831.830-47"));
        
        return funcionarios;
    }//fim getFuncionarios
    
    

}
