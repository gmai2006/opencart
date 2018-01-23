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

import com.opencart.extension.total.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;


public class TestModelExtensionTotalCouponDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelExtensionTotalCouponDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelExtensionTotalCouponDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT COUNT(*) AS total FROM "oc_coupon_history" ch WHERE ch.coupon_id = 'param0' AND ch.customer_id = 'param1' 
   */
  @Test
  public void testgetCouponHistoryQuery() throws Exception {
    Integer coupon_id = null;
    Integer customer_id = null;
    java.math.BigInteger result = dao.getCouponHistoryQuery(coupon_id, customer_id);
    assertThat("getCouponHistoryQuery", result, notNullValue());
  }

  /* *
   * SELECT a FROM "oc_coupon"  a WHERE code = 'param0' AND(( date_start = '0000-00-00' OR date_start < NOW( ) ) AND( date_end = '0000-00-00' OR date_end > NOW( ) ) ) AND status = '1'  
   */
  @Test
  public void testgetCouponQuery() throws Exception {

    String code = "2222";

    List<OcCoupon> result = dao.getCouponQuery(code);
    assertThat("getCouponQuery", result, notNullValue());
  }

  /* *
   * SELECT COUNT(*) AS total FROM "oc_product_to_category" WHERE "product_id" = 'param0' AND category_id = 'param1' 
   */
  @Test
  public void testgetCouponCategoryQuery() throws Exception {
    Integer product_id = 1;
    Integer category_id = 1;
    java.math.BigInteger result = dao.getCouponCategoryQuery(product_id, category_id);
    assertThat("getCouponCategoryQuery", result, notNullValue());
  }

  /* *
   * SELECT a FROM "oc_coupon_product"  a WHERE coupon_id = 'param0'  
   */
  @Test
  public void testgetCouponProductQuery() throws Exception {

    Integer coupon_id = null;

    List<OcCouponProduct> result = dao.getCouponProductQuery(coupon_id);
    assertThat("getCouponProductQuery", result, notNullValue());
  }
}