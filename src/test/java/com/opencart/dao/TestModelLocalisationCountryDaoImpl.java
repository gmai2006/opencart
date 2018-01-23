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


public class TestModelLocalisationCountryDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelLocalisationCountryDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelLocalisationCountryDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT a FROM oc_country  a WHERE status = '1' ORDER BY name ASC 
   */
  @Test
  public void testgetCountries() throws Exception {


    List<OcCountry> result = dao.getCountries();
    assertThat("getCountries", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_country  a WHERE country_id = 'param0' AND status = '1'  
   */
  @Test
  public void testgetCountry() throws Exception {

    Integer country_id = 1;

    List<OcCountry> result = dao.getCountry(country_id);
    assertThat("getCountry", result, notNullValue());
  }
}