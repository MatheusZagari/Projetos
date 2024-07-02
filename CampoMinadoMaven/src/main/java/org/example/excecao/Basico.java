package org.example.excecao;

public class Basico {
    public static void main(String[] args) {
        Aluno a1 = null;

        // se tratar o erro com o try e catch e comentar o que vai ser retornado dentro do catch, o erro passsa direto
        // sem acusar nada, ele ignora o erro completamente, sempre é bom colocar uma mensagem de erro para o usuário
        try {
            imprimirAluno(a1);
        }
        catch (Exception excecao) {
            System.out.println("Ocorreu um erro no momento de imprimir o nome do aluno");
        }
        try {
            System.out.println(7 / 0);
        }
        catch (ArithmeticException a) {
            System.out.println("\nNão da pra dividir por zero: " + a.getMessage());
        }


        System.out.println("Fim");
    }

    public static void imprimirAluno(Aluno aluno){
        System.out.println(aluno.nome);
    }
}
