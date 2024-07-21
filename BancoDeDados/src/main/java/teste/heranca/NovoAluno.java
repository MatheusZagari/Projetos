package teste.heranca;

import infra.DAO;
import modelo.herança.Aluno;
import modelo.herança.AlunoBolsista;

public class NovoAluno {
    public static void main(String[] args) {
        DAO<Aluno> alunoDAO = new DAO<>(Aluno.class);

        Aluno aluno1 = new Aluno(1L, "João");
        AlunoBolsista aluno2 = new AlunoBolsista(2L, "Maria", 1000);

        alunoDAO.incluirAtomico(aluno1);
        alunoDAO.incluirAtomico(aluno2);

        alunoDAO.fechar();
    }
}
