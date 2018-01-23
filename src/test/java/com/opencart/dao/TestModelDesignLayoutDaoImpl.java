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


public class TestModelDesignLayoutDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelDesignLayoutDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelDesignLayoutDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT a FROM oc_layout_route  a WHERE 'param0' LIKE route AND store_id = 'param1' ORDER BY route DESC LIMIT 1
   */
  @Test
  public void testgetLayout() throws Exception {

    Integer store_id = 0;

    List<OcLayoutRoute> result = dao.getLayout(store_id);
    assertThat("getLayout", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_layout_module  a WHERE layout_id = 'param0' AND position = 'param1' ORDER BY sort_order 
   */
  @Test
  public void testgetLayoutModules() throws Exception {

    Integer layout_id = 5;
    String position = "column_left";

    List<OcLayoutModule> result = dao.getLayoutModules(layout_id, position);
    assertThat("getLayoutModules", result, notNullValue());
  }
}