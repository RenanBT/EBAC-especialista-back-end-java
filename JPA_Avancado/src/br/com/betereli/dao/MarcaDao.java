package br.com.betereli.dao;

import br.com.betereli.domain.Marca;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static javax.persistence.Persistence.createEntityManagerFactory;

public class MarcaDao implements IMarcaDAO{
    @Override
    public Marca cadastrar(Marca marca) {
        EntityManagerFactory entityManagerFactory =
                createEntityManagerFactory("jpa_avancado");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(marca);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return marca;

    }
}
