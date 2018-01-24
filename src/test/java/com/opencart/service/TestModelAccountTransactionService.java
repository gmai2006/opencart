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

public class TestModelAccountTransactionService  {
  @Mock
  ModelAccountTransactionDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelAccountTransactionServiceImpl service;

  @Before
  public void before() {
    service = new ModelAccountTransactionServiceImpl(dao);
  }

  /* *
   * SELECT COUNT(*) AS total FROM "oc_customer_transaction" WHERE customer_id = 'param0' 
   */
  @Test
  public void testgetTotalTransactions() throws Exception {
    java.math.BigInteger bean = mock(java.math.BigInteger.class);

    Integer customer_id = 0;

    when(dao.getTotalTransactions(customer_id)).thenReturn(bean);

    java.math.BigInteger result = dao.getTotalTransactions(customer_id);

    assertThat("getTotalTransactions", result, notNullValue());
  }
  /* *
   * SELECT SUM(amount) AS total FROM "oc_customer_transaction" WHERE customer_id = 'param0' GROUP BY customer_id 
   */
  @Test
  public void testgetTotalAmount() throws Exception {
    java.math.BigDecimal bean = mock(java.math.BigDecimal.class);

    Integer customer_id = 0;

    when(dao.getTotalAmount(customer_id)).thenReturn(bean);

    java.math.BigDecimal result = dao.getTotalAmount(customer_id);

    assertThat("getTotalAmount", result, notNullValue());
  }
}