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

import com.opencart.checkout.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;


public class TestModelCheckoutOrderDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelCheckoutOrderDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelCheckoutOrderDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT a FROM oc_order_voucher  a WHERE order_id = 'param0'  
   */
  @Test
  public void testgetOrderVoucherQuery() throws Exception {

    Integer order_id = 0;

    List<OcOrderVoucher> result = dao.getOrderVoucherQuery(order_id);
    assertThat("getOrderVoucherQuery", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_order_option  a WHERE order_id = 'param0' AND order_product_id = 'param1'  
   */
  @Test
  public void testgetOptionQuery() throws Exception {

    Integer order_id = 0;
    Integer order_product_id = 0;

    List<OcOrderOption> result = dao.getOptionQuery(order_id, order_product_id);
    assertThat("getOptionQuery", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_order_product  a WHERE order_id = 'param0'  
   */
  @Test
  public void testgetProductQuery() throws Exception {

    Integer order_id = 0;

    List<OcOrderProduct> result = dao.getProductQuery(order_id);
    assertThat("getProductQuery", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_order_product  a WHERE order_id = 'param0'  
   */
  @Test
  public void testgetOrderProductQuery() throws Exception {

    Integer order_id = 0;

    List<OcOrderProduct> result = dao.getOrderProductQuery(order_id);
    assertThat("getOrderProductQuery", result, notNullValue());
  }

  /* *
   * SELECT *, (SELECT os.name FROM "oc_order_status" os WHERE os.order_status_id = o.order_status_id AND os.language_id = o.language_id) AS order_status FROM "oc_order" o WHERE o.order_id = 'param0' 
   */
  @Test
  public void testgetOrderQuery() throws Exception {

    Integer order_id = 1;

    List<ModelCheckoutOrder0Dto> result = dao.getOrderQuery(order_id);
    assertThat("getOrderQuery", result, notNullValue());
  }

  /* *
   * SELECT a FROM "oc_order_total"  a WHERE order_id = 'param0' ORDER BY sort_order ASC 
   */
  @Test
  public void testgetOrderTotalQuery() throws Exception {

    Integer order_id = 0;

    List<OcOrderTotal> result = dao.getOrderTotalQuery(order_id);
    assertThat("getOrderTotalQuery", result, notNullValue());
  }

  /* *
   * SELECT COUNT(*) AS total FROM "oc_product_to_download" WHERE product_id = 'param0' 
   */
  @Test
  public void testgetProductDownloadQuery() throws Exception {
    Integer product_id = 0;
    java.math.BigInteger result = dao.getProductDownloadQuery(product_id);
    assertThat("getProductDownloadQuery", result, notNullValue());
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
   * SELECT a FROM "oc_zone"  a WHERE zone_id = 'param0'  
   */
  @Test
  public void testgetZoneQuery() throws Exception {

    Integer zone_id = 1;

    List<OcZone> result = dao.getZoneQuery(zone_id);
    assertThat("getZoneQuery", result, notNullValue());
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
  public void testgetOrderStatusQuery() throws Exception {

    Integer order_status_id = 2;
    Integer language_id = 1;

    List<OcOrderStatus> result = dao.getOrderStatusQuery(order_status_id, language_id);
    assertThat("getOrderStatusQuery", result, notNullValue());
  }
}