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
import com.opencart.catalog.dao.model.account.ModelAccountAddressDAO;
import com.opencart.catalog.model.*;

public class ModelAccountAddressServiceTest {
  @Mock
  ModelAccountAddressDAO dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  @Test
  public void testgetAddresses() throws Exception {
    ModelAccountAddressService service = new ModelAccountAddressServiceImpl(dao);

    OcAddress bean = mock(OcAddress.class);
    //replace these null with real values from DB 
    Integer customerid = null;

    when(dao.getAddresses(customerid)).thenReturn(Arrays.asList(bean));

    List<OcAddress> result = service.getAddresses(customerid);

    assertThat("getAddresses()", result, notNullValue());
    assertThat("getAddresses()", result.size(), is(1));
  }
  @Test
  public void testgetAddress2() throws Exception {
    ModelAccountAddressService service = new ModelAccountAddressServiceImpl(dao);

    OcZone bean = mock(OcZone.class);
    //replace these null with real values from DB 
    Integer zoneid = null;

    when(dao.getAddress2(zoneid)).thenReturn(Arrays.asList(bean));

    List<OcZone> result = service.getAddress2(zoneid);

    assertThat("getAddress2()", result, notNullValue());
    assertThat("getAddress2()", result.size(), is(1));
  }
  @Test
  public void testeditAddress1() throws Exception {
    ModelAccountAddressService service = new ModelAccountAddressServiceImpl(dao);

    Integer bean = mock(Integer.class);

    //replace these null with real values from DB 
    Integer customerid = null;

    when(dao.editAddress1(customerid)).thenReturn(bean);

    Integer result = service.editAddress1(customerid);

    assertThat("editAddress1()", result, notNullValue());
    assertThat("editAddress1()", result > 0);
  }
  @Test
  public void testgetAddress1() throws Exception {
    ModelAccountAddressService service = new ModelAccountAddressServiceImpl(dao);

    OcCountry bean = mock(OcCountry.class);
    //replace these null with real values from DB 
    Integer countryid = null;

    when(dao.getAddress1(countryid)).thenReturn(Arrays.asList(bean));

    List<OcCountry> result = service.getAddress1(countryid);

    assertThat("getAddress1()", result, notNullValue());
    assertThat("getAddress1()", result.size(), is(1));
  }
  @Test
  public void testaddAddress() throws Exception {
    ModelAccountAddressService service = new ModelAccountAddressServiceImpl(dao);

    Integer bean = mock(Integer.class);

    //replace these null with real values from DB 

    when(dao.addAddress()).thenReturn(bean);

    Integer result = service.addAddress();

    assertThat("addAddress()", result, notNullValue());
    assertThat("addAddress()", result > 0);
  }
  @Test
  public void testaddAddress1() throws Exception {
    ModelAccountAddressService service = new ModelAccountAddressServiceImpl(dao);

    Integer bean = mock(Integer.class);

    //replace these null with real values from DB 
    Integer customerid = null;

    when(dao.addAddress1(customerid)).thenReturn(bean);

    Integer result = service.addAddress1(customerid);

    assertThat("addAddress1()", result, notNullValue());
    assertThat("addAddress1()", result > 0);
  }
  @Test
  public void testgetAddresses2() throws Exception {
    ModelAccountAddressService service = new ModelAccountAddressServiceImpl(dao);

    OcZone bean = mock(OcZone.class);
    //replace these null with real values from DB 
    Integer zoneid = null;

    when(dao.getAddresses2(zoneid)).thenReturn(Arrays.asList(bean));

    List<OcZone> result = service.getAddresses2(zoneid);

    assertThat("getAddresses2()", result, notNullValue());
    assertThat("getAddresses2()", result.size(), is(1));
  }
  @Test
  public void testgetAddresses1() throws Exception {
    ModelAccountAddressService service = new ModelAccountAddressServiceImpl(dao);

    OcCountry bean = mock(OcCountry.class);
    //replace these null with real values from DB 
    Integer countryid = null;

    when(dao.getAddresses1(countryid)).thenReturn(Arrays.asList(bean));

    List<OcCountry> result = service.getAddresses1(countryid);

    assertThat("getAddresses1()", result, notNullValue());
    assertThat("getAddresses1()", result.size(), is(1));
  }
  @Test
  public void testdeleteAddress() throws Exception {
    ModelAccountAddressService service = new ModelAccountAddressServiceImpl(dao);

    Integer bean = mock(Integer.class);

    //replace these null with real values from DB 
    Integer addressid = null;
    Integer customerid = null;

    when(dao.deleteAddress(addressid, customerid)).thenReturn(bean);

    Integer result = service.deleteAddress(addressid, customerid);

    assertThat("deleteAddress()", result, notNullValue());
    assertThat("deleteAddress()", result > 0);
  }
  @Test
  public void testgetAddress() throws Exception {
    ModelAccountAddressService service = new ModelAccountAddressServiceImpl(dao);

    OcAddress bean = mock(OcAddress.class);
    //replace these null with real values from DB 
    Integer addressid = null;
    Integer customerid = null;

    when(dao.getAddress(addressid, customerid)).thenReturn(Arrays.asList(bean));

    List<OcAddress> result = service.getAddress(addressid, customerid);

    assertThat("getAddress()", result, notNullValue());
    assertThat("getAddress()", result.size(), is(1));
  }
  @Test
  public void testeditAddress() throws Exception {
    ModelAccountAddressService service = new ModelAccountAddressServiceImpl(dao);

    Integer bean = mock(Integer.class);

    //replace these null with real values from DB 
    Integer addressid = null;
    Integer customerid = null;

    when(dao.editAddress(addressid, customerid)).thenReturn(bean);

    Integer result = service.editAddress(addressid, customerid);

    assertThat("editAddress()", result, notNullValue());
    assertThat("editAddress()", result > 0);
  }
  @Test
  public void testgetTotalAddresses() throws Exception {
    ModelAccountAddressService service = new ModelAccountAddressServiceImpl(dao);

    GettotaladdressesDTO bean = mock(GettotaladdressesDTO.class);
    //replace these null with real values from DB 
    Integer customerid = null;

    when(dao.getTotalAddresses(customerid)).thenReturn(Arrays.asList(bean));

    List<GettotaladdressesDTO> result = service.getTotalAddresses(customerid);

    assertThat("getTotalAddresses()", result, notNullValue());
    assertThat("getTotalAddresses()", result.size(), is(1));
  }
}