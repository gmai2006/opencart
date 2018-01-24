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

import com.opencart.extension.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

public class TestModelExtensionEventService  {
  @Mock
  ModelExtensionEventDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelExtensionEventServiceImpl service;

  @Before
  public void before() {
    service = new ModelExtensionEventServiceImpl(dao);
  }

  /* *
   * SELECT a FROM "oc_event"  a WHERE "trigger" LIKE 'catalog/%' AND status = '1' ORDER BY "event_id" ASC 
   */
  @Test
  public void testgetEvents() throws Exception {

    List<OcEvent> list = mock(List.class);


    when(dao.getEvents()).thenReturn(list);

    List<OcEvent> result = dao.getEvents();

    assertThat("$methodName$()", result, notNullValue());
  }
}