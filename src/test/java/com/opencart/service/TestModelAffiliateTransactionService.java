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

import com.opencart.affiliate.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

public class TestModelAffiliateTransactionService  {
  @Mock
  ModelAffiliateTransactionDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelAffiliateTransactionServiceImpl service;

  @Before
  public void before() {
    service = new ModelAffiliateTransactionServiceImpl(dao);
  }

  /* *
   * SELECT COUNT(*) AS total FROM "oc_affiliate_transaction" WHERE affiliate_id = 'param0' 
   */
  @Test
  public void testgetTotalTransactions() throws Exception {
    java.math.BigInteger bean = mock(java.math.BigInteger.class);

    Integer affiliate_id = 0;

    when(dao.getTotalTransactions(affiliate_id)).thenReturn(bean);

    java.math.BigInteger result = dao.getTotalTransactions(affiliate_id);

    assertThat("getTotalTransactions", result, notNullValue());
  }
  /* *
   * SELECT SUM(amount) AS total FROM "oc_affiliate_transaction" WHERE affiliate_id = 'param0' GROUP BY affiliate_id 
   */
  @Test
  public void testgetBalance() throws Exception {
    java.math.BigDecimal bean = mock(java.math.BigDecimal.class);

    Integer affiliate_id = 0;

    when(dao.getBalance(affiliate_id)).thenReturn(bean);

    java.math.BigDecimal result = dao.getBalance(affiliate_id);

    assertThat("getBalance", result, notNullValue());
  }
}