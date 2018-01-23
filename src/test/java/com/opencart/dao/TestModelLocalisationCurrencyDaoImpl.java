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


public class TestModelLocalisationCurrencyDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelLocalisationCurrencyDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelLocalisationCurrencyDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT a FROM oc_currency a  ORDER BY title ASC 
   */
  @Test
  public void testgetCurrencies() throws Exception {


    List<OcCurrency> result = dao.getCurrencies();
    assertThat("getCurrencies", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_currency  a WHERE code = 'param0'  
   */
  @Test
  public void testgetCurrencyByCode() throws Exception {

    String code = "GBP";

    List<OcCurrency> result = dao.getCurrencyByCode(code);
    assertThat("getCurrencyByCode", result, notNullValue());
  }
}