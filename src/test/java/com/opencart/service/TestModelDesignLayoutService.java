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

import com.opencart.design.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

public class TestModelDesignLayoutService  {
  @Mock
  ModelDesignLayoutDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelDesignLayoutServiceImpl service;

  @Before
  public void before() {
    service = new ModelDesignLayoutServiceImpl(dao);
  }

  /* *
   * SELECT a FROM oc_layout_route  a WHERE 'param0' LIKE route AND store_id = 'param1' ORDER BY route DESC LIMIT 1
   */
  @Test
  public void testgetLayout() throws Exception {

    List<OcLayoutRoute> list = mock(List.class);

    Integer store_id = 0;

    when(dao.getLayout(store_id)).thenReturn(list);

    List<OcLayoutRoute> result = dao.getLayout(store_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM oc_layout_module  a WHERE layout_id = 'param0' AND position = 'param1' ORDER BY sort_order 
   */
  @Test
  public void testgetLayoutModules() throws Exception {

    List<OcLayoutModule> list = mock(List.class);

    Integer layout_id = 5;
    String position = "column_left";

    when(dao.getLayoutModules(layout_id, position)).thenReturn(list);

    List<OcLayoutModule> result = dao.getLayoutModules(layout_id, position);

    assertThat("$methodName$()", result, notNullValue());
  }
}