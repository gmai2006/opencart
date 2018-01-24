package com.opencart.service;


import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Every.everyItem;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.*;
import org.junit.Before;

import static org.mockito.Mockito.*;
import org.junit.Rule;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Module;
import com.opencart.GoogleGuiceTest;
import com.opencart.entity.*;
import com.opencart.util.JsonUtils;

import com.opencart.account.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

public class TestModelAccountCustomFieldService  {
  @Mock
  ModelAccountCustomFieldDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelAccountCustomFieldServiceImpl service;

  @Before
  public void before() {
    service = new ModelAccountCustomFieldServiceImpl(dao);
  }

  /* *
   * SELECT cfv.custom_field_value_id, cfv.custom_field_id, cfv.sort_order, cfvd.custom_field_value_id as custom_field_value_id0, cfvd.language_id, cfvd.custom_field_id as custom_field_id0, cfvd.name FROM oc_custom_field_value cfv LEFT JOIN oc_custom_field_value_description cfvd ON( cfv.custom_field_value_id = cfvd.custom_field_value_id ) WHERE cfv.custom_field_id = 'param0' AND cfvd.language_id = 'param1' ORDER BY cfv.sort_order ASC 
   */
  @Test
  public void testgetCustomFieldValueQuery() throws Exception {

    List<ModelAccountCustomField0Dto> list = mock(List.class);

    Integer custom_field_id = null;
    Integer language_id = null;

    when(dao.getCustomFieldValueQuery(custom_field_id, language_id)).thenReturn(list);

    List<ModelAccountCustomField0Dto> result = dao.getCustomFieldValueQuery(custom_field_id, language_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT cfcg.custom_field_id, cfcg.customer_group_id, cfcg.required, cf.custom_field_id as custom_field_id0, cf.type, cf.value, cf.validation, cf.location, cf.status, cf.sort_order, cfd.custom_field_id as custom_field_id01, cfd.language_id, cfd.name FROM "oc_custom_field_customer_group" cfcg LEFT JOIN "oc_custom_field" cf ON( cfcg.custom_field_id = cf.custom_field_id ) LEFT JOIN "oc_custom_field_description" cfd ON( cf.custom_field_id = cfd.custom_field_id ) WHERE cf.status = '1' AND cfd.language_id = 'param0' AND cfcg.customer_group_id = 'param1' ORDER BY cf.sort_order ASC 
   */
  @Test
  public void testgetCustomFieldQuery() throws Exception {

    List<ModelAccountCustomField1Dto> list = mock(List.class);

    Integer language_id = null;
    Integer customer_group_id = 0;

    when(dao.getCustomFieldQuery(language_id, customer_group_id)).thenReturn(list);

    List<ModelAccountCustomField1Dto> result = dao.getCustomFieldQuery(language_id, customer_group_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT cf.custom_field_id, cf.type, cf.value, cf.validation, cf.location, cf.status, cf.sort_order, cfd.custom_field_id as custom_field_id0, cfd.language_id, cfd.name FROM "oc_custom_field" cf LEFT JOIN "oc_custom_field_description" cfd ON( cf.custom_field_id = cfd.custom_field_id ) WHERE cf.status = '1' AND cf.custom_field_id = 'param0' AND cfd.language_id = 'param1' 
   */
  @Test
  public void testgetCustomField() throws Exception {

    List<ModelAccountCustomField2Dto> list = mock(List.class);

    Integer custom_field_id = null;
    Integer language_id = null;

    when(dao.getCustomField(custom_field_id, language_id)).thenReturn(list);

    List<ModelAccountCustomField2Dto> result = dao.getCustomField(custom_field_id, language_id);

    assertThat("$methodName$()", result, notNullValue());
  }
}