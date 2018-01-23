package com.opencart.catalog.service.model.account;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import com.opencart.model.*;
import com.opencart.catalog.dao.model.account.ModelAccountCustomerGroupDAO;
import com.opencart.catalog.model.*;

public class ModelAccountCustomerGroupServiceTest {
  @Mock
  ModelAccountCustomerGroupDAO dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  @Test
  public void testgetCustomerGroups() throws Exception {
    ModelAccountCustomerGroupService service = new ModelAccountCustomerGroupServiceImpl(dao);

    OcCustomerGroup bean = mock(OcCustomerGroup.class);
    //replace these null with real values from DB 
    Integer languageid = null;

    when(dao.getCustomerGroups(languageid)).thenReturn(Arrays.asList(bean));

    List<OcCustomerGroup> result = service.getCustomerGroups(languageid);

    assertThat("getCustomerGroups()", result, notNullValue());
    assertThat("getCustomerGroups()", result.size(), is(1));
  }
  @Test
  public void testgetCustomerGroup() throws Exception {
    ModelAccountCustomerGroupService service = new ModelAccountCustomerGroupServiceImpl(dao);

    OcCustomerGroup bean = mock(OcCustomerGroup.class);
    //replace these null with real values from DB 
    Integer customergroupid = null;
    Integer languageid = null;

    when(dao.getCustomerGroup(customergroupid, languageid)).thenReturn(Arrays.asList(bean));

    List<OcCustomerGroup> result = service.getCustomerGroup(customergroupid, languageid);

    assertThat("getCustomerGroup()", result, notNullValue());
    assertThat("getCustomerGroup()", result.size(), is(1));
  }
}