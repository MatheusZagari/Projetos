package org.example.excecao.personalizadaA;

import excecao.Aluno;
public class Validar {
    private Validar() {

    }

    public static void aluno (Aluno aluno) {
        if (aluno == null) {
            throw new IllegalArgumentException("O aluno está nulo");
        }
        if (aluno.nome == null || aluno.nome.isEmpty()) {
            throw new stringVaziaException("nome");
        }
        if (aluno.nota < 0 || aluno.nota > 10) {
            throw new numeroNegativoException("nota");
        }
    }
}
