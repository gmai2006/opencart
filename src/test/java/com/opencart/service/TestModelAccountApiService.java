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

public class TestModelAccountApiService  {
  @Mock
  ModelAccountApiDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelAccountApiServiceImpl service;

  @Before
  public void before() {
    service = new ModelAccountApiServiceImpl(dao);
  }

  /* *
   * SELECT a FROM "oc_api"  a WHERE "key" = 'param0' AND status = '1'  
   */
  @Test
  public void testgetApiByKey() throws Exception {

    List<OcApi> list = mock(List.class);

    String key = "92DXCJhKwuqKlUjW5aaQIJ5g1YXZUzf47C4E0uxl18GDdvvukeXRrSv8wCtsiLGSrwxRkvIjP5cY8D3gJVBFwP7KdVUyKCeleAaBfAVGVp0Va3W3SzwRU8ZHQ7hqUdaaN57FiOHlTntFmsYYqUmIh55wKM9JP9HCq8XiiNEzGNTizIEURRpcYG6Ui53GQHzjx7HnbJMkEFl0cyVBij55SJyrZoafkpTV832j4TuSPJV9Kydd9aRrGtoc9FsRVQay";

    when(dao.getApiByKey(key)).thenReturn(list);

    List<OcApi> result = dao.getApiByKey(key);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM "oc_api_ip"  a WHERE api_id = 'param0'  
   */
  @Test
  public void testgetApiIps() throws Exception {

    List<OcApiIp> list = mock(List.class);

    Integer api_id = 0;

    when(dao.getApiIps(api_id)).thenReturn(list);

    List<OcApiIp> result = dao.getApiIps(api_id);

    assertThat("$methodName$()", result, notNullValue());
  }
}