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

import com.opencart.extension.total.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

public class TestModelExtensionTotalCouponService  {
  @Mock
  ModelExtensionTotalCouponDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelExtensionTotalCouponServiceImpl service;

  @Before
  public void before() {
    service = new ModelExtensionTotalCouponServiceImpl(dao);
  }

  /* *
   * SELECT COUNT(*) AS total FROM "oc_coupon_history" ch WHERE ch.coupon_id = 'param0' AND ch.customer_id = 'param1' 
   */
  @Test
  public void testgetCouponHistoryQuery() throws Exception {
    java.math.BigInteger bean = mock(java.math.BigInteger.class);

    Integer coupon_id = null;
    Integer customer_id = null;

    when(dao.getCouponHistoryQuery(coupon_id, customer_id)).thenReturn(bean);

    java.math.BigInteger result = dao.getCouponHistoryQuery(coupon_id, customer_id);

    assertThat("getCouponHistoryQuery", result, notNullValue());
  }
  /* *
   * SELECT a FROM "oc_coupon"  a WHERE code = 'param0' AND(( date_start = '0000-00-00' OR date_start < NOW( ) ) AND( date_end = '0000-00-00' OR date_end > NOW( ) ) ) AND status = '1'  
   */
  @Test
  public void testgetCouponQuery() throws Exception {

    List<OcCoupon> list = mock(List.class);

    String code = "2222";

    when(dao.getCouponQuery(code)).thenReturn(list);

    List<OcCoupon> result = dao.getCouponQuery(code);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT COUNT(*) AS total FROM "oc_product_to_category" WHERE "product_id" = 'param0' AND category_id = 'param1' 
   */
  @Test
  public void testgetCouponCategoryQuery() throws Exception {
    java.math.BigInteger bean = mock(java.math.BigInteger.class);

    Integer product_id = 1;
    Integer category_id = 1;

    when(dao.getCouponCategoryQuery(product_id, category_id)).thenReturn(bean);

    java.math.BigInteger result = dao.getCouponCategoryQuery(product_id, category_id);

    assertThat("getCouponCategoryQuery", result, notNullValue());
  }
  /* *
   * SELECT a FROM "oc_coupon_product"  a WHERE coupon_id = 'param0'  
   */
  @Test
  public void testgetCouponProductQuery() throws Exception {

    List<OcCouponProduct> list = mock(List.class);

    Integer coupon_id = null;

    when(dao.getCouponProductQuery(coupon_id)).thenReturn(list);

    List<OcCouponProduct> result = dao.getCouponProductQuery(coupon_id);

    assertThat("$methodName$()", result, notNullValue());
  }
}