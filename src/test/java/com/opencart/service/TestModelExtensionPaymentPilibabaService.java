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

import com.opencart.extension.payment.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

public class TestModelExtensionPaymentPilibabaService  {
  @Mock
  ModelExtensionPaymentPilibabaDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelExtensionPaymentPilibabaServiceImpl service;

  @Before
  public void before() {
    service = new ModelExtensionPaymentPilibabaServiceImpl(dao);
  }

  /* *
   * SELECT SUM("value") AS "value" FROM "oc_order_total" WHERE "order_id" = 'param0' AND "code" = 'tax' 
   */
  @Test
  public void testgetOrderTaxAmount() throws Exception {
    java.math.BigDecimal bean = mock(java.math.BigDecimal.class);

    Integer order_id = 0;

    when(dao.getOrderTaxAmount(order_id)).thenReturn(bean);

    java.math.BigDecimal result = dao.getOrderTaxAmount(order_id);

    assertThat("getOrderTaxAmount", result, notNullValue());
  }
}