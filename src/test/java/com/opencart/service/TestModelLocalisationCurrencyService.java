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

public class TestModelLocalisationCurrencyService  {
  @Mock
  ModelLocalisationCurrencyDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelLocalisationCurrencyServiceImpl service;

  @Before
  public void before() {
    service = new ModelLocalisationCurrencyServiceImpl(dao);
  }

  /* *
   * SELECT a FROM oc_currency a  ORDER BY title ASC 
   */
  @Test
  public void testgetCurrencies() throws Exception {

    List<OcCurrency> list = mock(List.class);


    when(dao.getCurrencies()).thenReturn(list);

    List<OcCurrency> result = dao.getCurrencies();

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM oc_currency  a WHERE code = 'param0'  
   */
  @Test
  public void testgetCurrencyByCode() throws Exception {

    List<OcCurrency> list = mock(List.class);

    String code = "GBP";

    when(dao.getCurrencyByCode(code)).thenReturn(list);

    List<OcCurrency> result = dao.getCurrencyByCode(code);

    assertThat("$methodName$()", result, notNullValue());
  }
}