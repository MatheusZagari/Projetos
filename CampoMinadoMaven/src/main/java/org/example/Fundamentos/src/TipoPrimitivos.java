package org.example.Fundamentos.src;

public class TipoPrimitivos {
    public static void main(String[] args) {
        // Informações do Funcionario

        // Tipos Numéricos Inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        // Quando o número passa da quantidade suportada, pra ele não ser alocado na variável INT, tem que colocar um L no final pra reconhecer como LONG
        long pontosAcumulados = 1_234_234_234L;

        //Tipos  numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuldas = 2_991_797_103.01;

        // Tipo booleano
        boolean estaDeFerias = false; //TRUE

        // Tipo caractere
        char status = 'A'; //ativo

        // Dias de Empresa
        System.out.println(anosDeEmpresa + 365);

        // Número de Viagens
        System.out.println(numeroDeVoos / 2);

         // Pontos por Real
        System.out.println(pontosAcumulados / vendasAcumuldas);

        System.out.println(id + ": ganhar -> R$"+ salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}
