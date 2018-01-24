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

public class TestModelAccountAddressService  {
  @Mock
  ModelAccountAddressDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelAccountAddressServiceImpl service;

  @Before
  public void before() {
    service = new ModelAccountAddressServiceImpl(dao);
  }

  /* *
   * SELECT a FROM oc_address  a WHERE address_id = 'param0' AND customer_id = 'param1'  
   */
  @Test
  public void testgetAddressQuery() throws Exception {

    List<OcAddress> list = mock(List.class);

    Integer address_id = 1;
    Integer customer_id = 0;

    when(dao.getAddressQuery(address_id, customer_id)).thenReturn(list);

    List<OcAddress> result = dao.getAddressQuery(address_id, customer_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT COUNT(*) AS total FROM oc_address WHERE customer_id = 'param0' 
   */
  @Test
  public void testgetTotalAddresses() throws Exception {
    java.math.BigInteger bean = mock(java.math.BigInteger.class);

    Integer customer_id = 0;

    when(dao.getTotalAddresses(customer_id)).thenReturn(bean);

    java.math.BigInteger result = dao.getTotalAddresses(customer_id);

    assertThat("getTotalAddresses", result, notNullValue());
  }
  /* *
   * SELECT a FROM "oc_zone"  a WHERE zone_id = 'param0'  
   */
  @Test
  public void testgetZoneQuery() throws Exception {

    List<OcZone> list = mock(List.class);

    Integer zone_id = 1;

    when(dao.getZoneQuery(zone_id)).thenReturn(list);

    List<OcZone> result = dao.getZoneQuery(zone_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM "oc_zone"  a WHERE zone_id = 'param0'  
   */
  @Test
  public void testgetZoneQuery0() throws Exception {

    List<OcZone> list = mock(List.class);

    Integer zone_id = 1;

    when(dao.getZoneQuery0(zone_id)).thenReturn(list);

    List<OcZone> result = dao.getZoneQuery0(zone_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM oc_address  a WHERE customer_id = 'param0'  
   */
  @Test
  public void testgetQuery() throws Exception {

    List<OcAddress> list = mock(List.class);

    Integer customer_id = 0;

    when(dao.getQuery(customer_id)).thenReturn(list);

    List<OcAddress> result = dao.getQuery(customer_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM "oc_country"  a WHERE country_id = 'param0'  
   */
  @Test
  public void testgetCountryQuery() throws Exception {

    List<OcCountry> list = mock(List.class);

    Integer country_id = 1;

    when(dao.getCountryQuery(country_id)).thenReturn(list);

    List<OcCountry> result = dao.getCountryQuery(country_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM "oc_country"  a WHERE country_id = 'param0'  
   */
  @Test
  public void testgetCountryQuery1() throws Exception {

    List<OcCountry> list = mock(List.class);

    Integer country_id = 1;

    when(dao.getCountryQuery1(country_id)).thenReturn(list);

    List<OcCountry> result = dao.getCountryQuery1(country_id);

    assertThat("$methodName$()", result, notNullValue());
  }
}