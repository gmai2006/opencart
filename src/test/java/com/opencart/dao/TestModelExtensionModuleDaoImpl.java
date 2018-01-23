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


public class TestModelExtensionModuleDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelExtensionModuleDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelExtensionModuleDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT a FROM oc_module  a WHERE module_id = 'param0'  
   */
  @Test
  public void testgetModule() throws Exception {

    Integer module_id = 27;

    List<OcModule> result = dao.getModule(module_id);
    assertThat("getModule", result, notNullValue());
  }
}