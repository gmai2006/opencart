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


public class TestModelAccountCustomerDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelAccountCustomerDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelAccountCustomerDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT a FROM oc_customer_login  a WHERE email = 'param0' AND ip = 'param1'  
   */
  @Test
  public void testaddLoginAttempt() throws Exception {

    String email = "s";
    String ip = "s";

    List<OcCustomerLogin> result = dao.addLoginAttempt(email, ip);
    assertThat("addLoginAttempt", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_customer  a WHERE LOWER( email ) = 'param0'  
   */
  @Test
  public void testgetCustomerByEmail() throws Exception {

    String email = "s";

    List<OcCustomer> result = dao.getCustomerByEmail(email);
    assertThat("getCustomerByEmail", result, notNullValue());
  }

  /* *
   * SELECT a FROM "oc_customer_ip"  a WHERE customer_id = 'param0'  
   */
  @Test
  public void testgetIps() throws Exception {

    Integer customer_id = 0;

    List<OcCustomerIp> result = dao.getIps(customer_id);
    assertThat("getIps", result, notNullValue());
  }

  /* *
   * SELECT a FROM "oc_customer_login"  a WHERE email = 'param0'  
   */
  @Test
  public void testgetLoginAttempts() throws Exception {

    String email = "s";

    List<OcCustomerLogin> result = dao.getLoginAttempts(email);
    assertThat("getLoginAttempts", result, notNullValue());
  }

  /* *
   * SELECT SUM(points) AS total FROM oc_customer_reward WHERE customer_id = 'param0' 
   */
  @Test
  public void testgetRewardTotal() throws Exception {
    Integer customer_id = 0;
    java.math.BigDecimal result = dao.getRewardTotal(customer_id);
    assertThat("getRewardTotal", result, notNullValue());
  }

  /* *
   * SELECT customer_id, firstname, lastname, email FROM "oc_customer" WHERE code = 'param0' AND code != '' 
   */
  @Test
  public void testgetCustomerByCode() throws Exception {

    String code = "s";

    List<ModelAccountCustomer0Dto> result = dao.getCustomerByCode(code);
    assertThat("getCustomerByCode", result, notNullValue());
  }

  /* *
   * SELECT COUNT(*) AS total FROM oc_customer WHERE LOWER(email) = 'param0' 
   */
  @Test
  public void testgetTotalCustomersByEmail() throws Exception {
    String email = "s";
    java.math.BigInteger result = dao.getTotalCustomersByEmail(email);
    assertThat("getTotalCustomersByEmail", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_customer  a WHERE customer_id = 'param0'  
   */
  @Test
  public void testgetCustomer() throws Exception {

    Integer customer_id = 1;

    List<OcCustomer> result = dao.getCustomer(customer_id);
    assertThat("getCustomer", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_customer  a WHERE token = 'param0' AND token != ''  
   */
  @Test
  public void testgetCustomerByToken() throws Exception {

    String token = "s";

    List<OcCustomer> result = dao.getCustomerByToken(token);
    assertThat("getCustomerByToken", result, notNullValue());
  }
}