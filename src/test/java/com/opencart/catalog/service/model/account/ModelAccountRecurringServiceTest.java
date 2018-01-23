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
import com.opencart.catalog.dao.model.account.ModelAccountRecurringDAO;
import com.opencart.catalog.model.*;

public class ModelAccountRecurringServiceTest {
  @Mock
  ModelAccountRecurringDAO dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  @Test
  public void testaddOrderRecurringTransaction() throws Exception {
    ModelAccountRecurringService service = new ModelAccountRecurringServiceImpl(dao);

    Integer bean = mock(Integer.class);

    //replace these null with real values from DB 

    when(dao.addOrderRecurringTransaction()).thenReturn(bean);

    Integer result = service.addOrderRecurringTransaction();

    assertThat("addOrderRecurringTransaction()", result, notNullValue());
    assertThat("addOrderRecurringTransaction()", result > 0);
  }
  @Test
  public void testgetOrderRecurringTransactions() throws Exception {
    ModelAccountRecurringService service = new ModelAccountRecurringServiceImpl(dao);

    OcOrderRecurringTransaction bean = mock(OcOrderRecurringTransaction.class);
    //replace these null with real values from DB 
    Integer orderrecurringid = null;

    when(dao.getOrderRecurringTransactions(orderrecurringid)).thenReturn(Arrays.asList(bean));

    List<OcOrderRecurringTransaction> result = service.getOrderRecurringTransactions(orderrecurringid);

    assertThat("getOrderRecurringTransactions()", result, notNullValue());
    assertThat("getOrderRecurringTransactions()", result.size(), is(1));
  }
  @Test
  public void testgetOrderRecurrings() throws Exception {
    ModelAccountRecurringService service = new ModelAccountRecurringServiceImpl(dao);

    OcOrderRecurring bean = mock(OcOrderRecurring.class);
    //replace these null with real values from DB 
    Integer customerid = null;

    when(dao.getOrderRecurrings(customerid)).thenReturn(Arrays.asList(bean));

    List<OcOrderRecurring> result = service.getOrderRecurrings(customerid);

    assertThat("getOrderRecurrings()", result, notNullValue());
    assertThat("getOrderRecurrings()", result.size(), is(1));
  }
  @Test
  public void testgetOrderRecurringByReference() throws Exception {
    ModelAccountRecurringService service = new ModelAccountRecurringServiceImpl(dao);

    OcOrderRecurring bean = mock(OcOrderRecurring.class);
    //replace these null with real values from DB 
    String reference = null;

    when(dao.getOrderRecurringByReference(reference)).thenReturn(Arrays.asList(bean));

    List<OcOrderRecurring> result = service.getOrderRecurringByReference(reference);

    assertThat("getOrderRecurringByReference()", result, notNullValue());
    assertThat("getOrderRecurringByReference()", result.size(), is(1));
  }
  @Test
  public void testgetOrderRecurring() throws Exception {
    ModelAccountRecurringService service = new ModelAccountRecurringServiceImpl(dao);

    OcOrderRecurring bean = mock(OcOrderRecurring.class);
    //replace these null with real values from DB 
    Integer orderrecurringid = null;
    Integer customerid = null;

    when(dao.getOrderRecurring(orderrecurringid, customerid)).thenReturn(Arrays.asList(bean));

    List<OcOrderRecurring> result = service.getOrderRecurring(orderrecurringid, customerid);

    assertThat("getOrderRecurring()", result, notNullValue());
    assertThat("getOrderRecurring()", result.size(), is(1));
  }
  @Test
  public void testgetTotalOrderRecurrings() throws Exception {
    ModelAccountRecurringService service = new ModelAccountRecurringServiceImpl(dao);

    GettotalorderrecurringsDTO bean = mock(GettotalorderrecurringsDTO.class);
    //replace these null with real values from DB 
    Integer customerid = null;

    when(dao.getTotalOrderRecurrings(customerid)).thenReturn(Arrays.asList(bean));

    List<GettotalorderrecurringsDTO> result = service.getTotalOrderRecurrings(customerid);

    assertThat("getTotalOrderRecurrings()", result, notNullValue());
    assertThat("getTotalOrderRecurrings()", result.size(), is(1));
  }
  @Test
  public void testeditOrderRecurringStatus() throws Exception {
    ModelAccountRecurringService service = new ModelAccountRecurringServiceImpl(dao);

    Integer bean = mock(Integer.class);

    //replace these null with real values from DB 
    Integer orderrecurringid = null;

    when(dao.editOrderRecurringStatus(orderrecurringid)).thenReturn(bean);

    Integer result = service.editOrderRecurringStatus(orderrecurringid);

    assertThat("editOrderRecurringStatus()", result, notNullValue());
    assertThat("editOrderRecurringStatus()", result > 0);
  }
}