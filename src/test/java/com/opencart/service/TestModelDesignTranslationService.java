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

public class TestModelDesignTranslationService  {
  @Mock
  ModelDesignTranslationDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelDesignTranslationServiceImpl service;

  @Before
  public void before() {
    service = new ModelDesignTranslationServiceImpl(dao);
  }

  /* *
   * SELECT a FROM oc_translation  a WHERE store_id = 'param0' AND language_id = 'param1' AND route = 'param2'  
   */
  @Test
  public void testgetTranslations() throws Exception {

    List<OcTranslation> list = mock(List.class);

    Integer store_id = null;
    Integer language_id = null;
    String route = null;

    when(dao.getTranslations(store_id, language_id, route)).thenReturn(list);

    List<OcTranslation> result = dao.getTranslations(store_id, language_id, route);

    assertThat("$methodName$()", result, notNullValue());
  }
}