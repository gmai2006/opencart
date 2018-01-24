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

import com.opencart.extension.openbay.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

public class TestModelExtensionOpenBayEbayProductService  {
  @Mock
  ModelExtensionOpenBayEbayProductDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelExtensionOpenBayEbayProductServiceImpl service;

  @Before
  public void before() {
    service = new ModelExtensionOpenBayEbayProductServiceImpl(dao);
  }

  /* *
   * SELECT "length_class_id" FROM "oc_length_class_description" WHERE LCASE("title") = 'param0' LIMIT 1 
   */
  @Test
  public void testlengthClassExists() throws Exception {

    List<Integer> list = mock(List.class);

    String title = "Centimeter";

    when(dao.lengthClassExists(title)).thenReturn(list);

    List<Integer> result = dao.lengthClassExists(title);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM oc_product_option  a WHERE product_id = 'param0' AND option_id = 'param1'  LIMIT 1
   */
  @Test
  public void testgetProductOption() throws Exception {

    List<OcProductOption> list = mock(List.class);

    Integer product_id = 35;
    Integer option_id = 11;

    when(dao.getProductOption(product_id, option_id)).thenReturn(list);

    List<OcProductOption> result = dao.getProductOption(product_id, option_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT "o".option_id, "o".type, "o".sort_order, "od".option_id as option_id0, "od".language_id, "od".name FROM "oc_option" "o" LEFT JOIN "oc_option_description" "od" ON( "od"."option_id" = "o"."option_id" ) WHERE "od"."name" = 'param0'  LIMIT 1 
   */
  @Test
  public void testgetOption() throws Exception {

    List<ModelExtensionOpenBayEbayProduct0Dto> list = mock(List.class);

    String name = "Radio";

    when(dao.getOption(name)).thenReturn(list);

    List<ModelExtensionOpenBayEbayProduct0Dto> result = dao.getOption(name);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM "oc_attribute_group_description"  a WHERE "name" = 'param0' AND "language_id" = 'param1'  LIMIT 1
   */
  @Test
  public void testgetQry() throws Exception {

    List<OcAttributeGroupDescription> list = mock(List.class);

    String name = "Memory";
    Integer language_id = 1;

    when(dao.getQry(name, language_id)).thenReturn(list);

    List<OcAttributeGroupDescription> result = dao.getQry(name, language_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM "oc_attribute_description" "ad" , "oc_attribute" "a"  a WHERE "ad"."name" = 'param0' AND "ad"."language_id" = 'param1' AND "a"."attribute_id" = "ad"."attribute_id" AND "a"."attribute_group_id" = 'param2'  LIMIT 1
   */
  @Test
  public void testgetQry0() throws Exception {

    List<OcAttributeDescription> list = mock(List.class);

    String name = "Description";
    Integer language_id = 1;
    String attribute_group_id = "6.0";

    when(dao.getQry0(name, language_id, attribute_group_id)).thenReturn(list);

    List<OcAttributeDescription> result = dao.getQry0(name, language_id, attribute_group_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM "oc_product_option_value"  a WHERE "product_id" = 'param0' AND "option_id" = 'param1' AND "product_option_id" = 'param2' AND "option_value_id" = 'param3'  LIMIT 1
   */
  @Test
  public void testgetProductOptionValue() throws Exception {

    List<OcProductOptionValue> list = mock(List.class);

    Integer product_id = 42;
    Integer option_id = 5;
    Integer product_option_id = 217;
    Integer option_value_id = 41;

    when(dao.getProductOptionValue(product_id, option_id, product_option_id, option_value_id)).thenReturn(list);

    List<OcProductOptionValue> result = dao.getProductOptionValue(product_id, option_id, product_option_id, option_value_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM "oc_product_attribute"  a WHERE "product_id" = 'param0' AND "attribute_id" = 'param1' AND "language_id" = 'param2'  
   */
  @Test
  public void testattributeAdd() throws Exception {

    List<OcProductAttribute> list = mock(List.class);

    Integer product_id = 43;
    Integer attribute_id = 2;
    Integer language_id = 1;

    when(dao.attributeAdd(product_id, attribute_id, language_id)).thenReturn(list);

    List<OcProductAttribute> result = dao.attributeAdd(product_id, attribute_id, language_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM "oc_manufacturer"  a WHERE LCASE( "name" ) = 'param0'  LIMIT 1
   */
  @Test
  public void testgetQry1() throws Exception {

    List<OcManufacturer> list = mock(List.class);

    String name = "quillingartist.com";

    when(dao.getQry1(name)).thenReturn(list);

    List<OcManufacturer> result = dao.getQry1(name);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT "sort_order" FROM  "oc_manufacturer" ORDER BY "sort_order" DESC LIMIT 1 
   */
  @Test
  public void testgetQry2() throws Exception {

    List<Integer> list = mock(List.class);


    when(dao.getQry2()).thenReturn(list);

    List<Integer> result = dao.getQry2();

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT "sort_order" FROM  "oc_attribute" ORDER BY "sort_order" DESC LIMIT 1 
   */
  @Test
  public void testgetQry22() throws Exception {

    List<Integer> list = mock(List.class);


    when(dao.getQry22()).thenReturn(list);

    List<Integer> result = dao.getQry22();

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM "oc_category_path"  a WHERE category_id = 'param0' ORDER BY level ASC 
   */
  @Test
  public void testrepairCategories() throws Exception {

    List<OcCategoryPath> list = mock(List.class);

    Integer category_id = 1;

    when(dao.repairCategories(category_id)).thenReturn(list);

    List<OcCategoryPath> result = dao.repairCategories(category_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT "sort_order" FROM  "oc_attribute_group" ORDER BY "sort_order" DESC LIMIT 1 
   */
  @Test
  public void testgetQry23() throws Exception {

    List<Integer> list = mock(List.class);


    when(dao.getQry23()).thenReturn(list);

    List<Integer> result = dao.getQry23();

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT "weight_class_id" FROM "oc_weight_class_description" WHERE LCASE("title") = 'param0' LIMIT 1 
   */
  @Test
  public void testweightClassExists() throws Exception {

    List<Integer> list = mock(List.class);

    String title = "Kilogram";

    when(dao.weightClassExists(title)).thenReturn(list);

    List<Integer> result = dao.weightClassExists(title);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM "oc_category" , "oc_category_description"  a WHERE "oc_category"."parent_id" = 'param0' AND "oc_category_description"."name" = 'param1'  LIMIT 1
   */
  @Test
  public void testimportItems() throws Exception {

    List<OcCategory> list = mock(List.class);

    Integer parent_id = 0;
    String name = "Nature";

    when(dao.importItems(parent_id, name)).thenReturn(list);

    List<OcCategory> result = dao.importItems(parent_id, name);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT a FROM "oc_option"  a WHERE "option_id" = 'param0'  LIMIT 1
   */
  @Test
  public void testcreateOption() throws Exception {

    List<OcOption> list = mock(List.class);

    Integer option_id = 1;

    when(dao.createOption(option_id)).thenReturn(list);

    List<OcOption> result = dao.createOption(option_id);

    assertThat("$methodName$()", result, notNullValue());
  }
  /* *
   * SELECT ov.option_value_id, ov.option_id, ov.image, ov.sort_order, "ovd".option_value_id as option_value_id0, "ovd".language_id, "ovd".option_id as option_id0, "ovd".name FROM "oc_option_value" ov LEFT JOIN "oc_option_value_description" "ovd" ON( "ovd"."option_value_id" = "ov"."option_value_id" ) WHERE "ovd"."name" = 'param0' AND "ovd"."option_id" = 'param1'  LIMIT 1 
   */
  @Test
  public void testgetOptionValue() throws Exception {

    List<ModelExtensionOpenBayEbayProduct1Dto> list = mock(List.class);

    String name = "Large";
    Integer option_id = 1;

    when(dao.getOptionValue(name, option_id)).thenReturn(list);

    List<ModelExtensionOpenBayEbayProduct1Dto> result = dao.getOptionValue(name, option_id);

    assertThat("$methodName$()", result, notNullValue());
  }
}