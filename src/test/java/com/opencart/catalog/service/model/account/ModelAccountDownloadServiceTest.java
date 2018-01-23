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
import com.opencart.catalog.dao.model.account.ModelAccountDownloadDAO;
import com.opencart.catalog.model.*;

public class ModelAccountDownloadServiceTest {
  @Mock
  ModelAccountDownloadDAO dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  @Test
  public void testgetTotalDownloads() throws Exception {
    ModelAccountDownloadService service = new ModelAccountDownloadServiceImpl(dao);

    GettotaldownloadsDTO bean = mock(GettotaldownloadsDTO.class);
    //replace these null with real values from DB 
    Integer customerid = null;

    when(dao.getTotalDownloads(customerid)).thenReturn(Arrays.asList(bean));

    List<GettotaldownloadsDTO> result = service.getTotalDownloads(customerid);

    assertThat("getTotalDownloads()", result, notNullValue());
    assertThat("getTotalDownloads()", result.size(), is(1));
  }
  @Test
  public void testgetDownload() throws Exception {
    ModelAccountDownloadService service = new ModelAccountDownloadServiceImpl(dao);

    OcOrderProduct bean = mock(OcOrderProduct.class);
    //replace these null with real values from DB 
    Integer customerid = null;
    Integer downloadid = null;

    when(dao.getDownload(customerid, downloadid)).thenReturn(Arrays.asList(bean));

    List<OcOrderProduct> result = service.getDownload(customerid, downloadid);

    assertThat("getDownload()", result, notNullValue());
    assertThat("getDownload()", result.size(), is(1));
  }
  @Test
  public void testgetDownloads() throws Exception {
    ModelAccountDownloadService service = new ModelAccountDownloadServiceImpl(dao);

    OcDownloadDescription bean = mock(OcDownloadDescription.class);
    //replace these null with real values from DB 
    Integer customerid = null;
    Integer languageid = null;

    when(dao.getDownloads(customerid, languageid)).thenReturn(Arrays.asList(bean));

    List<OcDownloadDescription> result = service.getDownloads(customerid, languageid);

    assertThat("getDownloads()", result, notNullValue());
    assertThat("getDownloads()", result.size(), is(1));
  }
}