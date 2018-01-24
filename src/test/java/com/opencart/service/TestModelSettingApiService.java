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

import com.opencart.setting.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

public class TestModelSettingApiService  {
  @Mock
  ModelSettingApiDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelSettingApiServiceImpl service;

  @Before
  public void before() {
    service = new ModelSettingApiServiceImpl(dao);
  }

  /* *
   * SELECT a FROM oc_api  a WHERE username = 'param0' AND password = 'param1'  
   */
  @Test
  public void testlogin() throws Exception {

    List<OcApi> list = mock(List.class);

    String username = null;
    String password = null;

    when(dao.login(username, password)).thenReturn(list);

    List<OcApi> result = dao.login(username, password);

    assertThat("$methodName$()", result, notNullValue());
  }
}