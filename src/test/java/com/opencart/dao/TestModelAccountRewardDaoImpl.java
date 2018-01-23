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


public class TestModelAccountRewardDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelAccountRewardDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelAccountRewardDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT SUM(points) AS total FROM "oc_customer_reward" WHERE customer_id = 'param0' GROUP BY customer_id 
   */
  @Test
  public void testgetTotalPoints() throws Exception {
    Integer customer_id = 0;
    java.math.BigDecimal result = dao.getTotalPoints(customer_id);
    assertThat("getTotalPoints", result, notNullValue());
  }

  /* *
   * SELECT COUNT(*) AS total FROM "oc_customer_reward" WHERE customer_id = 'param0' 
   */
  @Test
  public void testgetTotalRewards() throws Exception {
    Integer customer_id = 0;
    java.math.BigInteger result = dao.getTotalRewards(customer_id);
    assertThat("getTotalRewards", result, notNullValue());
  }
}