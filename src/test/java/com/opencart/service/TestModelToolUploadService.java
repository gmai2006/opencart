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

import com.opencart.tool.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

public class TestModelToolUploadService  {
  @Mock
  ModelToolUploadDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelToolUploadServiceImpl service;

  @Before
  public void before() {
    service = new ModelToolUploadServiceImpl(dao);
  }

  /* *
   * SELECT a FROM "oc_upload"  a WHERE code = 'param0'  
   */
  @Test
  public void testgetUploadByCode() throws Exception {

    List<OcUpload> list = mock(List.class);

    String code = "s";

    when(dao.getUploadByCode(code)).thenReturn(list);

    List<OcUpload> result = dao.getUploadByCode(code);

    assertThat("$methodName$()", result, notNullValue());
  }
}