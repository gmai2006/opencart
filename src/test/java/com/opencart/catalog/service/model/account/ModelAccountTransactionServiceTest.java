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
import com.opencart.catalog.dao.model.account.ModelAccountTransactionDAO;
import com.opencart.catalog.model.*;

public class ModelAccountTransactionServiceTest {
  @Mock
  ModelAccountTransactionDAO dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  @Test
  public void testgetTotalAmount() throws Exception {
    ModelAccountTransactionService service = new ModelAccountTransactionServiceImpl(dao);

    GettotalamountDTO bean = mock(GettotalamountDTO.class);
    //replace these null with real values from DB 
    Integer customerid = null;

    when(dao.getTotalAmount(customerid)).thenReturn(Arrays.asList(bean));

    List<GettotalamountDTO> result = service.getTotalAmount(customerid);

    assertThat("getTotalAmount()", result, notNullValue());
    assertThat("getTotalAmount()", result.size(), is(1));
  }
  @Test
  public void testgetTotalTransactions() throws Exception {
    ModelAccountTransactionService service = new ModelAccountTransactionServiceImpl(dao);

    GettotaltransactionsDTO bean = mock(GettotaltransactionsDTO.class);
    //replace these null with real values from DB 
    Integer customerid = null;

    when(dao.getTotalTransactions(customerid)).thenReturn(Arrays.asList(bean));

    List<GettotaltransactionsDTO> result = service.getTotalTransactions(customerid);

    assertThat("getTotalTransactions()", result, notNullValue());
    assertThat("getTotalTransactions()", result.size(), is(1));
  }
}