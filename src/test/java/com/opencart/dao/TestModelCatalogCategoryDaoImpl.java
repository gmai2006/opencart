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

import com.opencart.catalog.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;


public class TestModelCatalogCategoryDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelCatalogCategoryDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelCatalogCategoryDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT DISTINCT f.filter_id, fd.name FROM oc_filter f LEFT JOIN oc_filter_description fd ON (f.filter_id = fd.filter_id) WHERE f.filter_id IN (param0) AND f.filter_group_id = 'param1' AND fd.language_id = 'param2' ORDER BY f.sort_order, LCASE(fd.name) 
   */
  @Test
  public void testgetFilterQuery() throws Exception {

    Integer filter_group_id = null;
    Integer language_id = null;

    List<ModelCatalogCategory0Dto> result = dao.getFilterQuery(filter_group_id, language_id);
    assertThat("getFilterQuery", result, notNullValue());
  }

  /* *
   * SELECT filter_id FROM oc_category_filter WHERE category_id = 'param0' 
   */
  @Test
  public void testgetQuery() throws Exception {

    Integer category_id = null;

    List<Integer> result = dao.getQuery(category_id);
    assertThat("getQuery", result, notNullValue());
  }

  /* *
   * SELECT COUNT(*) AS total FROM oc_category c LEFT JOIN oc_category_to_store c2s ON (c.category_id = c2s.category_id) WHERE c.parent_id = 'param0' AND c2s.store_id = 'param1' AND c.status = '1' 
   */
  @Test
  public void testgetTotalCategoriesByCategoryId() throws Exception {
    Integer parent_id = 0;
    Integer store_id = 0;
    java.math.BigInteger result = dao.getTotalCategoriesByCategoryId(parent_id, store_id);
    assertThat("getTotalCategoriesByCategoryId", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_category_to_layout  a WHERE category_id = 'param0' AND store_id = 'param1'  
   */
  @Test
  public void testgetCategoryLayoutId() throws Exception {

    Integer category_id = 0;
    Integer store_id = 0;

    List<OcCategoryToLayout> result = dao.getCategoryLayoutId(category_id, store_id);
    assertThat("getCategoryLayoutId", result, notNullValue());
  }

  /* *
   * SELECT DISTINCT f.filter_group_id, fgd.name, fg.sort_order FROM oc_filter f LEFT JOIN oc_filter_group fg ON (f.filter_group_id = fg.filter_group_id) LEFT JOIN oc_filter_group_description fgd ON (fg.filter_group_id = fgd.filter_group_id) WHERE f.filter_id IN (param0) AND fgd.language_id = 'param1' GROUP BY f.filter_group_id ORDER BY fg.sort_order, LCASE(fgd.name) 
   */
  @Test
  public void testgetFilterGroupQuery() throws Exception {

    Integer language_id = null;

    List<ModelCatalogCategory1Dto> result = dao.getFilterGroupQuery(language_id);
    assertThat("getFilterGroupQuery", result, notNullValue());
  }

  /* *
   * SELECT c.category_id, c.image, c.parent_id, c.top, c.column, c.sort_order, c.status, c.date_added, c.date_modified, cd.category_id as category_id0, cd.language_id, cd.name, cd.description, cd.meta_title, cd.meta_description, cd.meta_keyword, c2s.category_id as category_id01, c2s.store_id FROM oc_category c LEFT JOIN oc_category_description cd ON( c.category_id = cd.category_id ) LEFT JOIN oc_category_to_store c2s ON( c.category_id = c2s.category_id ) WHERE c.category_id = 'param0' AND cd.language_id = 'param1' AND c2s.store_id = 'param2' AND c.status = '1' 
   */
  @Test
  public void testgetCategory() throws Exception {

    Integer category_id = 1;
    Integer language_id = 1;
    Integer store_id = 0;

    List<ModelCatalogCategory2Dto> result = dao.getCategory(category_id, language_id, store_id);
    assertThat("getCategory", result, notNullValue());
  }

  /* *
   * SELECT c.category_id, c.image, c.parent_id, c.top, c.column, c.sort_order, c.status, c.date_added, c.date_modified, cd.category_id as category_id0, cd.language_id, cd.name, cd.description, cd.meta_title, cd.meta_description, cd.meta_keyword, c2s.category_id as category_id01, c2s.store_id FROM oc_category c LEFT JOIN oc_category_description cd ON( c.category_id = cd.category_id ) LEFT JOIN oc_category_to_store c2s ON( c.category_id = c2s.category_id ) WHERE c.parent_id = 'param0' AND cd.language_id = 'param1' AND c2s.store_id = 'param2' AND c.status = '1' ORDER BY c.sort_order , LCASE( cd.name ) 
   */
  @Test
  public void testgetCategories() throws Exception {

    Integer parent_id = 0;
    Integer language_id = 1;
    Integer store_id = 0;

    List<ModelCatalogCategory2Dto> result = dao.getCategories(parent_id, language_id, store_id);
    assertThat("getCategories", result, notNullValue());
  }
}