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

import com.opencart.design.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;


public class TestModelDesignThemeDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelDesignThemeDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelDesignThemeDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT a FROM oc_theme  a WHERE store_id = 'param0' AND theme = 'param1' AND route = 'param2'  
   */
  @Test
  public void testgetTheme() throws Exception {

    Integer store_id = 0;
    String theme = "s";
    String route = "s";

    List<OcTheme> result = dao.getTheme(store_id, theme, route);
    assertThat("getTheme", result, notNullValue());
  }
}