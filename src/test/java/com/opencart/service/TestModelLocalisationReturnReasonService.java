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

public class TestModelLocalisationReturnReasonService  {
  @Mock
  ModelLocalisationReturnReasonDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelLocalisationReturnReasonServiceImpl service;

  @Before
  public void before() {
    service = new ModelLocalisationReturnReasonServiceImpl(dao);
  }

  /* *
   * SELECT return_reason_id, name FROM oc_return_reason WHERE language_id = 'param0' ORDER BY name 
   */
  @Test
  public void testgetReturnReasons() throws Exception {

    List<ModelLocalisationReturnReason0Dto> list = mock(List.class);

    Integer language_id = 1;

    when(dao.getReturnReasons(language_id)).thenReturn(list);

    List<ModelLocalisationReturnReason0Dto> result = dao.getReturnReasons(language_id);

    assertThat("$methodName$()", result, notNullValue());
  }
}