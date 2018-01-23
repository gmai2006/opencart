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

import com.opencart.setting.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;


public class TestModelSettingApiDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelSettingApiDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelSettingApiDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT a FROM oc_api  a WHERE username = 'param0' AND password = 'param1'  
   */
  @Test
  public void testlogin() throws Exception {

    String username = null;
    String password = null;

    List<OcApi> result = dao.login(username, password);
    assertThat("login", result, notNullValue());
  }
}