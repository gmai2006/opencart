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

public class TestModelLocalisationCountryService  {
  @Mock
  ModelLocalisationCountryDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelLocalisationCountryServiceImpl service;

  @Before
  public void before() {
    service = new ModelLocalisationCountryServiceImpl(dao);
  }

  /* *
   * SELECT a FROM oc_country  a WHERE status = '1' ORDER BY name ASC 
   */
  @Test
  public void testgetCountries() throws Exception {

    List<OcCountry> list = mock(List.class);


    when(dao.getCountries()).thenReturn(list);

    List<OcCountry> result = dao.getCountries();

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM oc_country  a WHERE country_id = 'param0' AND status = '1'  
   */
  @Test
  public void testgetCountry() throws Exception {

    List<OcCountry> list = mock(List.class);

    Integer country_id = 1;

    when(dao.getCountry(country_id)).thenReturn(list);

    List<OcCountry> result = dao.getCountry(country_id);

    assertThat("$methodName$()", result, notNullValue());
  }
}