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

public class TestModelAccountCustomerGroupService  {
  @Mock
  ModelAccountCustomerGroupDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelAccountCustomerGroupServiceImpl service;

  @Before
  public void before() {
    service = new ModelAccountCustomerGroupServiceImpl(dao);
  }

  /* *
   * SELECT cg.customer_group_id, cg.approval, cg.sort_order, cgd.customer_group_id as customer_group_id0, cgd.language_id, cgd.name, cgd.description FROM oc_customer_group cg LEFT JOIN oc_customer_group_description cgd ON( cg.customer_group_id = cgd.customer_group_id ) WHERE cg.customer_group_id = 'param0' AND cgd.language_id = 'param1' 
   */
  @Test
  public void testgetCustomerGroup() throws Exception {

    List<ModelAccountCustomerGroup0Dto> list = mock(List.class);

    Integer customer_group_id = 1;
    Integer language_id = 1;

    when(dao.getCustomerGroup(customer_group_id, language_id)).thenReturn(list);

    List<ModelAccountCustomerGroup0Dto> result = dao.getCustomerGroup(customer_group_id, language_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT cg.customer_group_id, cg.approval, cg.sort_order, cgd.customer_group_id as customer_group_id0, cgd.language_id, cgd.name, cgd.description FROM oc_customer_group cg LEFT JOIN oc_customer_group_description cgd ON( cg.customer_group_id = cgd.customer_group_id ) WHERE cgd.language_id = 'param0' ORDER BY cg.sort_order ASC , cgd.name ASC 
   */
  @Test
  public void testgetCustomerGroups() throws Exception {

    List<ModelAccountCustomerGroup0Dto> list = mock(List.class);

    Integer language_id = 1;

    when(dao.getCustomerGroups(language_id)).thenReturn(list);

    List<ModelAccountCustomerGroup0Dto> result = dao.getCustomerGroups(language_id);

    assertThat("$methodName$()", result, notNullValue());
  }
}