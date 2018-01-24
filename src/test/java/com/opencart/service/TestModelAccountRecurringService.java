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

public class TestModelAccountRecurringService  {
  @Mock
  ModelAccountRecurringDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelAccountRecurringServiceImpl service;

  @Before
  public void before() {
    service = new ModelAccountRecurringServiceImpl(dao);
  }

  /* *
   * SELECT "or".*,"o"."payment_method","o"."payment_code","o"."currency_code" FROM "oc_order_recurring" "or" LEFT JOIN "oc_order" "o" ON "or"."order_id" = "o"."order_id" WHERE "or"."order_recurring_id" = 'param0' AND "o"."customer_id" = 'param1' 
   */
  @Test
  public void testgetOrderRecurring() throws Exception {

    List<ModelAccountRecurring0Dto> list = mock(List.class);

    Integer order_recurring_id = 1;
    Integer customer_id = null;

    when(dao.getOrderRecurring(order_recurring_id, customer_id)).thenReturn(list);

    List<ModelAccountRecurring0Dto> result = dao.getOrderRecurring(order_recurring_id, customer_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT COUNT(*) AS total FROM "oc_order_recurring" "or" LEFT JOIN "oc_order" "o" ON "or"."order_id" = "o"."order_id" WHERE "o"."customer_id" = 'param0' 
   */
  @Test
  public void testgetTotalOrderRecurrings() throws Exception {
    java.math.BigInteger bean = mock(java.math.BigInteger.class);

    Integer customer_id = null;

    when(dao.getTotalOrderRecurrings(customer_id)).thenReturn(bean);

    java.math.BigInteger result = dao.getTotalOrderRecurrings(customer_id);

    assertThat("getTotalOrderRecurrings", result, notNullValue());
  }
  /* *
   * SELECT a FROM "oc_order_recurring_transaction"  a WHERE "order_recurring_id" = 'param0'  
   */
  @Test
  public void testgetOrderRecurringTransactions() throws Exception {

    List<OcOrderRecurringTransaction> list = mock(List.class);

    Integer order_recurring_id = 0;

    when(dao.getOrderRecurringTransactions(order_recurring_id)).thenReturn(list);

    List<OcOrderRecurringTransaction> result = dao.getOrderRecurringTransactions(order_recurring_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM "oc_order_recurring"  a WHERE "reference" = 'param0'  
   */
  @Test
  public void testgetOrderRecurringByReference() throws Exception {

    List<OcOrderRecurring> list = mock(List.class);

    String reference = "s";

    when(dao.getOrderRecurringByReference(reference)).thenReturn(list);

    List<OcOrderRecurring> result = dao.getOrderRecurringByReference(reference);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT "or".*,"o"."payment_method","o"."currency_id","o"."currency_value" FROM "oc_order_recurring" "or" LEFT JOIN "oc_order" "o" ON "or"."order_id" = "o"."order_id" WHERE "o"."customer_id" = 'param0' ORDER BY "o"."order_id" DESC LIMIT param1,param2 
   */
  @Test
  public void testgetOrderRecurrings() throws Exception {

    List<ModelAccountRecurring1Dto> list = mock(List.class);

    Integer customer_id = null;

    when(dao.getOrderRecurrings(customer_id)).thenReturn(list);

    List<ModelAccountRecurring1Dto> result = dao.getOrderRecurrings(customer_id);

    assertThat("$methodName$()", result, notNullValue());
  }
}