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

public class TestModelAccountWishlistService  {
  @Mock
  ModelAccountWishlistDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelAccountWishlistServiceImpl service;

  @Before
  public void before() {
    service = new ModelAccountWishlistServiceImpl(dao);
  }

  /* *
   * SELECT a FROM oc_customer_wishlist  a WHERE customer_id = 'param0'  
   */
  @Test
  public void testgetWishlist() throws Exception {

    List<OcCustomerWishlist> list = mock(List.class);

    Integer customer_id = 0;

    when(dao.getWishlist(customer_id)).thenReturn(list);

    List<OcCustomerWishlist> result = dao.getWishlist(customer_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT COUNT(*) AS total FROM oc_customer_wishlist WHERE customer_id = 'param0' 
   */
  @Test
  public void testgetTotalWishlist() throws Exception {
    java.math.BigInteger bean = mock(java.math.BigInteger.class);

    Integer customer_id = 0;

    when(dao.getTotalWishlist(customer_id)).thenReturn(bean);

    java.math.BigInteger result = dao.getTotalWishlist(customer_id);

    assertThat("getTotalWishlist", result, notNullValue());
  }
}