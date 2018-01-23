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
import com.opencart.catalog.dao.model.account.ModelAccountCustomerDAO;
import com.opencart.catalog.model.*;

public class ModelAccountCustomerServiceTest {
  @Mock
  ModelAccountCustomerDAO dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  @Test
  public void testeditCustomer() throws Exception {
    ModelAccountCustomerService service = new ModelAccountCustomerServiceImpl(dao);

    Integer bean = mock(Integer.class);

    //replace these null with real values from DB 
    Integer customerid = null;

    when(dao.editCustomer(customerid)).thenReturn(bean);

    Integer result = service.editCustomer(customerid);

    assertThat("editCustomer()", result, notNullValue());
    assertThat("editCustomer()", result > 0);
  }
  @Test
  public void testeditCode() throws Exception {
    ModelAccountCustomerService service = new ModelAccountCustomerServiceImpl(dao);

    Integer bean = mock(Integer.class);

    //replace these null with real values from DB 
    String email = null;

    when(dao.editCode(email)).thenReturn(bean);

    Integer result = service.editCode(email);

    assertThat("editCode()", result, notNullValue());
    assertThat("editCode()", result > 0);
  }
  @Test
  public void testaddLoginAttempt1() throws Exception {
    ModelAccountCustomerService service = new ModelAccountCustomerServiceImpl(dao);

    Integer bean = mock(Integer.class);

    //replace these null with real values from DB 

    when(dao.addLoginAttempt1()).thenReturn(bean);

    Integer result = service.addLoginAttempt1();

    assertThat("addLoginAttempt1()", result, notNullValue());
    assertThat("addLoginAttempt1()", result > 0);
  }
  @Test
  public void testaddCustomer1() throws Exception {
    ModelAccountCustomerService service = new ModelAccountCustomerServiceImpl(dao);

    Integer bean = mock(Integer.class);

    //replace these null with real values from DB 

    when(dao.addCustomer1()).thenReturn(bean);

    Integer result = service.addCustomer1();

    assertThat("addCustomer1()", result, notNullValue());
    assertThat("addCustomer1()", result > 0);
  }
  @Test
  public void testaddLoginAttempt2() throws Exception {
    ModelAccountCustomerService service = new ModelAccountCustomerServiceImpl(dao);

    Integer bean = mock(Integer.class);

    //replace these null with real values from DB 
    Integer customerloginid = null;

    when(dao.addLoginAttempt2(customerloginid)).thenReturn(bean);

    Integer result = service.addLoginAttempt2(customerloginid);

    assertThat("addLoginAttempt2()", result, notNullValue());
    assertThat("addLoginAttempt2()", result > 0);
  }
  @Test
  public void testaddCustomer2() throws Exception {
    ModelAccountCustomerService service = new ModelAccountCustomerServiceImpl(dao);

    Integer bean = mock(Integer.class);

    //replace these null with real values from DB 
    Integer customerid = null;

    when(dao.addCustomer2(customerid)).thenReturn(bean);

    Integer result = service.addCustomer2(customerid);

    assertThat("addCustomer2()", result, notNullValue());
    assertThat("addCustomer2()", result > 0);
  }
  @Test
  public void testgetTotalCustomersByEmail() throws Exception {
    ModelAccountCustomerService service = new ModelAccountCustomerServiceImpl(dao);

    GettotalcustomersbyemailDTO bean = mock(GettotalcustomersbyemailDTO.class);
    //replace these null with real values from DB 
    String email = null;

    when(dao.getTotalCustomersByEmail(email)).thenReturn(Arrays.asList(bean));

    List<GettotalcustomersbyemailDTO> result = service.getTotalCustomersByEmail(email);

    assertThat("getTotalCustomersByEmail()", result, notNullValue());
    assertThat("getTotalCustomersByEmail()", result.size(), is(1));
  }
  @Test
  public void testgetCustomerByToken1() throws Exception {
    ModelAccountCustomerService service = new ModelAccountCustomerServiceImpl(dao);

    Integer bean = mock(Integer.class);

    //replace these null with real values from DB 

    when(dao.getCustomerByToken1()).thenReturn(bean);

    Integer result = service.getCustomerByToken1();

    assertThat("getCustomerByToken1()", result, notNullValue());
    assertThat("getCustomerByToken1()", result > 0);
  }
  @Test
  public void testgetCustomerByEmail() throws Exception {
    ModelAccountCustomerService service = new ModelAccountCustomerServiceImpl(dao);

    OcCustomer bean = mock(OcCustomer.class);
    //replace these null with real values from DB 
    String email = null;

    when(dao.getCustomerByEmail(email)).thenReturn(Arrays.asList(bean));

    List<OcCustomer> result = service.getCustomerByEmail(email);

    assertThat("getCustomerByEmail()", result, notNullValue());
    assertThat("getCustomerByEmail()", result.size(), is(1));
  }
  @Test
  public void testdeleteLoginAttempts() throws Exception {
    ModelAccountCustomerService service = new ModelAccountCustomerServiceImpl(dao);

    Integer bean = mock(Integer.class);

    //replace these null with real values from DB 
    String email = null;

    when(dao.deleteLoginAttempts(email)).thenReturn(bean);

    Integer result = service.deleteLoginAttempts(email);

    assertThat("deleteLoginAttempts()", result, notNullValue());
    assertThat("deleteLoginAttempts()", result > 0);
  }
  @Test
  public void testgetCustomer() throws Exception {
    ModelAccountCustomerService service = new ModelAccountCustomerServiceImpl(dao);

    OcCustomer bean = mock(OcCustomer.class);
    //replace these null with real values from DB 
    Integer customerid = null;

    when(dao.getCustomer(customerid)).thenReturn(Arrays.asList(bean));

    List<OcCustomer> result = service.getCustomer(customerid);

    assertThat("getCustomer()", result, notNullValue());
    assertThat("getCustomer()", result.size(), is(1));
  }
  @Test
  public void testaddCustomer() throws Exception {
    ModelAccountCustomerService service = new ModelAccountCustomerServiceImpl(dao);

    Integer bean = mock(Integer.class);

    //replace these null with real values from DB 

    when(dao.addCustomer()).thenReturn(bean);

    Integer result = service.addCustomer();

    assertThat("addCustomer()", result, notNullValue());
    assertThat("addCustomer()", result > 0);
  }
  @Test
  public void testeditPassword() throws Exception {
    ModelAccountCustomerService service = new ModelAccountCustomerServiceImpl(dao);

    Integer bean = mock(Integer.class);

    //replace these null with real values from DB 
    String email = null;

    when(dao.editPassword(email)).thenReturn(bean);

    Integer result = service.editPassword(email);

    assertThat("editPassword()", result, notNullValue());
    assertThat("editPassword()", result > 0);
  }
  @Test
  public void testgetLoginAttempts() throws Exception {
    ModelAccountCustomerService service = new ModelAccountCustomerServiceImpl(dao);

    OcCustomerLogin bean = mock(OcCustomerLogin.class);
    //replace these null with real values from DB 
    String email = null;

    when(dao.getLoginAttempts(email)).thenReturn(Arrays.asList(bean));

    List<OcCustomerLogin> result = service.getLoginAttempts(email);

    assertThat("getLoginAttempts()", result, notNullValue());
    assertThat("getLoginAttempts()", result.size(), is(1));
  }
  @Test
  public void testeditNewsletter() throws Exception {
    ModelAccountCustomerService service = new ModelAccountCustomerServiceImpl(dao);

    Integer bean = mock(Integer.class);

    //replace these null with real values from DB 
    Integer customerid = null;

    when(dao.editNewsletter(customerid)).thenReturn(bean);

    Integer result = service.editNewsletter(customerid);

    assertThat("editNewsletter()", result, notNullValue());
    assertThat("editNewsletter()", result > 0);
  }
  @Test
  public void testgetCustomerByCode() throws Exception {
    ModelAccountCustomerService service = new ModelAccountCustomerServiceImpl(dao);

    OcCustomer bean = mock(OcCustomer.class);
    //replace these null with real values from DB 
    String code = null;

    when(dao.getCustomerByCode(code)).thenReturn(Arrays.asList(bean));

    List<OcCustomer> result = service.getCustomerByCode(code);

    assertThat("getCustomerByCode()", result, notNullValue());
    assertThat("getCustomerByCode()", result.size(), is(1));
  }
  @Test
  public void testaddLoginAttempt() throws Exception {
    ModelAccountCustomerService service = new ModelAccountCustomerServiceImpl(dao);

    OcCustomerLogin bean = mock(OcCustomerLogin.class);
    //replace these null with real values from DB 
    String email = null;
    String ip = null;

    when(dao.addLoginAttempt(email, ip)).thenReturn(Arrays.asList(bean));

    List<OcCustomerLogin> result = service.addLoginAttempt(email, ip);

    assertThat("addLoginAttempt()", result, notNullValue());
    assertThat("addLoginAttempt()", result.size(), is(1));
  }
  @Test
  public void testgetRewardTotal() throws Exception {
    ModelAccountCustomerService service = new ModelAccountCustomerServiceImpl(dao);

    GetrewardtotalDTO bean = mock(GetrewardtotalDTO.class);
    //replace these null with real values from DB 
    Integer customerid = null;

    when(dao.getRewardTotal(customerid)).thenReturn(Arrays.asList(bean));

    List<GetrewardtotalDTO> result = service.getRewardTotal(customerid);

    assertThat("getRewardTotal()", result, notNullValue());
    assertThat("getRewardTotal()", result.size(), is(1));
  }
  @Test
  public void testgetIps() throws Exception {
    ModelAccountCustomerService service = new ModelAccountCustomerServiceImpl(dao);

    OcCustomerIp bean = mock(OcCustomerIp.class);
    //replace these null with real values from DB 
    Integer customerid = null;

    when(dao.getIps(customerid)).thenReturn(Arrays.asList(bean));

    List<OcCustomerIp> result = service.getIps(customerid);

    assertThat("getIps()", result, notNullValue());
    assertThat("getIps()", result.size(), is(1));
  }
  @Test
  public void testgetCustomerByToken() throws Exception {
    ModelAccountCustomerService service = new ModelAccountCustomerServiceImpl(dao);

    OcCustomer bean = mock(OcCustomer.class);
    //replace these null with real values from DB 
    String token = null;

    when(dao.getCustomerByToken(token)).thenReturn(Arrays.asList(bean));

    List<OcCustomer> result = service.getCustomerByToken(token);

    assertThat("getCustomerByToken()", result, notNullValue());
    assertThat("getCustomerByToken()", result.size(), is(1));
  }
}