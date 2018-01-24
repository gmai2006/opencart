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

public class TestModelSettingStoreService  {
  @Mock
  ModelSettingStoreDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelSettingStoreServiceImpl service;

  @Before
  public void before() {
    service = new ModelSettingStoreServiceImpl(dao);
  }

  /* *
   * SELECT a FROM oc_store a  ORDER BY url 
   */
  @Test
  public void testgetStores() throws Exception {

    List<OcStore> list = mock(List.class);


    when(dao.getStores()).thenReturn(list);

    List<OcStore> result = dao.getStores();

    assertThat("$methodName$()", result, notNullValue());
  }
}