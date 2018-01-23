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

import com.opencart.extension.payment.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;


public class TestModelExtensionPaymentKlarnaCheckoutDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelExtensionPaymentKlarnaCheckoutDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelExtensionPaymentKlarnaCheckoutDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT a FROM oc_country  a WHERE "iso_code_2" = 'param0' AND "status" = '1'  
   */
  @Test
  public void testgetCountryByIsoCode2() throws Exception {

    String iso_code_2 = "AF";

    List<OcCountry> result = dao.getCountryByIsoCode2(iso_code_2);
    assertThat("getCountryByIsoCode2", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_zone  a WHERE "code" = 'param0' AND "country_id" = 'param1' AND "status" = '1'  
   */
  @Test
  public void testgetZoneByCode() throws Exception {

    String code = "BDS";
    Integer country_id = 1;

    List<OcZone> result = dao.getZoneByCode(code, country_id);
    assertThat("getZoneByCode", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_country  a WHERE "iso_code_3" = 'param0' AND "status" = '1'  
   */
  @Test
  public void testgetCountryByIsoCode3() throws Exception {

    String iso_code_3 = "AFG";

    List<OcCountry> result = dao.getCountryByIsoCode3(iso_code_3);
    assertThat("getCountryByIsoCode3", result, notNullValue());
  }
}