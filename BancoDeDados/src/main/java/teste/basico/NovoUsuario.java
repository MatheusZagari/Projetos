package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BancoDeDados");
        EntityManager em = emf.createEntityManager();

        Usuario novoUsusario = new Usuario("Sergio", "sergio@gmail.com");

        em.getTransaction().begin();
        em.persist(novoUsusario);
        em.getTransaction().commit();

        System.out.println("O ID gerado foi: " + novoUsusario.getId());

        em.close();
        emf.close();

    }
}
