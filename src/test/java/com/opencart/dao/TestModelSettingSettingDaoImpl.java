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


public class TestModelSettingSettingDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelSettingSettingDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelSettingSettingDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT a FROM oc_setting  a WHERE store_id = 'param0' AND "code" = 'param1'  
   */
  @Test
  public void testgetSetting() throws Exception {

    Integer store_id = 0;
    String code = "config";

    List<OcSetting> result = dao.getSetting(store_id, code);
    assertThat("getSetting", result, notNullValue());
  }
}