package org.example.Exercicios.src.Classe;

public class Data {
    int dia;
    int mes;
    int ano;

    Data () {
//        dia = 1;
//        mes = 1;
//        ano = 1970;
        this(1,1, 1970);

        // Valores padrão:
        //byte, short, int e long --> 0
        //float, double --> 0.0
        //boolean --> false
        //char --> '\u0000'
    }

//    Data (int diaInicial, int mesInicial, int anoInicial) {
//        dia = diaInicial;
//        mes = mesInicial;
//        ano = anoInicial;
//    }

    Data (int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Desafio Data
    String obterDataFormatada() {
        return String.format("%d/%d/%d\n", dia, mes, ano);
    }

}
