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

import com.opencart.checkout.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

public class TestModelCheckoutMarketingService  {
  @Mock
  ModelCheckoutMarketingDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelCheckoutMarketingServiceImpl service;

  @Before
  public void before() {
    service = new ModelCheckoutMarketingServiceImpl(dao);
  }

  /* *
   * SELECT a FROM oc_marketing  a WHERE code = 'param0'  
   */
  @Test
  public void testgetMarketingByCode() throws Exception {

    List<OcMarketing> list = mock(List.class);

    String code = "s";

    when(dao.getMarketingByCode(code)).thenReturn(list);

    List<OcMarketing> result = dao.getMarketingByCode(code);

    assertThat("$methodName$()", result, notNullValue());
  }
}