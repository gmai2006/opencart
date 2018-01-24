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

public class TestModelSettingSettingService  {
  @Mock
  ModelSettingSettingDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelSettingSettingServiceImpl service;

  @Before
  public void before() {
    service = new ModelSettingSettingServiceImpl(dao);
  }

  /* *
   * SELECT a FROM oc_setting  a WHERE store_id = 'param0' AND "code" = 'param1'  
   */
  @Test
  public void testgetSetting() throws Exception {

    List<OcSetting> list = mock(List.class);

    Integer store_id = 0;
    String code = "config";

    when(dao.getSetting(store_id, code)).thenReturn(list);

    List<OcSetting> result = dao.getSetting(store_id, code);

    assertThat("$methodName$()", result, notNullValue());
  }
}