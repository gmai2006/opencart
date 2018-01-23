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


public class TestModelAccountWishlistDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelAccountWishlistDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelAccountWishlistDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT a FROM oc_customer_wishlist  a WHERE customer_id = 'param0'  
   */
  @Test
  public void testgetWishlist() throws Exception {

    Integer customer_id = 0;

    List<OcCustomerWishlist> result = dao.getWishlist(customer_id);
    assertThat("getWishlist", result, notNullValue());
  }

  /* *
   * SELECT COUNT(*) AS total FROM oc_customer_wishlist WHERE customer_id = 'param0' 
   */
  @Test
  public void testgetTotalWishlist() throws Exception {
    Integer customer_id = 0;
    java.math.BigInteger result = dao.getTotalWishlist(customer_id);
    assertThat("getTotalWishlist", result, notNullValue());
  }
}