package com.trybe.acc.java.datacenter.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.trybe.acc.java.datacenter.entity.Datacenter;

public class DatacenterService implements ServiceInterface<Datacenter, Long> {
  @Override
  public void save(Datacenter s) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    em.persist(s);
    em.getTransaction().commit();
    em.close();
  }

  @Override
  public void update(Datacenter s) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    em.merge(s);
    em.getTransaction().commit();
    em.close();
  }

  @Override
  public List<Datacenter> list() {
    EntityManager em = emf.createEntityManager();
    Query query = em.createQuery("from Datacenter");
    return query.getResultList();
  }

  @Override
  public void delete(Long id) {
    EntityManager em = emf.createEntityManager();

    Datacenter deletado = em.find(Datacenter.class, id);
    
    em.getTransaction().begin();
    em.remove(deletado);
    em.getTransaction().commit();
    em.close();
  } 
  
  @Override
  public Datacenter findById(Long id) {
    EntityManager em = emf.createEntityManager();
    return em.find(Datacenter.class, id);
  }

}
