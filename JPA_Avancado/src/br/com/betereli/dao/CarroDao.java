package br.com.betereli.dao;

import br.com.betereli.domain.Carro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class CarroDao implements ICarroDAO {
    @Override
    public Carro cadastrar(Carro carro) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("jpa_avancado");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(carro);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return carro;

    }
}
