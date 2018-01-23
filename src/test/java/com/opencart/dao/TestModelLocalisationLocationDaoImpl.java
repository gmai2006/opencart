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

import com.opencart.localisation.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;


public class TestModelLocalisationLocationDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelLocalisationLocationDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelLocalisationLocationDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT location_id, name, address, geocode, telephone, fax, image, open, comment FROM oc_location WHERE location_id = 'param0' 
   */
  @Test
  public void testgetLocation() throws Exception {

    Integer location_id = 1;

    List<ModelLocalisationLocation0Dto> result = dao.getLocation(location_id);
    assertThat("getLocation", result, notNullValue());
  }
}