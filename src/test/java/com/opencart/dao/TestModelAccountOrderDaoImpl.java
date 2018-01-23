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

import com.opencart.account.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;


public class TestModelAccountOrderDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelAccountOrderDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelAccountOrderDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT a FROM "oc_order_voucher"  a WHERE order_id = 'param0'  
   */
  @Test
  public void testgetOrderVouchers() throws Exception {

    Integer order_id = 0;

    List<OcOrderVoucher> result = dao.getOrderVouchers(order_id);
    assertThat("getOrderVouchers", result, notNullValue());
  }

  /* *
   * SELECT a FROM "oc_zone"  a WHERE zone_id = 'param0'  
   */
  @Test
  public void testgetZoneQuery() throws Exception {

    Integer zone_id = 1;

    List<OcZone> result = dao.getZoneQuery(zone_id);
    assertThat("getZoneQuery", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_order_product  a WHERE order_id = 'param0' AND order_product_id = 'param1'  
   */
  @Test
  public void testgetOrderProduct() throws Exception {

    Integer order_id = 0;
    Integer order_product_id = 1;

    List<OcOrderProduct> result = dao.getOrderProduct(order_id, order_product_id);
    assertThat("getOrderProduct", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_order_option  a WHERE order_id = 'param0' AND order_product_id = 'param1'  
   */
  @Test
  public void testgetOrderOptions() throws Exception {

    Integer order_id = 0;
    Integer order_product_id = 0;

    List<OcOrderOption> result = dao.getOrderOptions(order_id, order_product_id);
    assertThat("getOrderOptions", result, notNullValue());
  }

  /* *
   * SELECT COUNT(*) AS total FROM oc_order_product WHERE order_id = 'param0' 
   */
  @Test
  public void testgetTotalOrderProductsByOrderId() throws Exception {
    Integer order_id = 0;
    java.math.BigInteger result = dao.getTotalOrderProductsByOrderId(order_id);
    assertThat("getTotalOrderProductsByOrderId", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_order_product  a WHERE order_id = 'param0'  
   */
  @Test
  public void testgetOrderProducts() throws Exception {

    Integer order_id = 0;

    List<OcOrderProduct> result = dao.getOrderProducts(order_id);
    assertThat("getOrderProducts", result, notNullValue());
  }

  /* *
   * SELECT a FROM "oc_country"  a WHERE country_id = 'param0'  
   */
  @Test
  public void testgetCountryQuery() throws Exception {

    Integer country_id = 1;

    List<OcCountry> result = dao.getCountryQuery(country_id);
    assertThat("getCountryQuery", result, notNullValue());
  }

  /* *
   * SELECT COUNT(*) AS total FROM "oc_order_voucher" WHERE order_id = 'param0' 
   */
  @Test
  public void testgetTotalOrderVouchersByOrderId() throws Exception {
    Integer order_id = 0;
    java.math.BigInteger result = dao.getTotalOrderVouchersByOrderId(order_id);
    assertThat("getTotalOrderVouchersByOrderId", result, notNullValue());
  }

  /* *
   * SELECT date_added, os.name AS status, oh.comment, oh.notify FROM oc_order_history oh LEFT JOIN oc_order_status os ON oh.order_status_id = os.order_status_id WHERE oh.order_id = 'param0' AND os.language_id = 'param1' ORDER BY oh.date_added 
   */
  @Test
  public void testgetOrderHistories() throws Exception {

    Integer order_id = 0;
    Integer language_id = null;

    List<ModelAccountOrder0Dto> result = dao.getOrderHistories(order_id, language_id);
    assertThat("getOrderHistories", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_order_total  a WHERE order_id = 'param0' ORDER BY sort_order 
   */
  @Test
  public void testgetOrderTotals() throws Exception {

    Integer order_id = 0;

    List<OcOrderTotal> result = dao.getOrderTotals(order_id);
    assertThat("getOrderTotals", result, notNullValue());
  }

  /* *
   * SELECT o.order_id, o.firstname, o.lastname, os.name as status, o.date_added, o.total, o.currency_code, o.currency_value FROM "oc_order" o LEFT JOIN oc_order_status os ON (o.order_status_id = os.order_status_id) WHERE o.customer_id = 'param0' AND o.order_status_id > '0' AND o.store_id = 'param1' AND os.language_id = 'param2' ORDER BY o.order_id DESC LIMIT param3,param4 
   */
  @Test
  public void testgetOrders() throws Exception {

    Integer customer_id = 0;
    Integer store_id = 0;
    Integer language_id = 1;

    List<ModelAccountOrder1Dto> result = dao.getOrders(customer_id, store_id, language_id);
    assertThat("getOrders", result, notNullValue());
  }

  /* *
   * SELECT a FROM "oc_order"  a WHERE order_id = 'param0' AND customer_id = 'param1' AND order_status_id > '0'  
   */
  @Test
  public void testgetOrderQuery() throws Exception {

    Integer order_id = 1;
    Integer customer_id = 0;

    List<OcOrder> result = dao.getOrderQuery(order_id, customer_id);
    assertThat("getOrderQuery", result, notNullValue());
  }

  /* *
   * SELECT COUNT(*) AS total FROM "oc_order" o WHERE customer_id = 'param0' AND o.order_status_id > '0' AND o.store_id = 'param1' 
   */
  @Test
  public void testgetTotalOrders() throws Exception {
    Integer customer_id = 0;
    Integer store_id = 0;
    java.math.BigInteger result = dao.getTotalOrders(customer_id, store_id);
    assertThat("getTotalOrders", result, notNullValue());
  }
}