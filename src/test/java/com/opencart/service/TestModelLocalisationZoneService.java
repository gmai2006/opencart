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

import com.opencart.localisation.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

public class TestModelLocalisationZoneService  {
  @Mock
  ModelLocalisationZoneDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelLocalisationZoneServiceImpl service;

  @Before
  public void before() {
    service = new ModelLocalisationZoneServiceImpl(dao);
  }

  /* *
   * SELECT a FROM oc_zone  a WHERE country_id = 'param0' AND status = '1' ORDER BY name 
   */
  @Test
  public void testgetZonesByCountryId() throws Exception {

    List<OcZone> list = mock(List.class);

    Integer country_id = 1;

    when(dao.getZonesByCountryId(country_id)).thenReturn(list);

    List<OcZone> result = dao.getZonesByCountryId(country_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM oc_zone  a WHERE zone_id = 'param0' AND status = '1'  
   */
  @Test
  public void testgetZone() throws Exception {

    List<OcZone> list = mock(List.class);

    Integer zone_id = 1;

    when(dao.getZone(zone_id)).thenReturn(list);

    List<OcZone> result = dao.getZone(zone_id);

    assertThat("$methodName$()", result, notNullValue());
  }
}