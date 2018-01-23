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
import com.opencart.catalog.dao.model.account.ModelAccountCustomFieldDAO;
import com.opencart.catalog.model.*;

public class ModelAccountCustomFieldServiceTest {
  @Mock
  ModelAccountCustomFieldDAO dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  @Test
  public void testgetCustomFields2() throws Exception {
    ModelAccountCustomFieldService service = new ModelAccountCustomFieldServiceImpl(dao);

    OcCustomFieldValue bean = mock(OcCustomFieldValue.class);
    //replace these null with real values from DB 
    Integer customfieldid = null;
    Integer languageid = null;

    when(dao.getCustomFields2(customfieldid, languageid)).thenReturn(Arrays.asList(bean));

    List<OcCustomFieldValue> result = service.getCustomFields2(customfieldid, languageid);

    assertThat("getCustomFields2()", result, notNullValue());
    assertThat("getCustomFields2()", result.size(), is(1));
  }
  @Test
  public void testgetCustomField() throws Exception {
    ModelAccountCustomFieldService service = new ModelAccountCustomFieldServiceImpl(dao);

    OcCustomFieldDescription bean = mock(OcCustomFieldDescription.class);
    //replace these null with real values from DB 
    Integer customfieldid = null;
    Integer languageid = null;

    when(dao.getCustomField(customfieldid, languageid)).thenReturn(Arrays.asList(bean));

    List<OcCustomFieldDescription> result = service.getCustomField(customfieldid, languageid);

    assertThat("getCustomField()", result, notNullValue());
    assertThat("getCustomField()", result.size(), is(1));
  }
  @Test
  public void testgetCustomFields1() throws Exception {
    ModelAccountCustomFieldService service = new ModelAccountCustomFieldServiceImpl(dao);

    OcCustomFieldDescription bean = mock(OcCustomFieldDescription.class);
    //replace these null with real values from DB 
    Integer languageid = null;
    Integer customergroupid = null;

    when(dao.getCustomFields1(languageid, customergroupid)).thenReturn(Arrays.asList(bean));

    List<OcCustomFieldDescription> result = service.getCustomFields1(languageid, customergroupid);

    assertThat("getCustomFields1()", result, notNullValue());
    assertThat("getCustomFields1()", result.size(), is(1));
  }
  @Test
  public void testgetCustomFields() throws Exception {
    ModelAccountCustomFieldService service = new ModelAccountCustomFieldServiceImpl(dao);

    OcCustomFieldDescription bean = mock(OcCustomFieldDescription.class);
    //replace these null with real values from DB 
    Integer languageid = null;

    when(dao.getCustomFields(languageid)).thenReturn(Arrays.asList(bean));

    List<OcCustomFieldDescription> result = service.getCustomFields(languageid);

    assertThat("getCustomFields()", result, notNullValue());
    assertThat("getCustomFields()", result.size(), is(1));
  }
}