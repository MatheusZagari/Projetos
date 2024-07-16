package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ObterUsuarios {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BancoDeDados");
        EntityManager em = emf.createEntityManager();

//        String jpkl = "select u from Usuario u";
//        TypedQuery<Usuario> query = em.createQuery(jpkl, Usuario.class);
//        query.setMaxResults(5);

        List<Usuario> usuarios = em.createQuery("select u from Usuario u", Usuario.class).setMaxResults(5).getResultList();

//        List<Usuario> usuarios = query.getResultList();

        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getNome());
            System.out.println(usuario.getEmail());
            System.out.println(usuario.getId());
        }

        em.close();
        emf.close();
    }
}
