package org.example.excecao.personalizadaA;

import excecao.Aluno;

public class testeValidacoes {
    public static void main(String[] args) {

        try{
            Aluno aluno = new Aluno("Ana", -7.1);

            Validar.aluno(aluno);
        }
        catch (stringVaziaException e) {
            System.out.println(e.getMessage());
        }
        catch (numeroNegativoException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Fim");
    }
}
