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

public class TestModelAccountCustomerService  {
  @Mock
  ModelAccountCustomerDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelAccountCustomerServiceImpl service;

  @Before
  public void before() {
    service = new ModelAccountCustomerServiceImpl(dao);
  }

  /* *
   * SELECT a FROM oc_customer_login  a WHERE email = 'param0' AND ip = 'param1'  
   */
  @Test
  public void testaddLoginAttempt() throws Exception {

    List<OcCustomerLogin> list = mock(List.class);

    String email = "s";
    String ip = "s";

    when(dao.addLoginAttempt(email, ip)).thenReturn(list);

    List<OcCustomerLogin> result = dao.addLoginAttempt(email, ip);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM oc_customer  a WHERE LOWER( email ) = 'param0'  
   */
  @Test
  public void testgetCustomerByEmail() throws Exception {

    List<OcCustomer> list = mock(List.class);

    String email = "s";

    when(dao.getCustomerByEmail(email)).thenReturn(list);

    List<OcCustomer> result = dao.getCustomerByEmail(email);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM "oc_customer_ip"  a WHERE customer_id = 'param0'  
   */
  @Test
  public void testgetIps() throws Exception {

    List<OcCustomerIp> list = mock(List.class);

    Integer customer_id = 0;

    when(dao.getIps(customer_id)).thenReturn(list);

    List<OcCustomerIp> result = dao.getIps(customer_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM "oc_customer_login"  a WHERE email = 'param0'  
   */
  @Test
  public void testgetLoginAttempts() throws Exception {

    List<OcCustomerLogin> list = mock(List.class);

    String email = "s";

    when(dao.getLoginAttempts(email)).thenReturn(list);

    List<OcCustomerLogin> result = dao.getLoginAttempts(email);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT SUM(points) AS total FROM oc_customer_reward WHERE customer_id = 'param0' 
   */
  @Test
  public void testgetRewardTotal() throws Exception {
    java.math.BigDecimal bean = mock(java.math.BigDecimal.class);

    Integer customer_id = 0;

    when(dao.getRewardTotal(customer_id)).thenReturn(bean);

    java.math.BigDecimal result = dao.getRewardTotal(customer_id);

    assertThat("getRewardTotal", result, notNullValue());
  }
  /* *
   * SELECT customer_id, firstname, lastname, email FROM "oc_customer" WHERE code = 'param0' AND code != '' 
   */
  @Test
  public void testgetCustomerByCode() throws Exception {

    List<ModelAccountCustomer0Dto> list = mock(List.class);

    String code = "s";

    when(dao.getCustomerByCode(code)).thenReturn(list);

    List<ModelAccountCustomer0Dto> result = dao.getCustomerByCode(code);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT COUNT(*) AS total FROM oc_customer WHERE LOWER(email) = 'param0' 
   */
  @Test
  public void testgetTotalCustomersByEmail() throws Exception {
    java.math.BigInteger bean = mock(java.math.BigInteger.class);

    String email = "s";

    when(dao.getTotalCustomersByEmail(email)).thenReturn(bean);

    java.math.BigInteger result = dao.getTotalCustomersByEmail(email);

    assertThat("getTotalCustomersByEmail", result, notNullValue());
  }
  /* *
   * SELECT a FROM oc_customer  a WHERE customer_id = 'param0'  
   */
  @Test
  public void testgetCustomer() throws Exception {

    List<OcCustomer> list = mock(List.class);

    Integer customer_id = 1;

    when(dao.getCustomer(customer_id)).thenReturn(list);

    List<OcCustomer> result = dao.getCustomer(customer_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM oc_customer  a WHERE token = 'param0' AND token != ''  
   */
  @Test
  public void testgetCustomerByToken() throws Exception {

    List<OcCustomer> list = mock(List.class);

    String token = "s";

    when(dao.getCustomerByToken(token)).thenReturn(list);

    List<OcCustomer> result = dao.getCustomerByToken(token);

    assertThat("$methodName$()", result, notNullValue());
  }
}