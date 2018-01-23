package com.opencart.dao;


import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Every.everyItem;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.*;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Module;
import com.opencart.GoogleGuiceTest;
import com.opencart.entity.*;
import com.opencart.util.JsonUtils;

import com.opencart.extension.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;


public class TestModelExtensionEventDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelExtensionEventDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelExtensionEventDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT a FROM "oc_event"  a WHERE "trigger" LIKE 'catalog/%' AND status = '1' ORDER BY "event_id" ASC 
   */
  @Test
  public void testgetEvents() throws Exception {


    List<OcEvent> result = dao.getEvents();
    assertThat("getEvents", result, notNullValue());
  }
}