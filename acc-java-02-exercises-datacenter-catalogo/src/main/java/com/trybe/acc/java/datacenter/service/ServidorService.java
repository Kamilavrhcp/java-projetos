package com.trybe.acc.java.datacenter.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.trybe.acc.java.datacenter.entity.Servidor;

public class ServidorService implements ServiceInterface<Servidor, Long> {
  @Override
  public void save(Servidor s) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    em.persist(s);
    em.getTransaction().commit();
    em.close();
  }

  @Override
  public void update(Servidor s) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    em.merge(s);
    em.getTransaction().commit();
    em.close();
  }

  @Override
  public List<Servidor> list() {
    EntityManager em = emf.createEntityManager();
    Query query = em.createQuery("from Servidor");
    return query.getResultList();
  }

  @Override
  public void delete(Long id) {
    EntityManager em = emf.createEntityManager();

    Servidor deletado = em.find(Servidor.class, id);
    
    em.getTransaction().begin();
    em.remove(deletado);
    em.getTransaction().commit();
    em.close();
  } 
  
  @Override
  public Servidor findById(Long id) {
    EntityManager em = emf.createEntityManager();
    return em.find(Servidor.class, id);
  }


}
