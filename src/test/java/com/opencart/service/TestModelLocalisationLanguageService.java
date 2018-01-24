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

public class TestModelLocalisationLanguageService  {
  @Mock
  ModelLocalisationLanguageDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelLocalisationLanguageServiceImpl service;

  @Before
  public void before() {
    service = new ModelLocalisationLanguageServiceImpl(dao);
  }

  /* *
   * SELECT a FROM oc_language  a WHERE language_id = 'param0'  
   */
  @Test
  public void testgetLanguage() throws Exception {

    List<OcLanguage> list = mock(List.class);

    Integer language_id = 1;

    when(dao.getLanguage(language_id)).thenReturn(list);

    List<OcLanguage> result = dao.getLanguage(language_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM oc_language  a WHERE status = '1' ORDER BY sort_order , name 
   */
  @Test
  public void testgetLanguages() throws Exception {

    List<OcLanguage> list = mock(List.class);


    when(dao.getLanguages()).thenReturn(list);

    List<OcLanguage> result = dao.getLanguages();

    assertThat("$methodName$()", result, notNullValue());
  }
}