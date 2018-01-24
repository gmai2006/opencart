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

import com.opencart.checkout.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

public class TestModelCheckoutOrderService  {
  @Mock
  ModelCheckoutOrderDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelCheckoutOrderServiceImpl service;

  @Before
  public void before() {
    service = new ModelCheckoutOrderServiceImpl(dao);
  }

  /* *
   * SELECT a FROM oc_order_voucher  a WHERE order_id = 'param0'  
   */
  @Test
  public void testgetOrderVoucherQuery() throws Exception {

    List<OcOrderVoucher> list = mock(List.class);

    Integer order_id = 0;

    when(dao.getOrderVoucherQuery(order_id)).thenReturn(list);

    List<OcOrderVoucher> result = dao.getOrderVoucherQuery(order_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM oc_order_option  a WHERE order_id = 'param0' AND order_product_id = 'param1'  
   */
  @Test
  public void testgetOptionQuery() throws Exception {

    List<OcOrderOption> list = mock(List.class);

    Integer order_id = 0;
    Integer order_product_id = 0;

    when(dao.getOptionQuery(order_id, order_product_id)).thenReturn(list);

    List<OcOrderOption> result = dao.getOptionQuery(order_id, order_product_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM oc_order_product  a WHERE order_id = 'param0'  
   */
  @Test
  public void testgetProductQuery() throws Exception {

    List<OcOrderProduct> list = mock(List.class);

    Integer order_id = 0;

    when(dao.getProductQuery(order_id)).thenReturn(list);

    List<OcOrderProduct> result = dao.getProductQuery(order_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM oc_order_product  a WHERE order_id = 'param0'  
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
   * SELECT *, (SELECT os.name FROM "oc_order_status" os WHERE os.order_status_id = o.order_status_id AND os.language_id = o.language_id) AS order_status FROM "oc_order" o WHERE o.order_id = 'param0' 
   */
  @Test
  public void testgetOrderQuery() throws Exception {

    List<ModelCheckoutOrder0Dto> list = mock(List.class);

    Integer order_id = 1;

    when(dao.getOrderQuery(order_id)).thenReturn(list);

    List<ModelCheckoutOrder0Dto> result = dao.getOrderQuery(order_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM "oc_order_total"  a WHERE order_id = 'param0' ORDER BY sort_order ASC 
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
   * SELECT COUNT(*) AS total FROM "oc_product_to_download" WHERE product_id = 'param0' 
   */
  @Test
  public void testgetProductDownloadQuery() throws Exception {
    java.math.BigInteger bean = mock(java.math.BigInteger.class);

    Integer product_id = 0;

    when(dao.getProductDownloadQuery(product_id)).thenReturn(bean);

    java.math.BigInteger result = dao.getProductDownloadQuery(product_id);

    assertThat("getProductDownloadQuery", result, notNullValue());
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
  public void testgetOrderStatusQuery() throws Exception {

    List<OcOrderStatus> list = mock(List.class);

    Integer order_status_id = 2;
    Integer language_id = 1;

    when(dao.getOrderStatusQuery(order_status_id, language_id)).thenReturn(list);

    List<OcOrderStatus> result = dao.getOrderStatusQuery(order_status_id, language_id);

    assertThat("$methodName$()", result, notNullValue());
  }
}