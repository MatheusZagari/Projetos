//package infra;
//
//import modelo.basico.Produto;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import javax.persistence.TypedQuery;
//import java.util.List;
//
//public class DAO <E> {
//    private static EntityManagerFactory emf;
//    private EntityManager em;
//    private Class <E> classe;
//
//    static {
//        try {
//            emf = Persistence.createEntityManagerFactory("BancoDeDados");
//        }
//        catch (Exception e) {
//            // logar -> log4j
//        }
//    }
//    public DAO() {
//        this (null);
//    }
//
//    public DAO(Class <E> classe) {
//        this.classe = classe;
//        em = emf.createEntityManager();
//    }
//    public DAO<E> abrirTransacao() {
//        em.getTransaction().begin();
//        return this;
//    }
//    public DAO<E> fecharTransacao() {
//        em.getTransaction().commit();
//        return this;
//    }
//    public DAO<E> incluirAtomico(E entidade) {
//        em.persist(entidade);
//        return this.abrirTransacao().incluirAtomico(entidade).fecharTransacao();
//    }
//    public List<E> obterTodos() {
//        return this.obterTodos(10,0);
//        }
//
//    public List<E> obterTodos(int qtde, int deslocamento) {
//        if (classe == null) {
//            throw new UnsupportedOperationException("Classe nula.");
//        }
//        String jpql = "select e from" + classe.getName() + " e";
//        TypedQuery<E> query = em.createQuery(jpql, classe);
//        query.setMaxResults(qtde);
//        query.setFirstResult(deslocamento);
//        return query.getResultList();
//    }
//    public void fechar () {
//        em.close();
//    }
//}
package infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class DAO<E> {
    private static EntityManagerFactory emf;
    private EntityManager em;
    private Class<E> classe;

    static {
        try {
            emf = Persistence.createEntityManagerFactory("BancoDeDados");
        } catch (Exception e) {
            e.printStackTrace(); // Logar erro ou lançar exceção
        }
    }

    public DAO() {
        this(null);
    }

    public DAO(Class<E> classe) {
        this.classe = classe;
        em = emf.createEntityManager();
    }

    public DAO<E> abrirTransacao() {
        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
        return this;
    }

    public DAO<E> fecharTransacao() {
        if (em.getTransaction().isActive()) {
            em.getTransaction().commit();
        }
        return this;
    }

    public DAO<E> incluir(E entidade) {
        em.persist(entidade);
        return this;
    }

    public DAO<E> incluirAtomico(E entidade) {
        return this.abrirTransacao().incluir(entidade).fecharTransacao();
    }

    public E obterPorId(Object id) {
        return em.find(classe, id);
    }

    public List<E> obterTodos(int qtde, int deslocamento) {
        if (classe == null) {
            throw new UnsupportedOperationException("Classe nula");
        }
        String jpql = "select e from " + classe.getName() + " e";
        return em.createQuery(jpql, classe).setMaxResults(qtde).setFirstResult(deslocamento).getResultList();
    }

    public void fechar() {
        em.close();
    }
}
