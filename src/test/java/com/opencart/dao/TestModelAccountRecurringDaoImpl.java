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


public class TestModelAccountRecurringDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelAccountRecurringDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelAccountRecurringDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT "or".*,"o"."payment_method","o"."payment_code","o"."currency_code" FROM "oc_order_recurring" "or" LEFT JOIN "oc_order" "o" ON "or"."order_id" = "o"."order_id" WHERE "or"."order_recurring_id" = 'param0' AND "o"."customer_id" = 'param1' 
   */
  @Test
  public void testgetOrderRecurring() throws Exception {

    Integer order_recurring_id = 1;
    Integer customer_id = null;

    List<ModelAccountRecurring0Dto> result = dao.getOrderRecurring(order_recurring_id, customer_id);
    assertThat("getOrderRecurring", result, notNullValue());
  }

  /* *
   * SELECT COUNT(*) AS total FROM "oc_order_recurring" "or" LEFT JOIN "oc_order" "o" ON "or"."order_id" = "o"."order_id" WHERE "o"."customer_id" = 'param0' 
   */
  @Test
  public void testgetTotalOrderRecurrings() throws Exception {
    Integer customer_id = null;
    java.math.BigInteger result = dao.getTotalOrderRecurrings(customer_id);
    assertThat("getTotalOrderRecurrings", result, notNullValue());
  }

  /* *
   * SELECT a FROM "oc_order_recurring_transaction"  a WHERE "order_recurring_id" = 'param0'  
   */
  @Test
  public void testgetOrderRecurringTransactions() throws Exception {

    Integer order_recurring_id = 0;

    List<OcOrderRecurringTransaction> result = dao.getOrderRecurringTransactions(order_recurring_id);
    assertThat("getOrderRecurringTransactions", result, notNullValue());
  }

  /* *
   * SELECT a FROM "oc_order_recurring"  a WHERE "reference" = 'param0'  
   */
  @Test
  public void testgetOrderRecurringByReference() throws Exception {

    String reference = "s";

    List<OcOrderRecurring> result = dao.getOrderRecurringByReference(reference);
    assertThat("getOrderRecurringByReference", result, notNullValue());
  }

  /* *
   * SELECT "or".*,"o"."payment_method","o"."currency_id","o"."currency_value" FROM "oc_order_recurring" "or" LEFT JOIN "oc_order" "o" ON "or"."order_id" = "o"."order_id" WHERE "o"."customer_id" = 'param0' ORDER BY "o"."order_id" DESC LIMIT param1,param2 
   */
  @Test
  public void testgetOrderRecurrings() throws Exception {

    Integer customer_id = null;

    List<ModelAccountRecurring1Dto> result = dao.getOrderRecurrings(customer_id);
    assertThat("getOrderRecurrings", result, notNullValue());
  }
}