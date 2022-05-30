package com.trybe.gestaotime.dao;

import com.trybe.gestaotime.model.Time;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class TimeDao extends GenericDao<Time, Integer> {
  @Override
  public void salvar(Time s) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    em.persist(s);
    em.getTransaction().commit();
    em.close();
  }

  @Override
  public void editar(Time s) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    em.merge(s);
    em.getTransaction().commit();
    em.close();
  }

  @Override
  public List<Time> listar() {
    EntityManager em = emf.createEntityManager();
    Query query = em.createQuery("from Time");
    return query.getResultList();
  }

  @Override
  public void deletar(Integer id) {
    EntityManager em = emf.createEntityManager();

    Time deletado = em.find(Time.class, id);
    
    em.getTransaction().begin();
    em.remove(deletado);
    em.getTransaction().commit();
    em.close();
  }

}
