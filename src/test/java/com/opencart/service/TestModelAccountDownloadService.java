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

public class TestModelAccountDownloadService  {
  @Mock
  ModelAccountDownloadDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelAccountDownloadServiceImpl service;

  @Before
  public void before() {
    service = new ModelAccountDownloadServiceImpl(dao);
  }

  /* *
   * SELECT COUNT(*) AS total FROM "oc_order" o LEFT JOIN oc_order_product op ON (o.order_id = op.order_id) LEFT JOIN oc_product_to_download p2d ON (op.product_id = p2d.product_id) WHERE o.customer_id = 'param0' AND (param1) 
   */
  @Test
  public void testgetTotalDownloads() throws Exception {
    java.math.BigInteger bean = mock(java.math.BigInteger.class);

    Integer customer_id = 0;

    when(dao.getTotalDownloads(customer_id)).thenReturn(bean);

    java.math.BigInteger result = dao.getTotalDownloads(customer_id);

    assertThat("getTotalDownloads", result, notNullValue());
  }
  /* *
   * SELECT DISTINCT d.download_id, o.order_id, o.date_added, dd.name, d.filename FROM "oc_order" o LEFT JOIN oc_order_product op ON (o.order_id = op.order_id) LEFT JOIN oc_product_to_download p2d ON (op.product_id = p2d.product_id) LEFT JOIN oc_download d ON (p2d.download_id = d.download_id) LEFT JOIN oc_download_description dd ON (d.download_id = dd.download_id) WHERE o.customer_id = 'param0' AND dd.language_id = 'param1' AND (param2) ORDER BY o.date_added DESC LIMIT param3,param4 
   */
  @Test
  public void testgetDownloads() throws Exception {

    List<ModelAccountDownload0Dto> list = mock(List.class);

    Integer customer_id = 0;
    Integer language_id = null;

    when(dao.getDownloads(customer_id, language_id)).thenReturn(list);

    List<ModelAccountDownload0Dto> result = dao.getDownloads(customer_id, language_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT d.filename, d.mask FROM "oc_order" o LEFT JOIN oc_order_product op ON (o.order_id = op.order_id) LEFT JOIN oc_product_to_download p2d ON (op.product_id = p2d.product_id) LEFT JOIN oc_download d ON (p2d.download_id = d.download_id) WHERE o.customer_id = 'param0' AND (param1) AND d.download_id = 'param2' 
   */
  @Test
  public void testgetDownload() throws Exception {

    List<ModelAccountDownload1Dto> list = mock(List.class);

    Integer customer_id = 0;
    Integer download_id = null;

    when(dao.getDownload(customer_id, download_id)).thenReturn(list);

    List<ModelAccountDownload1Dto> result = dao.getDownload(customer_id, download_id);

    assertThat("$methodName$()", result, notNullValue());
  }
}