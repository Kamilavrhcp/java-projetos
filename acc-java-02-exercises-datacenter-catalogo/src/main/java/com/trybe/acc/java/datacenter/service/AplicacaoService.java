package com.trybe.acc.java.datacenter.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.trybe.acc.java.datacenter.entity.Aplicacao;

public class AplicacaoService implements ServiceInterface<Aplicacao, Long> {
  
  @Override
  public void save(Aplicacao s) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    em.persist(s);
    em.getTransaction().commit();
    em.close();
  }

  @Override
  public void update(Aplicacao s) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    em.merge(s);
    em.getTransaction().commit();
    em.close();
  }

  @Override
  public List<Aplicacao> list() {
    EntityManager em = emf.createEntityManager();
    Query query = em.createQuery("from Aplicacao");
    return query.getResultList();
  }

  @Override
  public void delete(Long id) {
    EntityManager em = emf.createEntityManager();

    Aplicacao deletado = em.find(Aplicacao.class, id);
    
    em.getTransaction().begin();
    em.remove(deletado);
    em.getTransaction().commit();
    em.close();
  } 
  
  @Override
  public Aplicacao findById(Long id) {
    EntityManager em = emf.createEntityManager();
    return em.find(Aplicacao.class, id);
  }

}
