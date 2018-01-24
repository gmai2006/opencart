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

import com.opencart.extension.total.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

public class TestModelExtensionTotalVoucherThemeService  {
  @Mock
  ModelExtensionTotalVoucherThemeDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelExtensionTotalVoucherThemeServiceImpl service;

  @Before
  public void before() {
    service = new ModelExtensionTotalVoucherThemeServiceImpl(dao);
  }

  /* *
   * SELECT vt.voucher_theme_id, vt.image, vtd.voucher_theme_id as voucher_theme_id0, vtd.language_id, vtd.name FROM oc_voucher_theme vt LEFT JOIN oc_voucher_theme_description vtd ON( vt.voucher_theme_id = vtd.voucher_theme_id ) WHERE vtd.language_id = 'param0' ORDER BY vtd.name 
   */
  @Test
  public void testgetVoucherThemes() throws Exception {

    List<ModelExtensionTotalVoucherTheme0Dto> list = mock(List.class);

    Integer language_id = 1;

    when(dao.getVoucherThemes(language_id)).thenReturn(list);

    List<ModelExtensionTotalVoucherTheme0Dto> result = dao.getVoucherThemes(language_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT vt.voucher_theme_id, vt.image, vtd.voucher_theme_id as voucher_theme_id0, vtd.language_id, vtd.name FROM oc_voucher_theme vt LEFT JOIN oc_voucher_theme_description vtd ON( vt.voucher_theme_id = vtd.voucher_theme_id ) WHERE vt.voucher_theme_id = 'param0' AND vtd.language_id = 'param1' 
   */
  @Test
  public void testgetVoucherTheme() throws Exception {

    List<ModelExtensionTotalVoucherTheme0Dto> list = mock(List.class);

    Integer voucher_theme_id = 8;
    Integer language_id = 1;

    when(dao.getVoucherTheme(voucher_theme_id, language_id)).thenReturn(list);

    List<ModelExtensionTotalVoucherTheme0Dto> result = dao.getVoucherTheme(voucher_theme_id, language_id);

    assertThat("$methodName$()", result, notNullValue());
  }
}