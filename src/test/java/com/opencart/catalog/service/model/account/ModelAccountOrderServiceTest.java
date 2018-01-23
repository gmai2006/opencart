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
import com.opencart.catalog.dao.model.account.ModelAccountOrderDAO;
import com.opencart.catalog.model.*;

public class ModelAccountOrderServiceTest {
  @Mock
  ModelAccountOrderDAO dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  @Test
  public void testgetOrderHistories() throws Exception {
    ModelAccountOrderService service = new ModelAccountOrderServiceImpl(dao);

    OcOrderStatus bean = mock(OcOrderStatus.class);
    //replace these null with real values from DB 
    Integer orderid = null;
    Integer languageid = null;

    when(dao.getOrderHistories(orderid, languageid)).thenReturn(Arrays.asList(bean));

    List<OcOrderStatus> result = service.getOrderHistories(orderid, languageid);

    assertThat("getOrderHistories()", result, notNullValue());
    assertThat("getOrderHistories()", result.size(), is(1));
  }
  @Test
  public void testgetOrderOptions() throws Exception {
    ModelAccountOrderService service = new ModelAccountOrderServiceImpl(dao);

    OcOrderOption bean = mock(OcOrderOption.class);
    //replace these null with real values from DB 
    Integer orderid = null;
    Integer orderproductid = null;

    when(dao.getOrderOptions(orderid, orderproductid)).thenReturn(Arrays.asList(bean));

    List<OcOrderOption> result = service.getOrderOptions(orderid, orderproductid);

    assertThat("getOrderOptions()", result, notNullValue());
    assertThat("getOrderOptions()", result.size(), is(1));
  }
  @Test
  public void testgetOrderProducts() throws Exception {
    ModelAccountOrderService service = new ModelAccountOrderServiceImpl(dao);

    OcOrderProduct bean = mock(OcOrderProduct.class);
    //replace these null with real values from DB 
    Integer orderid = null;

    when(dao.getOrderProducts(orderid)).thenReturn(Arrays.asList(bean));

    List<OcOrderProduct> result = service.getOrderProducts(orderid);

    assertThat("getOrderProducts()", result, notNullValue());
    assertThat("getOrderProducts()", result.size(), is(1));
  }
  @Test
  public void testgetOrderVouchers() throws Exception {
    ModelAccountOrderService service = new ModelAccountOrderServiceImpl(dao);

    OcOrderVoucher bean = mock(OcOrderVoucher.class);
    //replace these null with real values from DB 
    Integer orderid = null;

    when(dao.getOrderVouchers(orderid)).thenReturn(Arrays.asList(bean));

    List<OcOrderVoucher> result = service.getOrderVouchers(orderid);

    assertThat("getOrderVouchers()", result, notNullValue());
    assertThat("getOrderVouchers()", result.size(), is(1));
  }
  @Test
  public void testgetOrder4() throws Exception {
    ModelAccountOrderService service = new ModelAccountOrderServiceImpl(dao);

    OcZone bean = mock(OcZone.class);
    //replace these null with real values from DB 
    Integer zoneid = null;

    when(dao.getOrder4(zoneid)).thenReturn(Arrays.asList(bean));

    List<OcZone> result = service.getOrder4(zoneid);

    assertThat("getOrder4()", result, notNullValue());
    assertThat("getOrder4()", result.size(), is(1));
  }
  @Test
  public void testgetOrder2() throws Exception {
    ModelAccountOrderService service = new ModelAccountOrderServiceImpl(dao);

    OcZone bean = mock(OcZone.class);
    //replace these null with real values from DB 
    Integer zoneid = null;

    when(dao.getOrder2(zoneid)).thenReturn(Arrays.asList(bean));

    List<OcZone> result = service.getOrder2(zoneid);

    assertThat("getOrder2()", result, notNullValue());
    assertThat("getOrder2()", result.size(), is(1));
  }
  @Test
  public void testgetOrder3() throws Exception {
    ModelAccountOrderService service = new ModelAccountOrderServiceImpl(dao);

    OcCountry bean = mock(OcCountry.class);
    //replace these null with real values from DB 
    Integer countryid = null;

    when(dao.getOrder3(countryid)).thenReturn(Arrays.asList(bean));

    List<OcCountry> result = service.getOrder3(countryid);

    assertThat("getOrder3()", result, notNullValue());
    assertThat("getOrder3()", result.size(), is(1));
  }
  @Test
  public void testgetOrders() throws Exception {
    ModelAccountOrderService service = new ModelAccountOrderServiceImpl(dao);

    OcOrderStatus bean = mock(OcOrderStatus.class);
    //replace these null with real values from DB 
    Integer customerid = null;
    Integer storeid = null;
    Integer languageid = null;

    when(dao.getOrders(customerid, storeid, languageid)).thenReturn(Arrays.asList(bean));

    List<OcOrderStatus> result = service.getOrders(customerid, storeid, languageid);

    assertThat("getOrders()", result, notNullValue());
    assertThat("getOrders()", result.size(), is(1));
  }
  @Test
  public void testgetOrder1() throws Exception {
    ModelAccountOrderService service = new ModelAccountOrderServiceImpl(dao);

    OcCountry bean = mock(OcCountry.class);
    //replace these null with real values from DB 
    Integer countryid = null;

    when(dao.getOrder1(countryid)).thenReturn(Arrays.asList(bean));

    List<OcCountry> result = service.getOrder1(countryid);

    assertThat("getOrder1()", result, notNullValue());
    assertThat("getOrder1()", result.size(), is(1));
  }
  @Test
  public void testgetOrderTotals() throws Exception {
    ModelAccountOrderService service = new ModelAccountOrderServiceImpl(dao);

    OcOrderTotal bean = mock(OcOrderTotal.class);
    //replace these null with real values from DB 
    Integer orderid = null;

    when(dao.getOrderTotals(orderid)).thenReturn(Arrays.asList(bean));

    List<OcOrderTotal> result = service.getOrderTotals(orderid);

    assertThat("getOrderTotals()", result, notNullValue());
    assertThat("getOrderTotals()", result.size(), is(1));
  }
  @Test
  public void testgetOrder() throws Exception {
    ModelAccountOrderService service = new ModelAccountOrderServiceImpl(dao);

    OcOrder bean = mock(OcOrder.class);
    //replace these null with real values from DB 
    Integer orderid = null;
    Integer customerid = null;

    when(dao.getOrder(orderid, customerid)).thenReturn(Arrays.asList(bean));

    List<OcOrder> result = service.getOrder(orderid, customerid);

    assertThat("getOrder()", result, notNullValue());
    assertThat("getOrder()", result.size(), is(1));
  }
  @Test
  public void testgetTotalOrderVouchersByOrderId() throws Exception {
    ModelAccountOrderService service = new ModelAccountOrderServiceImpl(dao);

    GettotalordervouchersbyorderidDTO bean = mock(GettotalordervouchersbyorderidDTO.class);
    //replace these null with real values from DB 
    Integer orderid = null;

    when(dao.getTotalOrderVouchersByOrderId(orderid)).thenReturn(Arrays.asList(bean));

    List<GettotalordervouchersbyorderidDTO> result = service.getTotalOrderVouchersByOrderId(orderid);

    assertThat("getTotalOrderVouchersByOrderId()", result, notNullValue());
    assertThat("getTotalOrderVouchersByOrderId()", result.size(), is(1));
  }
  @Test
  public void testgetOrderProduct() throws Exception {
    ModelAccountOrderService service = new ModelAccountOrderServiceImpl(dao);

    OcOrderProduct bean = mock(OcOrderProduct.class);
    //replace these null with real values from DB 
    Integer orderid = null;
    Integer orderproductid = null;

    when(dao.getOrderProduct(orderid, orderproductid)).thenReturn(Arrays.asList(bean));

    List<OcOrderProduct> result = service.getOrderProduct(orderid, orderproductid);

    assertThat("getOrderProduct()", result, notNullValue());
    assertThat("getOrderProduct()", result.size(), is(1));
  }
  @Test
  public void testgetTotalOrders() throws Exception {
    ModelAccountOrderService service = new ModelAccountOrderServiceImpl(dao);

    GettotalordersDTO bean = mock(GettotalordersDTO.class);
    //replace these null with real values from DB 
    Integer customerid = null;
    Integer storeid = null;

    when(dao.getTotalOrders(customerid, storeid)).thenReturn(Arrays.asList(bean));

    List<GettotalordersDTO> result = service.getTotalOrders(customerid, storeid);

    assertThat("getTotalOrders()", result, notNullValue());
    assertThat("getTotalOrders()", result.size(), is(1));
  }
  @Test
  public void testgetTotalOrderProductsByOrderId() throws Exception {
    ModelAccountOrderService service = new ModelAccountOrderServiceImpl(dao);

    GettotalorderproductsbyorderidDTO bean = mock(GettotalorderproductsbyorderidDTO.class);
    //replace these null with real values from DB 
    Integer orderid = null;

    when(dao.getTotalOrderProductsByOrderId(orderid)).thenReturn(Arrays.asList(bean));

    List<GettotalorderproductsbyorderidDTO> result = service.getTotalOrderProductsByOrderId(orderid);

    assertThat("getTotalOrderProductsByOrderId()", result, notNullValue());
    assertThat("getTotalOrderProductsByOrderId()", result.size(), is(1));
  }
}