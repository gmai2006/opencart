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

import com.opencart.extension.openbay.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

public class TestModelExtensionOpenBayEbayOrderService  {
  @Mock
  ModelExtensionOpenBayEbayOrderDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelExtensionOpenBayEbayOrderServiceImpl service;

  @Before
  public void before() {
    service = new ModelExtensionOpenBayEbayOrderServiceImpl(dao);
  }

  /* *
   * SELECT a FROM "oc_order"  a WHERE "order_id" = 'param0' AND "payment_firstname" != '' AND "payment_address_1" != '' AND "payment_country" != ''  
   */
  @Test
  public void testhasAddress() throws Exception {

    List<OcOrder> list = mock(List.class);

    Integer order_id = 1;

    when(dao.hasAddress(order_id)).thenReturn(list);

    List<OcOrder> result = dao.hasAddress(order_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM "oc_order_status"  a WHERE "order_status_id" = 'param0' AND "language_id" = 'param1'  
   */
  @Test
  public void testgetOrderStatusQuery() throws Exception {

    List<OcOrderStatus> list = mock(List.class);

    Integer order_status_id = 2;
    Integer language_id = 1;

    when(dao.getOrderStatusQuery(order_status_id, language_id)).thenReturn(list);

    List<OcOrderStatus> result = dao.getOrderStatusQuery(order_status_id, language_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM "oc_order_total"  a WHERE "order_id" = 'param0' ORDER BY "sort_order" ASC 
   */
  @Test
  public void testgetOrderTotalQuery() throws Exception {

    List<OcOrderTotal> list = mock(List.class);

    Integer order_id = 0;

    when(dao.getOrderTotalQuery(order_id)).thenReturn(list);

    List<OcOrderTotal> result = dao.getOrderTotalQuery(order_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM "oc_product"  a WHERE "product_id" = 'param0'  LIMIT 1
   */
  @Test
  public void testaddOrderHistory() throws Exception {

    List<OcProduct> list = mock(List.class);

    Integer product_id = 1;

    when(dao.addOrderHistory(product_id)).thenReturn(list);

    List<OcProduct> result = dao.addOrderHistory(product_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT "order_status_id" FROM "oc_order_history" WHERE "order_id" = 'param0' 
   */
  @Test
  public void testgetHistory() throws Exception {

    List<Integer> list = mock(List.class);

    Integer order_id = 0;

    when(dao.getHistory(order_id)).thenReturn(list);

    List<Integer> result = dao.getHistory(order_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM "oc_country"  a WHERE "iso_code_2" = 'param0'  LIMIT 1
   */
  @Test
  public void testgetCountryAddressFormat() throws Exception {

    List<OcCountry> list = mock(List.class);

    String iso_code_2 = "AF";

    when(dao.getCountryAddressFormat(iso_code_2)).thenReturn(list);

    List<OcCountry> result = dao.getCountryAddressFormat(iso_code_2);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM "oc_order_product"  a WHERE "order_id" = 'param0'  
   */
  @Test
  public void testgetOrderProductQuery() throws Exception {

    List<OcOrderProduct> list = mock(List.class);

    Integer order_id = 0;

    when(dao.getOrderProductQuery(order_id)).thenReturn(list);

    List<OcOrderProduct> result = dao.getOrderProductQuery(order_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM oc_order_option  a WHERE order_id = 'param0' AND order_product_id = 'param1'  
   */
  @Test
  public void testgetOrderOptionQuery() throws Exception {

    List<OcOrderOption> list = mock(List.class);

    Integer order_id = 0;
    Integer order_product_id = 0;

    when(dao.getOrderOptionQuery(order_id, order_product_id)).thenReturn(list);

    List<OcOrderOption> result = dao.getOrderOptionQuery(order_id, order_product_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM oc_order_status  a WHERE order_status_id = 'param0' AND language_id = 'param1'  
   */
  @Test
  public void testupdate() throws Exception {

    List<OcOrderStatus> list = mock(List.class);

    Integer order_status_id = 2;
    Integer language_id = 1;

    when(dao.update(order_status_id, language_id)).thenReturn(list);

    List<OcOrderStatus> result = dao.update(order_status_id, language_id);

    assertThat("$methodName$()", result, notNullValue());
  }
}