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

import com.opencart.extension.payment.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

public class TestModelExtensionPaymentKlarnaCheckoutService  {
  @Mock
  ModelExtensionPaymentKlarnaCheckoutDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelExtensionPaymentKlarnaCheckoutServiceImpl service;

  @Before
  public void before() {
    service = new ModelExtensionPaymentKlarnaCheckoutServiceImpl(dao);
  }

  /* *
   * SELECT a FROM oc_country  a WHERE "iso_code_2" = 'param0' AND "status" = '1'  
   */
  @Test
  public void testgetCountryByIsoCode2() throws Exception {

    List<OcCountry> list = mock(List.class);

    String iso_code_2 = "AF";

    when(dao.getCountryByIsoCode2(iso_code_2)).thenReturn(list);

    List<OcCountry> result = dao.getCountryByIsoCode2(iso_code_2);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM oc_zone  a WHERE "code" = 'param0' AND "country_id" = 'param1' AND "status" = '1'  
   */
  @Test
  public void testgetZoneByCode() throws Exception {

    List<OcZone> list = mock(List.class);

    String code = "BDS";
    Integer country_id = 1;

    when(dao.getZoneByCode(code, country_id)).thenReturn(list);

    List<OcZone> result = dao.getZoneByCode(code, country_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM oc_country  a WHERE "iso_code_3" = 'param0' AND "status" = '1'  
   */
  @Test
  public void testgetCountryByIsoCode3() throws Exception {

    List<OcCountry> list = mock(List.class);

    String iso_code_3 = "AFG";

    when(dao.getCountryByIsoCode3(iso_code_3)).thenReturn(list);

    List<OcCountry> result = dao.getCountryByIsoCode3(iso_code_3);

    assertThat("$methodName$()", result, notNullValue());
  }
}