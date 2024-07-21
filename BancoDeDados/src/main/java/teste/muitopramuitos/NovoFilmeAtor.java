package teste.muitopramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {
    public static void main(String[] args) {
        Filme filmeA = new Filme("Avatar", 8.5);
        Filme filmeB = new Filme("The Avengers", 9.5);

        Ator atorA = new Ator("Roberto");
        Ator atrizB = new Ator("Maria");

        filmeA.adicionarAtor(atorA);
        filmeA.adicionarAtor(atrizB);

        filmeB.adicionarAtor(atorA);
        filmeB.adicionarAtor(atrizB);

        DAO<Filme> dao = new DAO<Filme>();
        dao.incluirAtomico(filmeA);
    }
}
