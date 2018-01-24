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

public class TestModelCatalogManufacturerService  {
  @Mock
  ModelCatalogManufacturerDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelCatalogManufacturerServiceImpl service;

  @Before
  public void before() {
    service = new ModelCatalogManufacturerServiceImpl(dao);
  }

  /* *
   * SELECT m.manufacturer_id, m.name, m.image, m.sort_order, m2s.manufacturer_id as manufacturer_id0, m2s.store_id FROM oc_manufacturer m LEFT JOIN oc_manufacturer_to_store m2s ON( m.manufacturer_id = m2s.manufacturer_id ) WHERE m.manufacturer_id = 'param0' AND m2s.store_id = 'param1' 
   */
  @Test
  public void testgetManufacturer() throws Exception {

    List<ModelCatalogManufacturer0Dto> list = mock(List.class);

    Integer manufacturer_id = 1;
    Integer store_id = 0;

    when(dao.getManufacturer(manufacturer_id, store_id)).thenReturn(list);

    List<ModelCatalogManufacturer0Dto> result = dao.getManufacturer(manufacturer_id, store_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT m.manufacturer_id, m.name, m.image, m.sort_order, m2s.manufacturer_id as manufacturer_id0, m2s.store_id FROM oc_manufacturer m LEFT JOIN oc_manufacturer_to_store m2s ON( m.manufacturer_id = m2s.manufacturer_id ) WHERE m2s.store_id = 'param0' ORDER BY name 
   */
  @Test
  public void testgetManufacturers() throws Exception {

    List<ModelCatalogManufacturer0Dto> list = mock(List.class);

    Integer store_id = 0;

    when(dao.getManufacturers(store_id)).thenReturn(list);

    List<ModelCatalogManufacturer0Dto> result = dao.getManufacturers(store_id);

    assertThat("$methodName$()", result, notNullValue());
  }
}