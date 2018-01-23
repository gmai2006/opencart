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
import com.opencart.catalog.dao.model.account.ModelAccountReturnDAO;
import com.opencart.catalog.model.*;

public class ModelAccountReturnServiceTest {
  @Mock
  ModelAccountReturnDAO dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  @Test
  public void testgetReturn() throws Exception {
    ModelAccountReturnService service = new ModelAccountReturnServiceImpl(dao);

    OcReturnReason bean = mock(OcReturnReason.class);
    //replace these null with real values from DB 
    Integer languageid = null;
    Integer languageid1 = null;
    Integer languageid2 = null;
    Integer returnid = null;
    Integer customerid = null;

    when(dao.getReturn(languageid, languageid1, languageid2, returnid, customerid)).thenReturn(Arrays.asList(bean));

    List<OcReturnReason> result = service.getReturn(languageid, languageid1, languageid2, returnid, customerid);

    assertThat("getReturn()", result, notNullValue());
    assertThat("getReturn()", result.size(), is(1));
  }
  @Test
  public void testgetReturnHistories() throws Exception {
    ModelAccountReturnService service = new ModelAccountReturnServiceImpl(dao);

    OcReturnStatus bean = mock(OcReturnStatus.class);
    //replace these null with real values from DB 
    Integer returnid = null;
    Integer languageid = null;

    when(dao.getReturnHistories(returnid, languageid)).thenReturn(Arrays.asList(bean));

    List<OcReturnStatus> result = service.getReturnHistories(returnid, languageid);

    assertThat("getReturnHistories()", result, notNullValue());
    assertThat("getReturnHistories()", result.size(), is(1));
  }
  @Test
  public void testgetTotalReturns() throws Exception {
    ModelAccountReturnService service = new ModelAccountReturnServiceImpl(dao);

    GettotalreturnsDTO bean = mock(GettotalreturnsDTO.class);
    //replace these null with real values from DB 
    Integer customerid = null;

    when(dao.getTotalReturns(customerid)).thenReturn(Arrays.asList(bean));

    List<GettotalreturnsDTO> result = service.getTotalReturns(customerid);

    assertThat("getTotalReturns()", result, notNullValue());
    assertThat("getTotalReturns()", result.size(), is(1));
  }
  @Test
  public void testaddReturn() throws Exception {
    ModelAccountReturnService service = new ModelAccountReturnServiceImpl(dao);

    Integer bean = mock(Integer.class);

    //replace these null with real values from DB 

    when(dao.addReturn()).thenReturn(bean);

    Integer result = service.addReturn();

    assertThat("addReturn()", result, notNullValue());
    assertThat("addReturn()", result > 0);
  }
  @Test
  public void testgetReturns() throws Exception {
    ModelAccountReturnService service = new ModelAccountReturnServiceImpl(dao);

    OcReturnStatus bean = mock(OcReturnStatus.class);
    //replace these null with real values from DB 
    Integer customerid = null;
    Integer languageid = null;

    when(dao.getReturns(customerid, languageid)).thenReturn(Arrays.asList(bean));

    List<OcReturnStatus> result = service.getReturns(customerid, languageid);

    assertThat("getReturns()", result, notNullValue());
    assertThat("getReturns()", result.size(), is(1));
  }
}