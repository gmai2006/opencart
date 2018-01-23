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

import com.opencart.extension.shipping.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;


public class TestModelExtensionShippingFedexDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelExtensionShippingFedexDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelExtensionShippingFedexDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT a FROM oc_zone_to_geo_zone  a WHERE geo_zone_id = 'param0' AND country_id = 'param1' AND( zone_id = 'param2' OR zone_id = '0' )  
   */
  @Test
  public void testgetQuote() throws Exception {

    Integer geo_zone_id = 4;
    Integer country_id = 222;

    List<OcZoneToGeoZone> result = dao.getQuote(geo_zone_id, country_id);
    assertThat("getQuote", result, notNullValue());
  }
}