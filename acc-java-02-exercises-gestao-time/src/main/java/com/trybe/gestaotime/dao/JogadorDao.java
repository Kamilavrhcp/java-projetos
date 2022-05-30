package com.trybe.gestaotime.dao;

import com.trybe.gestaotime.model.Jogador;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class JogadorDao extends GenericDao<Jogador, Integer> {
  
  @Override
  public void salvar(Jogador s) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    em.persist(s);
    em.getTransaction().commit();
    em.close();
  }

  @Override
  public void editar(Jogador s) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    em.merge(s);
    em.getTransaction().commit();
    em.close();
  }

  @Override
  public List<Jogador> listar() {
    EntityManager em = emf.createEntityManager();
    Query query = em.createQuery("from Jogador");
    return query.getResultList();
  }

  @Override
  public void deletar(Integer id) {
    EntityManager em = emf.createEntityManager();

    Jogador deletado = em.find(Jogador.class, id);
    
    em.getTransaction().begin();
    em.remove(deletado);
    em.getTransaction().commit();
    em.close();
  }

}
