package com.opencart.entity.dao;

import com.google.inject.Inject;
import javax.persistence.EntityManager;

public class OpencartDao {
    private final EntityManager em;

    @Inject
    public OpencartDao(EntityManager em) {
        this.em = em;
    }

    protected EntityManager getEntityManager() {
        return this.em;
    }
}