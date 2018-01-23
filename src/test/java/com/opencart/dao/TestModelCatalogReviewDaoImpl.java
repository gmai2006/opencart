package com.opencart.dao;


import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Every.everyItem;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.*;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Module;
import com.opencart.GoogleGuiceTest;
import com.opencart.entity.*;
import com.opencart.util.JsonUtils;

import com.opencart.catalog.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;


public class TestModelCatalogReviewDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelCatalogReviewDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelCatalogReviewDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT COUNT(*) AS total FROM oc_review r LEFT JOIN oc_product p ON (r.product_id = p.product_id) LEFT JOIN oc_product_description pd ON (p.product_id = pd.product_id) WHERE p.product_id = 'param0' AND p.date_available <= NOW() AND p.status = '1' AND r.status = '1' AND pd.language_id = 'param1' 
   */
  @Test
  public void testgetTotalReviewsByProductId() throws Exception {
    Integer product_id = null;
    Integer language_id = null;
    java.math.BigInteger result = dao.getTotalReviewsByProductId(product_id, language_id);
    assertThat("getTotalReviewsByProductId", result, notNullValue());
  }

  /* *
   * SELECT r.review_id, r.author, r.rating, r.text, p.product_id, pd.name, p.price, p.image, r.date_added FROM oc_review r LEFT JOIN oc_product p ON (r.product_id = p.product_id) LEFT JOIN oc_product_description pd ON (p.product_id = pd.product_id) WHERE p.product_id = 'param0' AND p.date_available <= NOW() AND p.status = '1' AND r.status = '1' AND pd.language_id = 'param1' ORDER BY r.date_added DESC LIMIT param2,param3 
   */
  @Test
  public void testgetReviewsByProductId() throws Exception {

    Integer product_id = null;
    Integer language_id = null;

    List<ModelCatalogReview0Dto> result = dao.getReviewsByProductId(product_id, language_id);
    assertThat("getReviewsByProductId", result, notNullValue());
  }
}