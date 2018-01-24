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

import com.opencart.extension.openbay.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

public class TestModelExtensionOpenBayEtsyOrderService  {
  @Mock
  ModelExtensionOpenBayEtsyOrderDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelExtensionOpenBayEtsyOrderServiceImpl service;

  @Before
  public void before() {
    service = new ModelExtensionOpenBayEtsyOrderServiceImpl(dao);
  }

  /* *
   * SELECT a FROM "oc_country"  a WHERE "iso_code_2" = 'param0'  
   */
  @Test
  public void testcreate() throws Exception {

    List<OcCountry> list = mock(List.class);

    String iso_code_2 = "AF";

    when(dao.create(iso_code_2)).thenReturn(list);

    List<OcCountry> result = dao.create(iso_code_2);

    assertThat("$methodName$()", result, notNullValue());
  }
}