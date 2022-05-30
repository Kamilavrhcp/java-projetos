package com.trybe.acc.java.hibernate;

import com.trybe.acc.java.hibernate.entity.Veiculo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {

  /**
   * Método principal.
   * 
   * @param args argumentos da linha de comando
   */
  public static void main(String[] args) {
    Veiculo veiculo = new Veiculo();

    veiculo.setAno(1990);
    veiculo.setModelo("escort");
    veiculo.setQuilometragem("40");

    EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("com.trybe.acc.java.hibernate.veiculo-hibernate");

    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.persist(veiculo);
    em.getTransaction().commit();

    em.close();


  }

}
