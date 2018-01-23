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

import com.opencart.extension.openbay.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;


public class TestModelExtensionOpenBayEbayProductDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelExtensionOpenBayEbayProductDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelExtensionOpenBayEbayProductDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT "length_class_id" FROM "oc_length_class_description" WHERE LCASE("title") = 'param0' LIMIT 1 
   */
  @Test
  public void testlengthClassExists() throws Exception {

    String title = "Centimeter";

    List<Integer> result = dao.lengthClassExists(title);
    assertThat("lengthClassExists", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_product_option  a WHERE product_id = 'param0' AND option_id = 'param1'  LIMIT 1
   */
  @Test
  public void testgetProductOption() throws Exception {

    Integer product_id = 35;
    Integer option_id = 11;

    List<OcProductOption> result = dao.getProductOption(product_id, option_id);
    assertThat("getProductOption", result, notNullValue());
  }

  /* *
   * SELECT "o".option_id, "o".type, "o".sort_order, "od".option_id as option_id0, "od".language_id, "od".name FROM "oc_option" "o" LEFT JOIN "oc_option_description" "od" ON( "od"."option_id" = "o"."option_id" ) WHERE "od"."name" = 'param0'  LIMIT 1 
   */
  @Test
  public void testgetOption() throws Exception {

    String name = "Radio";

    List<ModelExtensionOpenBayEbayProduct0Dto> result = dao.getOption(name);
    assertThat("getOption", result, notNullValue());
  }

  /* *
   * SELECT a FROM "oc_attribute_group_description"  a WHERE "name" = 'param0' AND "language_id" = 'param1'  LIMIT 1
   */
  @Test
  public void testgetQry() throws Exception {

    String name = "Memory";
    Integer language_id = 1;

    List<OcAttributeGroupDescription> result = dao.getQry(name, language_id);
    assertThat("getQry", result, notNullValue());
  }

  /* *
   * SELECT a FROM "oc_attribute_description" "ad" , "oc_attribute" "a"  a WHERE "ad"."name" = 'param0' AND "ad"."language_id" = 'param1' AND "a"."attribute_id" = "ad"."attribute_id" AND "a"."attribute_group_id" = 'param2'  LIMIT 1
   */
  @Test
  public void testgetQry0() throws Exception {

    String name = "Description";
    Integer language_id = 1;
    String attribute_group_id = "6.0";

    List<OcAttributeDescription> result = dao.getQry0(name, language_id, attribute_group_id);
    assertThat("getQry0", result, notNullValue());
  }

  /* *
   * SELECT a FROM "oc_product_option_value"  a WHERE "product_id" = 'param0' AND "option_id" = 'param1' AND "product_option_id" = 'param2' AND "option_value_id" = 'param3'  LIMIT 1
   */
  @Test
  public void testgetProductOptionValue() throws Exception {

    Integer product_id = 42;
    Integer option_id = 5;
    Integer product_option_id = 217;
    Integer option_value_id = 41;

    List<OcProductOptionValue> result = dao.getProductOptionValue(product_id, option_id, product_option_id, option_value_id);
    assertThat("getProductOptionValue", result, notNullValue());
  }

  /* *
   * SELECT a FROM "oc_product_attribute"  a WHERE "product_id" = 'param0' AND "attribute_id" = 'param1' AND "language_id" = 'param2'  
   */
  @Test
  public void testattributeAdd() throws Exception {

    Integer product_id = 43;
    Integer attribute_id = 2;
    Integer language_id = 1;

    List<OcProductAttribute> result = dao.attributeAdd(product_id, attribute_id, language_id);
    assertThat("attributeAdd", result, notNullValue());
  }

  /* *
   * SELECT a FROM "oc_manufacturer"  a WHERE LCASE( "name" ) = 'param0'  LIMIT 1
   */
  @Test
  public void testgetQry1() throws Exception {

    String name = "quillingartist.com";

    List<OcManufacturer> result = dao.getQry1(name);
    assertThat("getQry1", result, notNullValue());
  }

  /* *
   * SELECT "sort_order" FROM  "oc_manufacturer" ORDER BY "sort_order" DESC LIMIT 1 
   */
  @Test
  public void testgetQry2() throws Exception {


    List<Integer> result = dao.getQry2();
    assertThat("getQry2", result, notNullValue());
  }

  /* *
   * SELECT "sort_order" FROM  "oc_attribute" ORDER BY "sort_order" DESC LIMIT 1 
   */
  @Test
  public void testgetQry22() throws Exception {


    List<Integer> result = dao.getQry22();
    assertThat("getQry22", result, notNullValue());
  }

  /* *
   * SELECT a FROM "oc_category_path"  a WHERE category_id = 'param0' ORDER BY level ASC 
   */
  @Test
  public void testrepairCategories() throws Exception {

    Integer category_id = 1;

    List<OcCategoryPath> result = dao.repairCategories(category_id);
    assertThat("repairCategories", result, notNullValue());
  }

  /* *
   * SELECT "sort_order" FROM  "oc_attribute_group" ORDER BY "sort_order" DESC LIMIT 1 
   */
  @Test
  public void testgetQry23() throws Exception {


    List<Integer> result = dao.getQry23();
    assertThat("getQry23", result, notNullValue());
  }

  /* *
   * SELECT "weight_class_id" FROM "oc_weight_class_description" WHERE LCASE("title") = 'param0' LIMIT 1 
   */
  @Test
  public void testweightClassExists() throws Exception {

    String title = "Kilogram";

    List<Integer> result = dao.weightClassExists(title);
    assertThat("weightClassExists", result, notNullValue());
  }

  /* *
   * SELECT a FROM "oc_category" , "oc_category_description"  a WHERE "oc_category"."parent_id" = 'param0' AND "oc_category_description"."name" = 'param1'  LIMIT 1
   */
  @Test
  public void testimportItems() throws Exception {

    Integer parent_id = 0;
    String name = "Nature";

    List<OcCategory> result = dao.importItems(parent_id, name);
    assertThat("importItems", result, notNullValue());
  }

  /* *
   * SELECT a FROM "oc_option"  a WHERE "option_id" = 'param0'  LIMIT 1
   */
  @Test
  public void testcreateOption() throws Exception {

    Integer option_id = 1;

    List<OcOption> result = dao.createOption(option_id);
    assertThat("createOption", result, notNullValue());
  }

  /* *
   * SELECT ov.option_value_id, ov.option_id, ov.image, ov.sort_order, "ovd".option_value_id as option_value_id0, "ovd".language_id, "ovd".option_id as option_id0, "ovd".name FROM "oc_option_value" ov LEFT JOIN "oc_option_value_description" "ovd" ON( "ovd"."option_value_id" = "ov"."option_value_id" ) WHERE "ovd"."name" = 'param0' AND "ovd"."option_id" = 'param1'  LIMIT 1 
   */
  @Test
  public void testgetOptionValue() throws Exception {

    String name = "Large";
    Integer option_id = 1;

    List<ModelExtensionOpenBayEbayProduct1Dto> result = dao.getOptionValue(name, option_id);
    assertThat("getOptionValue", result, notNullValue());
  }
}