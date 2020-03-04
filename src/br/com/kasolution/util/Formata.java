package br.com.kasolution.util;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Formata {
    
    public static String moeda(double valor) {
        return NumberFormat.getCurrencyInstance().format(valor);
    }//fim moeda
    
    public static String data(LocalDate data) {
        DateTimeFormatter dtf = DateTimeFormatter
                .ofPattern("dd/MM/yyyy - EEEE H:m:s");
        return dtf.format(data);
    }//fim data
    
}//fim classe
