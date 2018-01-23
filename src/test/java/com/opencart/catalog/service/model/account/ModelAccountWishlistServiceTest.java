package com.opencart.catalog.service.model.account;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import com.opencart.model.*;
import com.opencart.catalog.dao.model.account.ModelAccountWishlistDAO;
import com.opencart.catalog.model.*;

public class ModelAccountWishlistServiceTest {
  @Mock
  ModelAccountWishlistDAO dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  @Test
  public void testaddWishlist1() throws Exception {
    ModelAccountWishlistService service = new ModelAccountWishlistServiceImpl(dao);

    Integer bean = mock(Integer.class);

    //replace these null with real values from DB 

    when(dao.addWishlist1()).thenReturn(bean);

    Integer result = service.addWishlist1();

    assertThat("addWishlist1()", result, notNullValue());
    assertThat("addWishlist1()", result > 0);
  }
  @Test
  public void testgetTotalWishlist() throws Exception {
    ModelAccountWishlistService service = new ModelAccountWishlistServiceImpl(dao);

    GettotalwishlistDTO bean = mock(GettotalwishlistDTO.class);
    //replace these null with real values from DB 
    Integer customerid = null;

    when(dao.getTotalWishlist(customerid)).thenReturn(Arrays.asList(bean));

    List<GettotalwishlistDTO> result = service.getTotalWishlist(customerid);

    assertThat("getTotalWishlist()", result, notNullValue());
    assertThat("getTotalWishlist()", result.size(), is(1));
  }
  @Test
  public void testdeleteWishlist() throws Exception {
    ModelAccountWishlistService service = new ModelAccountWishlistServiceImpl(dao);

    Integer bean = mock(Integer.class);

    //replace these null with real values from DB 
    Integer customerid = null;
    Integer productid = null;

    when(dao.deleteWishlist(customerid, productid)).thenReturn(bean);

    Integer result = service.deleteWishlist(customerid, productid);

    assertThat("deleteWishlist()", result, notNullValue());
    assertThat("deleteWishlist()", result > 0);
  }
  @Test
  public void testgetWishlist() throws Exception {
    ModelAccountWishlistService service = new ModelAccountWishlistServiceImpl(dao);

    OcCustomerWishlist bean = mock(OcCustomerWishlist.class);
    //replace these null with real values from DB 
    Integer customerid = null;

    when(dao.getWishlist(customerid)).thenReturn(Arrays.asList(bean));

    List<OcCustomerWishlist> result = service.getWishlist(customerid);

    assertThat("getWishlist()", result, notNullValue());
    assertThat("getWishlist()", result.size(), is(1));
  }
  @Test
  public void testaddWishlist() throws Exception {
    ModelAccountWishlistService service = new ModelAccountWishlistServiceImpl(dao);

    Integer bean = mock(Integer.class);

    //replace these null with real values from DB 
    Integer customerid = null;
    Integer productid = null;

    when(dao.addWishlist(customerid, productid)).thenReturn(bean);

    Integer result = service.addWishlist(customerid, productid);

    assertThat("addWishlist()", result, notNullValue());
    assertThat("addWishlist()", result > 0);
  }
}