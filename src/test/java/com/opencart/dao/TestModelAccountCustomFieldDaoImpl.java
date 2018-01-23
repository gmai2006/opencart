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

import com.opencart.account.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;


public class TestModelAccountCustomFieldDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelAccountCustomFieldDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelAccountCustomFieldDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT cfv.custom_field_value_id, cfv.custom_field_id, cfv.sort_order, cfvd.custom_field_value_id as custom_field_value_id0, cfvd.language_id, cfvd.custom_field_id as custom_field_id0, cfvd.name FROM oc_custom_field_value cfv LEFT JOIN oc_custom_field_value_description cfvd ON( cfv.custom_field_value_id = cfvd.custom_field_value_id ) WHERE cfv.custom_field_id = 'param0' AND cfvd.language_id = 'param1' ORDER BY cfv.sort_order ASC 
   */
  @Test
  public void testgetCustomFieldValueQuery() throws Exception {

    Integer custom_field_id = null;
    Integer language_id = null;

    List<ModelAccountCustomField0Dto> result = dao.getCustomFieldValueQuery(custom_field_id, language_id);
    assertThat("getCustomFieldValueQuery", result, notNullValue());
  }

  /* *
   * SELECT cfcg.custom_field_id, cfcg.customer_group_id, cfcg.required, cf.custom_field_id as custom_field_id0, cf.type, cf.value, cf.validation, cf.location, cf.status, cf.sort_order, cfd.custom_field_id as custom_field_id01, cfd.language_id, cfd.name FROM "oc_custom_field_customer_group" cfcg LEFT JOIN "oc_custom_field" cf ON( cfcg.custom_field_id = cf.custom_field_id ) LEFT JOIN "oc_custom_field_description" cfd ON( cf.custom_field_id = cfd.custom_field_id ) WHERE cf.status = '1' AND cfd.language_id = 'param0' AND cfcg.customer_group_id = 'param1' ORDER BY cf.sort_order ASC 
   */
  @Test
  public void testgetCustomFieldQuery() throws Exception {

    Integer language_id = null;
    Integer customer_group_id = 0;

    List<ModelAccountCustomField1Dto> result = dao.getCustomFieldQuery(language_id, customer_group_id);
    assertThat("getCustomFieldQuery", result, notNullValue());
  }

  /* *
   * SELECT cf.custom_field_id, cf.type, cf.value, cf.validation, cf.location, cf.status, cf.sort_order, cfd.custom_field_id as custom_field_id0, cfd.language_id, cfd.name FROM "oc_custom_field" cf LEFT JOIN "oc_custom_field_description" cfd ON( cf.custom_field_id = cfd.custom_field_id ) WHERE cf.status = '1' AND cf.custom_field_id = 'param0' AND cfd.language_id = 'param1' 
   */
  @Test
  public void testgetCustomField() throws Exception {

    Integer custom_field_id = null;
    Integer language_id = null;

    List<ModelAccountCustomField2Dto> result = dao.getCustomField(custom_field_id, language_id);
    assertThat("getCustomField", result, notNullValue());
  }
}