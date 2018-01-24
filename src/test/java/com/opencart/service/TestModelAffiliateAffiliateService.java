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

public class TestModelAffiliateAffiliateService  {
  @Mock
  ModelAffiliateAffiliateDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelAffiliateAffiliateServiceImpl service;

  @Before
  public void before() {
    service = new ModelAffiliateAffiliateServiceImpl(dao);
  }

  /* *
   * SELECT SUM(amount) AS total FROM oc_affiliate_transaction WHERE affiliate_id = 'param0' 
   */
  @Test
  public void testgetTransactionTotal() throws Exception {
    java.math.BigDecimal bean = mock(java.math.BigDecimal.class);

    Integer affiliate_id = 0;

    when(dao.getTransactionTotal(affiliate_id)).thenReturn(bean);

    java.math.BigDecimal result = dao.getTransactionTotal(affiliate_id);

    assertThat("getTransactionTotal", result, notNullValue());
  }
  /* *
   * SELECT a FROM oc_affiliate  a WHERE affiliate_id = 'param0'  
   */
  @Test
  public void testgetAffiliate() throws Exception {

    List<OcAffiliate> list = mock(List.class);

    Integer affiliate_id = 1;

    when(dao.getAffiliate(affiliate_id)).thenReturn(list);

    List<OcAffiliate> result = dao.getAffiliate(affiliate_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM oc_affiliate  a WHERE LOWER( email ) = 'param0'  
   */
  @Test
  public void testgetAffiliateByEmail() throws Exception {

    List<OcAffiliate> list = mock(List.class);

    String email = "s";

    when(dao.getAffiliateByEmail(email)).thenReturn(list);

    List<OcAffiliate> result = dao.getAffiliateByEmail(email);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT COUNT(*) AS total FROM oc_affiliate WHERE LOWER(email) = 'param0' 
   */
  @Test
  public void testgetTotalAffiliatesByEmail() throws Exception {
    java.math.BigInteger bean = mock(java.math.BigInteger.class);

    String email = "s";

    when(dao.getTotalAffiliatesByEmail(email)).thenReturn(bean);

    java.math.BigInteger result = dao.getTotalAffiliatesByEmail(email);

    assertThat("getTotalAffiliatesByEmail", result, notNullValue());
  }
  /* *
   * SELECT a FROM oc_affiliate  a WHERE code = 'param0'  
   */
  @Test
  public void testgetAffiliateByCode() throws Exception {

    List<OcAffiliate> list = mock(List.class);

    String code = "s";

    when(dao.getAffiliateByCode(code)).thenReturn(list);

    List<OcAffiliate> result = dao.getAffiliateByCode(code);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM oc_affiliate_login  a WHERE email = 'param0' AND ip = 'param1'  
   */
  @Test
  public void testaddLoginAttempt() throws Exception {

    List<OcAffiliateLogin> list = mock(List.class);

    String email = "s";
    String ip = "s";

    when(dao.addLoginAttempt(email, ip)).thenReturn(list);

    List<OcAffiliateLogin> result = dao.addLoginAttempt(email, ip);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM "oc_affiliate_login"  a WHERE email = 'param0'  
   */
  @Test
  public void testgetLoginAttempts() throws Exception {

    List<OcAffiliateLogin> list = mock(List.class);

    String email = "s";

    when(dao.getLoginAttempts(email)).thenReturn(list);

    List<OcAffiliateLogin> result = dao.getLoginAttempts(email);

    assertThat("$methodName$()", result, notNullValue());
  }
}