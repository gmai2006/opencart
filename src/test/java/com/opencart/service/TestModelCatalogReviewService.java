package com.opencart.service;


import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Every.everyItem;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.*;
import org.junit.Before;

import static org.mockito.Mockito.*;
import org.junit.Rule;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Module;
import com.opencart.GoogleGuiceTest;
import com.opencart.entity.*;
import com.opencart.util.JsonUtils;

import com.opencart.catalog.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

public class TestModelCatalogReviewService  {
  @Mock
  ModelCatalogReviewDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelCatalogReviewServiceImpl service;

  @Before
  public void before() {
    service = new ModelCatalogReviewServiceImpl(dao);
  }

  /* *
   * SELECT COUNT(*) AS total FROM oc_review r LEFT JOIN oc_product p ON (r.product_id = p.product_id) LEFT JOIN oc_product_description pd ON (p.product_id = pd.product_id) WHERE p.product_id = 'param0' AND p.date_available <= NOW() AND p.status = '1' AND r.status = '1' AND pd.language_id = 'param1' 
   */
  @Test
  public void testgetTotalReviewsByProductId() throws Exception {
    java.math.BigInteger bean = mock(java.math.BigInteger.class);

    Integer product_id = null;
    Integer language_id = null;

    when(dao.getTotalReviewsByProductId(product_id, language_id)).thenReturn(bean);

    java.math.BigInteger result = dao.getTotalReviewsByProductId(product_id, language_id);

    assertThat("getTotalReviewsByProductId", result, notNullValue());
  }
  /* *
   * SELECT r.review_id, r.author, r.rating, r.text, p.product_id, pd.name, p.price, p.image, r.date_added FROM oc_review r LEFT JOIN oc_product p ON (r.product_id = p.product_id) LEFT JOIN oc_product_description pd ON (p.product_id = pd.product_id) WHERE p.product_id = 'param0' AND p.date_available <= NOW() AND p.status = '1' AND r.status = '1' AND pd.language_id = 'param1' ORDER BY r.date_added DESC LIMIT param2,param3 
   */
  @Test
  public void testgetReviewsByProductId() throws Exception {

    List<ModelCatalogReview0Dto> list = mock(List.class);

    Integer product_id = null;
    Integer language_id = null;

    when(dao.getReviewsByProductId(product_id, language_id)).thenReturn(list);

    List<ModelCatalogReview0Dto> result = dao.getReviewsByProductId(product_id, language_id);

    assertThat("$methodName$()", result, notNullValue());
  }
}