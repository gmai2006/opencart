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

public class TestModelExtensionPaymentPayzaService  {
  @Mock
  ModelExtensionPaymentPayzaDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelExtensionPaymentPayzaServiceImpl service;

  @Before
  public void before() {
    service = new ModelExtensionPaymentPayzaServiceImpl(dao);
  }

  /* *
   * SELECT a FROM oc_zone_to_geo_zone  a WHERE geo_zone_id = 'param0' AND country_id = 'param1' AND( zone_id = 'param2' OR zone_id = '0' )  
   */
  @Test
  public void testgetMethod() throws Exception {

    List<OcZoneToGeoZone> list = mock(List.class);

    Integer geo_zone_id = 4;
    Integer country_id = 222;

    when(dao.getMethod(geo_zone_id, country_id)).thenReturn(list);

    List<OcZoneToGeoZone> result = dao.getMethod(geo_zone_id, country_id);

    assertThat("$methodName$()", result, notNullValue());
  }
}