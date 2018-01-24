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

public class TestModelLocalisationLocationService  {
  @Mock
  ModelLocalisationLocationDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelLocalisationLocationServiceImpl service;

  @Before
  public void before() {
    service = new ModelLocalisationLocationServiceImpl(dao);
  }

  /* *
   * SELECT location_id, name, address, geocode, telephone, fax, image, open, comment FROM oc_location WHERE location_id = 'param0' 
   */
  @Test
  public void testgetLocation() throws Exception {

    List<ModelLocalisationLocation0Dto> list = mock(List.class);

    Integer location_id = 1;

    when(dao.getLocation(location_id)).thenReturn(list);

    List<ModelLocalisationLocation0Dto> result = dao.getLocation(location_id);

    assertThat("$methodName$()", result, notNullValue());
  }
}