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

import com.opencart.extension.openbay.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;


public class TestModelExtensionOpenBayEbayOrderDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelExtensionOpenBayEbayOrderDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelExtensionOpenBayEbayOrderDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT a FROM "oc_order"  a WHERE "order_id" = 'param0' AND "payment_firstname" != '' AND "payment_address_1" != '' AND "payment_country" != ''  
   */
  @Test
  public void testhasAddress() throws Exception {

    Integer order_id = 1;

    List<OcOrder> result = dao.hasAddress(order_id);
    assertThat("hasAddress", result, notNullValue());
  }

  /* *
   * SELECT a FROM "oc_order_status"  a WHERE "order_status_id" = 'param0' AND "language_id" = 'param1'  
   */
  @Test
  public void testgetOrderStatusQuery() throws Exception {

    Integer order_status_id = 2;
    Integer language_id = 1;

    List<OcOrderStatus> result = dao.getOrderStatusQuery(order_status_id, language_id);
    assertThat("getOrderStatusQuery", result, notNullValue());
  }

  /* *
   * SELECT a FROM "oc_order_total"  a WHERE "order_id" = 'param0' ORDER BY "sort_order" ASC 
   */
  @Test
  public void testgetOrderTotalQuery() throws Exception {

    Integer order_id = 0;

    List<OcOrderTotal> result = dao.getOrderTotalQuery(order_id);
    assertThat("getOrderTotalQuery", result, notNullValue());
  }

  /* *
   * SELECT a FROM "oc_product"  a WHERE "product_id" = 'param0'  LIMIT 1
   */
  @Test
  public void testaddOrderHistory() throws Exception {

    Integer product_id = 1;

    List<OcProduct> result = dao.addOrderHistory(product_id);
    assertThat("addOrderHistory", result, notNullValue());
  }

  /* *
   * SELECT "order_status_id" FROM "oc_order_history" WHERE "order_id" = 'param0' 
   */
  @Test
  public void testgetHistory() throws Exception {

    Integer order_id = 0;

    List<Integer> result = dao.getHistory(order_id);
    assertThat("getHistory", result, notNullValue());
  }

  /* *
   * SELECT a FROM "oc_country"  a WHERE "iso_code_2" = 'param0'  LIMIT 1
   */
  @Test
  public void testgetCountryAddressFormat() throws Exception {

    String iso_code_2 = "AF";

    List<OcCountry> result = dao.getCountryAddressFormat(iso_code_2);
    assertThat("getCountryAddressFormat", result, notNullValue());
  }

  /* *
   * SELECT a FROM "oc_order_product"  a WHERE "order_id" = 'param0'  
   */
  @Test
  public void testgetOrderProductQuery() throws Exception {

    Integer order_id = 0;

    List<OcOrderProduct> result = dao.getOrderProductQuery(order_id);
    assertThat("getOrderProductQuery", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_order_option  a WHERE order_id = 'param0' AND order_product_id = 'param1'  
   */
  @Test
  public void testgetOrderOptionQuery() throws Exception {

    Integer order_id = 0;
    Integer order_product_id = 0;

    List<OcOrderOption> result = dao.getOrderOptionQuery(order_id, order_product_id);
    assertThat("getOrderOptionQuery", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_order_status  a WHERE order_status_id = 'param0' AND language_id = 'param1'  
   */
  @Test
  public void testupdate() throws Exception {

    Integer order_status_id = 2;
    Integer language_id = 1;

    List<OcOrderStatus> result = dao.update(order_status_id, language_id);
    assertThat("update", result, notNullValue());
  }
}