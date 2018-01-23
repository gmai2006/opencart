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

import com.opencart.affiliate.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;


public class TestModelAffiliateAffiliateDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelAffiliateAffiliateDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelAffiliateAffiliateDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT SUM(amount) AS total FROM oc_affiliate_transaction WHERE affiliate_id = 'param0' 
   */
  @Test
  public void testgetTransactionTotal() throws Exception {
    Integer affiliate_id = 0;
    java.math.BigDecimal result = dao.getTransactionTotal(affiliate_id);
    assertThat("getTransactionTotal", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_affiliate  a WHERE affiliate_id = 'param0'  
   */
  @Test
  public void testgetAffiliate() throws Exception {

    Integer affiliate_id = 1;

    List<OcAffiliate> result = dao.getAffiliate(affiliate_id);
    assertThat("getAffiliate", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_affiliate  a WHERE LOWER( email ) = 'param0'  
   */
  @Test
  public void testgetAffiliateByEmail() throws Exception {

    String email = "s";

    List<OcAffiliate> result = dao.getAffiliateByEmail(email);
    assertThat("getAffiliateByEmail", result, notNullValue());
  }

  /* *
   * SELECT COUNT(*) AS total FROM oc_affiliate WHERE LOWER(email) = 'param0' 
   */
  @Test
  public void testgetTotalAffiliatesByEmail() throws Exception {
    String email = "s";
    java.math.BigInteger result = dao.getTotalAffiliatesByEmail(email);
    assertThat("getTotalAffiliatesByEmail", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_affiliate  a WHERE code = 'param0'  
   */
  @Test
  public void testgetAffiliateByCode() throws Exception {

    String code = "s";

    List<OcAffiliate> result = dao.getAffiliateByCode(code);
    assertThat("getAffiliateByCode", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_affiliate_login  a WHERE email = 'param0' AND ip = 'param1'  
   */
  @Test
  public void testaddLoginAttempt() throws Exception {

    String email = "s";
    String ip = "s";

    List<OcAffiliateLogin> result = dao.addLoginAttempt(email, ip);
    assertThat("addLoginAttempt", result, notNullValue());
  }

  /* *
   * SELECT a FROM "oc_affiliate_login"  a WHERE email = 'param0'  
   */
  @Test
  public void testgetLoginAttempts() throws Exception {

    String email = "s";

    List<OcAffiliateLogin> result = dao.getLoginAttempts(email);
    assertThat("getLoginAttempts", result, notNullValue());
  }
}