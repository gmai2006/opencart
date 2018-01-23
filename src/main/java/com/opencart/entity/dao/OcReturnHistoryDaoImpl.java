/*************************************************************************
 *
 * DATASCIENCE9 LLC CONFIDENTIAL
 * __________________
 *
 *  [2018] Datascience9 LLC
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Datascience9 LLC and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Datascience9 LLC
 * and its suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Datascience9 LLC.
 * @author Paul Mai - Datascience9 LLC
 */

package com.opencart.entity.dao;

import static java.util.Objects.requireNonNull;
import java.util.List;
import com.opencart.entity.*;
import javax.inject.Inject;
import com.google.inject.persist.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.google.inject.Provider;

public class OcReturnHistoryDaoImpl implements OcReturnHistoryDao {
    private final Provider<EntityManager> entityManagerProvider;

    @Inject
    public OcReturnHistoryDaoImpl (final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
    }

    @Override
    public List<OcReturnHistory> select(int maxResult) {
        final EntityManager em = entityManagerProvider.get();
        Query query = em.createQuery("select a from OcReturnHistory a", OcReturnHistory.class).setMaxResults(maxResult);
        return query.getResultList();
    }

    @Override
    public List<OcReturnHistory> selectAll() {
        final EntityManager em = entityManagerProvider.get();
        Query query = em.createQuery("select a from OcReturnHistory a", OcReturnHistory.class);
        return query.getResultList();
    }

    @Override
    @Transactional
    public OcReturnHistory create(OcReturnHistory e) {
        final EntityManager em = entityManagerProvider.get();
        em.persist(e);

        return e;
    }

    @Transactional
    public OcReturnHistory update(OcReturnHistory e) {
        final EntityManager em = entityManagerProvider.get();
        return em.merge(e);
    }

    @Override
    @Transactional
    public void delete(OcReturnHistory e) {
        final EntityManager em = entityManagerProvider.get();
        em.remove(e);
    }
}