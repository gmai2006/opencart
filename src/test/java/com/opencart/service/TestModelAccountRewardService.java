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

public class TestModelAccountRewardService  {
  @Mock
  ModelAccountRewardDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelAccountRewardServiceImpl service;

  @Before
  public void before() {
    service = new ModelAccountRewardServiceImpl(dao);
  }

  /* *
   * SELECT SUM(points) AS total FROM "oc_customer_reward" WHERE customer_id = 'param0' GROUP BY customer_id 
   */
  @Test
  public void testgetTotalPoints() throws Exception {
    java.math.BigDecimal bean = mock(java.math.BigDecimal.class);

    Integer customer_id = 0;

    when(dao.getTotalPoints(customer_id)).thenReturn(bean);

    java.math.BigDecimal result = dao.getTotalPoints(customer_id);

    assertThat("getTotalPoints", result, notNullValue());
  }
  /* *
   * SELECT COUNT(*) AS total FROM "oc_customer_reward" WHERE customer_id = 'param0' 
   */
  @Test
  public void testgetTotalRewards() throws Exception {
    java.math.BigInteger bean = mock(java.math.BigInteger.class);

    Integer customer_id = 0;

    when(dao.getTotalRewards(customer_id)).thenReturn(bean);

    java.math.BigInteger result = dao.getTotalRewards(customer_id);

    assertThat("getTotalRewards", result, notNullValue());
  }
}