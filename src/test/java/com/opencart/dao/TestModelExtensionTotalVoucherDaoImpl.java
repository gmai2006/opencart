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


public class TestModelExtensionTotalVoucherDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelExtensionTotalVoucherDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelExtensionTotalVoucherDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT order_id FROM "oc_order" WHERE order_id = 'param0' AND order_status_id IN(param1) 
   */
  @Test
  public void testgetOrderQuery() throws Exception {

    Integer order_id = 1;

    List<Integer> result = dao.getOrderQuery(order_id);
    assertThat("getOrderQuery", result, notNullValue());
  }

  /* *
   * SELECT *, vtd.name AS theme FROM oc_voucher v LEFT JOIN oc_voucher_theme vt ON (v.voucher_theme_id = vt.voucher_theme_id) LEFT JOIN oc_voucher_theme_description vtd ON (vt.voucher_theme_id = vtd.voucher_theme_id) WHERE v.code = 'param0' AND vtd.language_id = 'param1' AND v.status = '1' 
   */
  @Test
  public void testgetVoucherQuery() throws Exception {

    String code = "s";
    Integer language_id = null;

    List<ModelExtensionTotalVoucher0Dto> result = dao.getVoucherQuery(code, language_id);
    assertThat("getVoucherQuery", result, notNullValue());
  }

  /* *
   * SELECT order_voucher_id FROM "oc_order_voucher" WHERE order_id = 'param0' AND voucher_id = 'param1' 
   */
  @Test
  public void testgetOrderVoucherQuery() throws Exception {

    Integer order_id = 0;
    Integer voucher_id = 0;

    List<Integer> result = dao.getOrderVoucherQuery(order_id, voucher_id);
    assertThat("getOrderVoucherQuery", result, notNullValue());
  }

  /* *
   * SELECT SUM(amount) AS total FROM "oc_voucher_history" vh WHERE vh.voucher_id = 'param0' GROUP BY vh.voucher_id 
   */
  @Test
  public void testgetVoucherHistoryQuery() throws Exception {
    Integer voucher_id = 0;
    java.math.BigDecimal result = dao.getVoucherHistoryQuery(voucher_id);
    assertThat("getVoucherHistoryQuery", result, notNullValue());
  }
}