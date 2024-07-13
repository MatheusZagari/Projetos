package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario3 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BancoDeDados");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Usuario usuario = em.find(Usuario.class, 2L);
        em.detach(usuario);
        usuario.setNome("Matheus");
//        usuario.setEmail("maria@gmail.com");

        em.merge(usuario);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
