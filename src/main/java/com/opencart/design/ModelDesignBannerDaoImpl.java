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
package com.opencart.design;

import java.util.List;
import javax.inject.Inject;

import static java.util.Objects.requireNonNull;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.opencart.entity.*;

import com.google.inject.Provider;

import java.util.stream.Collectors;

import com.opencart.util.DaoUtils;

/**
* auto generated from SQL
*/
public class ModelDesignBannerDaoImpl implements ModelDesignBannerDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelDesignBannerDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelDesignBanner.getBanner.getBanner
   * SELECT b.banner_id, b.name, b.status, bi.banner_image_id, bi.banner_id as banner_id0, bi.language_id, bi.title, bi.link, bi.image, bi.sort_order FROM oc_banner b LEFT JOIN oc_banner_image bi ON( b.banner_id = bi.banner_id ) WHERE b.banner_id = 'param0' AND b.status = '1' AND bi.language_id = 'param1' ORDER BY bi.sort_order ASC 
   */
  @Override
  public List<ModelDesignBanner0Dto> getBanner(Integer banner_id,Integer language_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelDesignBanner.getBanner.getBanner");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("banner_id", banner_id);
    query.setParameter("language_id", language_id);

    return fromListOfArrayModelDesignBanner0Dto(query.getResultList());
  }

  /*
   * Java8 version
   */
  private static List<ModelDesignBanner0Dto> fromListOfArrayModelDesignBanner0Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelDesignBanner0Dto.fromArray(x)).collect(Collectors.toList());
  }
}