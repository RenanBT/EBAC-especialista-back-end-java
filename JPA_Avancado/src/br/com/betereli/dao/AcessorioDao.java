package br.com.betereli.dao;

import br.com.betereli.domain.Acessorio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AcessorioDao implements IAcessorioDAO{
    @Override
    public Acessorio cadastrar(Acessorio acessorio) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("jpa_avancado");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(acessorio);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return acessorio;

    }
}
