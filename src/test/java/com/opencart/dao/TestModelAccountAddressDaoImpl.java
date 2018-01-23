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


public class TestModelAccountAddressDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelAccountAddressDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelAccountAddressDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT a FROM oc_address  a WHERE address_id = 'param0' AND customer_id = 'param1'  
   */
  @Test
  public void testgetAddressQuery() throws Exception {

    Integer address_id = 1;
    Integer customer_id = 0;

    List<OcAddress> result = dao.getAddressQuery(address_id, customer_id);
    assertThat("getAddressQuery", result, notNullValue());
  }

  /* *
   * SELECT COUNT(*) AS total FROM oc_address WHERE customer_id = 'param0' 
   */
  @Test
  public void testgetTotalAddresses() throws Exception {
    Integer customer_id = 0;
    java.math.BigInteger result = dao.getTotalAddresses(customer_id);
    assertThat("getTotalAddresses", result, notNullValue());
  }

  /* *
   * SELECT a FROM "oc_zone"  a WHERE zone_id = 'param0'  
   */
  @Test
  public void testgetZoneQuery() throws Exception {

    Integer zone_id = 1;

    List<OcZone> result = dao.getZoneQuery(zone_id);
    assertThat("getZoneQuery", result, notNullValue());
  }

  /* *
   * SELECT a FROM "oc_zone"  a WHERE zone_id = 'param0'  
   */
  @Test
  public void testgetZoneQuery0() throws Exception {

    Integer zone_id = 1;

    List<OcZone> result = dao.getZoneQuery0(zone_id);
    assertThat("getZoneQuery0", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_address  a WHERE customer_id = 'param0'  
   */
  @Test
  public void testgetQuery() throws Exception {

    Integer customer_id = 0;

    List<OcAddress> result = dao.getQuery(customer_id);
    assertThat("getQuery", result, notNullValue());
  }

  /* *
   * SELECT a FROM "oc_country"  a WHERE country_id = 'param0'  
   */
  @Test
  public void testgetCountryQuery() throws Exception {

    Integer country_id = 1;

    List<OcCountry> result = dao.getCountryQuery(country_id);
    assertThat("getCountryQuery", result, notNullValue());
  }

  /* *
   * SELECT a FROM "oc_country"  a WHERE country_id = 'param0'  
   */
  @Test
  public void testgetCountryQuery1() throws Exception {

    Integer country_id = 1;

    List<OcCountry> result = dao.getCountryQuery1(country_id);
    assertThat("getCountryQuery1", result, notNullValue());
  }
}