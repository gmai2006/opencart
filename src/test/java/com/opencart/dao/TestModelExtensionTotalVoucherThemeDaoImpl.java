package com.opencart.dao;


import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Every.everyItem;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.*;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Module;
import com.opencart.GoogleGuiceTest;
import com.opencart.entity.*;
import com.opencart.util.JsonUtils;

import com.opencart.extension.total.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;


public class TestModelExtensionTotalVoucherThemeDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelExtensionTotalVoucherThemeDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelExtensionTotalVoucherThemeDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT vt.voucher_theme_id, vt.image, vtd.voucher_theme_id as voucher_theme_id0, vtd.language_id, vtd.name FROM oc_voucher_theme vt LEFT JOIN oc_voucher_theme_description vtd ON( vt.voucher_theme_id = vtd.voucher_theme_id ) WHERE vtd.language_id = 'param0' ORDER BY vtd.name 
   */
  @Test
  public void testgetVoucherThemes() throws Exception {

    Integer language_id = 1;

    List<ModelExtensionTotalVoucherTheme0Dto> result = dao.getVoucherThemes(language_id);
    assertThat("getVoucherThemes", result, notNullValue());
  }

  /* *
   * SELECT vt.voucher_theme_id, vt.image, vtd.voucher_theme_id as voucher_theme_id0, vtd.language_id, vtd.name FROM oc_voucher_theme vt LEFT JOIN oc_voucher_theme_description vtd ON( vt.voucher_theme_id = vtd.voucher_theme_id ) WHERE vt.voucher_theme_id = 'param0' AND vtd.language_id = 'param1' 
   */
  @Test
  public void testgetVoucherTheme() throws Exception {

    Integer voucher_theme_id = 8;
    Integer language_id = 1;

    List<ModelExtensionTotalVoucherTheme0Dto> result = dao.getVoucherTheme(voucher_theme_id, language_id);
    assertThat("getVoucherTheme", result, notNullValue());
  }
}