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
import com.opencart.catalog.dao.model.account.ModelAccountApiDAO;
import com.opencart.catalog.model.*;

public class ModelAccountApiServiceTest {
  @Mock
  ModelAccountApiDAO dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  @Test
  public void testgetApiIps() throws Exception {
    ModelAccountApiService service = new ModelAccountApiServiceImpl(dao);

    OcApiIp bean = mock(OcApiIp.class);
    //replace these null with real values from DB 
    Integer apiid = null;

    when(dao.getApiIps(apiid)).thenReturn(Arrays.asList(bean));

    List<OcApiIp> result = service.getApiIps(apiid);

    assertThat("getApiIps()", result, notNullValue());
    assertThat("getApiIps()", result.size(), is(1));
  }
  @Test
  public void testaddApiSession() throws Exception {
    ModelAccountApiService service = new ModelAccountApiServiceImpl(dao);

    Integer bean = mock(Integer.class);

    //replace these null with real values from DB 

    when(dao.addApiSession()).thenReturn(bean);

    Integer result = service.addApiSession();

    assertThat("addApiSession()", result, notNullValue());
    assertThat("addApiSession()", result > 0);
  }
  @Test
  public void testgetApiByKey() throws Exception {
    ModelAccountApiService service = new ModelAccountApiServiceImpl(dao);

    OcApi bean = mock(OcApi.class);
    //replace these null with real values from DB 
    String key = null;

    when(dao.getApiByKey(key)).thenReturn(Arrays.asList(bean));

    List<OcApi> result = service.getApiByKey(key);

    assertThat("getApiByKey()", result, notNullValue());
    assertThat("getApiByKey()", result.size(), is(1));
  }
}