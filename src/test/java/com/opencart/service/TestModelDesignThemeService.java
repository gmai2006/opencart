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

public class TestModelDesignThemeService  {
  @Mock
  ModelDesignThemeDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelDesignThemeServiceImpl service;

  @Before
  public void before() {
    service = new ModelDesignThemeServiceImpl(dao);
  }

  /* *
   * SELECT a FROM oc_theme  a WHERE store_id = 'param0' AND theme = 'param1' AND route = 'param2'  
   */
  @Test
  public void testgetTheme() throws Exception {

    List<OcTheme> list = mock(List.class);

    Integer store_id = 0;
    String theme = "s";
    String route = "s";

    when(dao.getTheme(store_id, theme, route)).thenReturn(list);

    List<OcTheme> result = dao.getTheme(store_id, theme, route);

    assertThat("$methodName$()", result, notNullValue());
  }
}