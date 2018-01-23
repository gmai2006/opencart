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

import com.opencart.design.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;


public class TestModelDesignBannerDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelDesignBannerDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelDesignBannerDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT b.banner_id, b.name, b.status, bi.banner_image_id, bi.banner_id as banner_id0, bi.language_id, bi.title, bi.link, bi.image, bi.sort_order FROM oc_banner b LEFT JOIN oc_banner_image bi ON( b.banner_id = bi.banner_id ) WHERE b.banner_id = 'param0' AND b.status = '1' AND bi.language_id = 'param1' ORDER BY bi.sort_order ASC 
   */
  @Test
  public void testgetBanner() throws Exception {

    Integer banner_id = 9;
    Integer language_id = 1;

    List<ModelDesignBanner0Dto> result = dao.getBanner(banner_id, language_id);
    assertThat("getBanner", result, notNullValue());
  }
}