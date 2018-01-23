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

import com.opencart.extension.openbay.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;


public class TestModelExtensionOpenBayEbayOpenbayDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelExtensionOpenBayEbayOpenbayDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelExtensionOpenBayEbayOpenbayDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT a FROM "oc_country"  a WHERE "iso_code_2" = 'param0'  
   */
  @Test
  public void testupdateOrderWithConfirmedData() throws Exception {

    String iso_code_2 = "AF";

    List<OcCountry> result = dao.updateOrderWithConfirmedData(iso_code_2);
    assertThat("updateOrderWithConfirmedData", result, notNullValue());
  }
}