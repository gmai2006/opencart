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
import com.opencart.catalog.dao.model.account.ModelAccountSearchDAO;
import com.opencart.catalog.model.*;

public class ModelAccountSearchServiceTest {
  @Mock
  ModelAccountSearchDAO dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  @Test
  public void testaddSearch() throws Exception {
    ModelAccountSearchService service = new ModelAccountSearchServiceImpl(dao);

    Integer bean = mock(Integer.class);

    //replace these null with real values from DB 

    when(dao.addSearch()).thenReturn(bean);

    Integer result = service.addSearch();

    assertThat("addSearch()", result, notNullValue());
    assertThat("addSearch()", result > 0);
  }
}