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


public class TestModelLocalisationLanguageDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelLocalisationLanguageDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelLocalisationLanguageDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT a FROM oc_language  a WHERE language_id = 'param0'  
   */
  @Test
  public void testgetLanguage() throws Exception {

    Integer language_id = 1;

    List<OcLanguage> result = dao.getLanguage(language_id);
    assertThat("getLanguage", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_language  a WHERE status = '1' ORDER BY sort_order , name 
   */
  @Test
  public void testgetLanguages() throws Exception {


    List<OcLanguage> result = dao.getLanguages();
    assertThat("getLanguages", result, notNullValue());
  }
}