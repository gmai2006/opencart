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

import com.opencart.account.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

public class TestModelAccountOrderService  {
  @Mock
  ModelAccountOrderDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelAccountOrderServiceImpl service;

  @Before
  public void before() {
    service = new ModelAccountOrderServiceImpl(dao);
  }

  /* *
   * SELECT a FROM "oc_order_voucher"  a WHERE order_id = 'param0'  
   */
  @Test
  public void testgetOrderVouchers() throws Exception {

    List<OcOrderVoucher> list = mock(List.class);

    Integer order_id = 0;

    when(dao.getOrderVouchers(order_id)).thenReturn(list);

    List<OcOrderVoucher> result = dao.getOrderVouchers(order_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM "oc_zone"  a WHERE zone_id = 'param0'  
   */
  @Test
  public void testgetZoneQuery() throws Exception {

    List<OcZone> list = mock(List.class);

    Integer zone_id = 1;

    when(dao.getZoneQuery(zone_id)).thenReturn(list);

    List<OcZone> result = dao.getZoneQuery(zone_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM oc_order_product  a WHERE order_id = 'param0' AND order_product_id = 'param1'  
   */
  @Test
  public void testgetOrderProduct() throws Exception {

    List<OcOrderProduct> list = mock(List.class);

    Integer order_id = 0;
    Integer order_product_id = 1;

    when(dao.getOrderProduct(order_id, order_product_id)).thenReturn(list);

    List<OcOrderProduct> result = dao.getOrderProduct(order_id, order_product_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM oc_order_option  a WHERE order_id = 'param0' AND order_product_id = 'param1'  
   */
  @Test
  public void testgetOrderOptions() throws Exception {

    List<OcOrderOption> list = mock(List.class);

    Integer order_id = 0;
    Integer order_product_id = 0;

    when(dao.getOrderOptions(order_id, order_product_id)).thenReturn(list);

    List<OcOrderOption> result = dao.getOrderOptions(order_id, order_product_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT COUNT(*) AS total FROM oc_order_product WHERE order_id = 'param0' 
   */
  @Test
  public void testgetTotalOrderProductsByOrderId() throws Exception {
    java.math.BigInteger bean = mock(java.math.BigInteger.class);

    Integer order_id = 0;

    when(dao.getTotalOrderProductsByOrderId(order_id)).thenReturn(bean);

    java.math.BigInteger result = dao.getTotalOrderProductsByOrderId(order_id);

    assertThat("getTotalOrderProductsByOrderId", result, notNullValue());
  }
  /* *
   * SELECT a FROM oc_order_product  a WHERE order_id = 'param0'  
   */
  @Test
  public void testgetOrderProducts() throws Exception {

    List<OcOrderProduct> list = mock(List.class);

    Integer order_id = 0;

    when(dao.getOrderProducts(order_id)).thenReturn(list);

    List<OcOrderProduct> result = dao.getOrderProducts(order_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM "oc_country"  a WHERE country_id = 'param0'  
   */
  @Test
  public void testgetCountryQuery() throws Exception {

    List<OcCountry> list = mock(List.class);

    Integer country_id = 1;

    when(dao.getCountryQuery(country_id)).thenReturn(list);

    List<OcCountry> result = dao.getCountryQuery(country_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT COUNT(*) AS total FROM "oc_order_voucher" WHERE order_id = 'param0' 
   */
  @Test
  public void testgetTotalOrderVouchersByOrderId() throws Exception {
    java.math.BigInteger bean = mock(java.math.BigInteger.class);

    Integer order_id = 0;

    when(dao.getTotalOrderVouchersByOrderId(order_id)).thenReturn(bean);

    java.math.BigInteger result = dao.getTotalOrderVouchersByOrderId(order_id);

    assertThat("getTotalOrderVouchersByOrderId", result, notNullValue());
  }
  /* *
   * SELECT date_added, os.name AS status, oh.comment, oh.notify FROM oc_order_history oh LEFT JOIN oc_order_status os ON oh.order_status_id = os.order_status_id WHERE oh.order_id = 'param0' AND os.language_id = 'param1' ORDER BY oh.date_added 
   */
  @Test
  public void testgetOrderHistories() throws Exception {

    List<ModelAccountOrder0Dto> list = mock(List.class);

    Integer order_id = 0;
    Integer language_id = null;

    when(dao.getOrderHistories(order_id, language_id)).thenReturn(list);

    List<ModelAccountOrder0Dto> result = dao.getOrderHistories(order_id, language_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM oc_order_total  a WHERE order_id = 'param0' ORDER BY sort_order 
   */
  @Test
  public void testgetOrderTotals() throws Exception {

    List<OcOrderTotal> list = mock(List.class);

    Integer order_id = 0;

    when(dao.getOrderTotals(order_id)).thenReturn(list);

    List<OcOrderTotal> result = dao.getOrderTotals(order_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT o.order_id, o.firstname, o.lastname, os.name as status, o.date_added, o.total, o.currency_code, o.currency_value FROM "oc_order" o LEFT JOIN oc_order_status os ON (o.order_status_id = os.order_status_id) WHERE o.customer_id = 'param0' AND o.order_status_id > '0' AND o.store_id = 'param1' AND os.language_id = 'param2' ORDER BY o.order_id DESC LIMIT param3,param4 
   */
  @Test
  public void testgetOrders() throws Exception {

    List<ModelAccountOrder1Dto> list = mock(List.class);

    Integer customer_id = 0;
    Integer store_id = 0;
    Integer language_id = 1;

    when(dao.getOrders(customer_id, store_id, language_id)).thenReturn(list);

    List<ModelAccountOrder1Dto> result = dao.getOrders(customer_id, store_id, language_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM "oc_order"  a WHERE order_id = 'param0' AND customer_id = 'param1' AND order_status_id > '0'  
   */
  @Test
  public void testgetOrderQuery() throws Exception {

    List<OcOrder> list = mock(List.class);

    Integer order_id = 1;
    Integer customer_id = 0;

    when(dao.getOrderQuery(order_id, customer_id)).thenReturn(list);

    List<OcOrder> result = dao.getOrderQuery(order_id, customer_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT COUNT(*) AS total FROM "oc_order" o WHERE customer_id = 'param0' AND o.order_status_id > '0' AND o.store_id = 'param1' 
   */
  @Test
  public void testgetTotalOrders() throws Exception {
    java.math.BigInteger bean = mock(java.math.BigInteger.class);

    Integer customer_id = 0;
    Integer store_id = 0;

    when(dao.getTotalOrders(customer_id, store_id)).thenReturn(bean);

    java.math.BigInteger result = dao.getTotalOrders(customer_id, store_id);

    assertThat("getTotalOrders", result, notNullValue());
  }
}