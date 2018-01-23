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


public class TestModelLocalisationZoneDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelLocalisationZoneDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelLocalisationZoneDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT a FROM oc_zone  a WHERE country_id = 'param0' AND status = '1' ORDER BY name 
   */
  @Test
  public void testgetZonesByCountryId() throws Exception {

    Integer country_id = 1;

    List<OcZone> result = dao.getZonesByCountryId(country_id);
    assertThat("getZonesByCountryId", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_zone  a WHERE zone_id = 'param0' AND status = '1'  
   */
  @Test
  public void testgetZone() throws Exception {

    Integer zone_id = 1;

    List<OcZone> result = dao.getZone(zone_id);
    assertThat("getZone", result, notNullValue());
  }
}