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

import com.opencart.design.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

public class TestModelDesignBannerService  {
  @Mock
  ModelDesignBannerDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelDesignBannerServiceImpl service;

  @Before
  public void before() {
    service = new ModelDesignBannerServiceImpl(dao);
  }

  /* *
   * SELECT b.banner_id, b.name, b.status, bi.banner_image_id, bi.banner_id as banner_id0, bi.language_id, bi.title, bi.link, bi.image, bi.sort_order FROM oc_banner b LEFT JOIN oc_banner_image bi ON( b.banner_id = bi.banner_id ) WHERE b.banner_id = 'param0' AND b.status = '1' AND bi.language_id = 'param1' ORDER BY bi.sort_order ASC 
   */
  @Test
  public void testgetBanner() throws Exception {

    List<ModelDesignBanner0Dto> list = mock(List.class);

    Integer banner_id = 9;
    Integer language_id = 1;

    when(dao.getBanner(banner_id, language_id)).thenReturn(list);

    List<ModelDesignBanner0Dto> result = dao.getBanner(banner_id, language_id);

    assertThat("$methodName$()", result, notNullValue());
  }
}