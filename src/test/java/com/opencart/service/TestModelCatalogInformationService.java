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

import com.opencart.catalog.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

public class TestModelCatalogInformationService  {
  @Mock
  ModelCatalogInformationDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelCatalogInformationServiceImpl service;

  @Before
  public void before() {
    service = new ModelCatalogInformationServiceImpl(dao);
  }

  /* *
   * SELECT i.information_id, i.bottom, i.sort_order, i.status, id.information_id as information_id0, id.language_id, id.title, id.description, id.meta_title, id.meta_description, id.meta_keyword, i2s.information_id as information_id01, i2s.store_id FROM oc_information i LEFT JOIN oc_information_description id ON( i.information_id = id.information_id ) LEFT JOIN oc_information_to_store i2s ON( i.information_id = i2s.information_id ) WHERE i.information_id = 'param0' AND id.language_id = 'param1' AND i2s.store_id = 'param2' AND i.status = '1' 
   */
  @Test
  public void testgetInformation() throws Exception {

    List<ModelCatalogInformation0Dto> list = mock(List.class);

    Integer information_id = 3;
    Integer language_id = 1;
    Integer store_id = 0;

    when(dao.getInformation(information_id, language_id, store_id)).thenReturn(list);

    List<ModelCatalogInformation0Dto> result = dao.getInformation(information_id, language_id, store_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT i.information_id, i.bottom, i.sort_order, i.status, id.information_id as information_id0, id.language_id, id.title, id.description, id.meta_title, id.meta_description, id.meta_keyword, i2s.information_id as information_id01, i2s.store_id FROM oc_information i LEFT JOIN oc_information_description id ON( i.information_id = id.information_id ) LEFT JOIN oc_information_to_store i2s ON( i.information_id = i2s.information_id ) WHERE id.language_id = 'param0' AND i2s.store_id = 'param1' AND i.status = '1' ORDER BY i.sort_order , LCASE( id.title ) ASC 
   */
  @Test
  public void testgetInformations() throws Exception {

    List<ModelCatalogInformation0Dto> list = mock(List.class);

    Integer language_id = 1;
    Integer store_id = 0;

    when(dao.getInformations(language_id, store_id)).thenReturn(list);

    List<ModelCatalogInformation0Dto> result = dao.getInformations(language_id, store_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM oc_information_to_layout  a WHERE information_id = 'param0' AND store_id = 'param1'  
   */
  @Test
  public void testgetInformationLayoutId() throws Exception {

    List<OcInformationToLayout> list = mock(List.class);

    Integer information_id = null;
    Integer store_id = null;

    when(dao.getInformationLayoutId(information_id, store_id)).thenReturn(list);

    List<OcInformationToLayout> result = dao.getInformationLayoutId(information_id, store_id);

    assertThat("$methodName$()", result, notNullValue());
  }
}