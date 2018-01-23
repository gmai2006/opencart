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


public class TestModelLocalisationReturnReasonDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelLocalisationReturnReasonDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelLocalisationReturnReasonDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT return_reason_id, name FROM oc_return_reason WHERE language_id = 'param0' ORDER BY name 
   */
  @Test
  public void testgetReturnReasons() throws Exception {

    Integer language_id = 1;

    List<ModelLocalisationReturnReason0Dto> result = dao.getReturnReasons(language_id);
    assertThat("getReturnReasons", result, notNullValue());
  }
}