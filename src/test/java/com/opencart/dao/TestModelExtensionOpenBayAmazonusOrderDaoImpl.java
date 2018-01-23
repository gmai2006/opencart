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


public class TestModelExtensionOpenBayAmazonusOrderDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelExtensionOpenBayAmazonusOrderDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelExtensionOpenBayAmazonusOrderDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT "zone_id" FROM "oc_zone" WHERE LOWER("name") = 'param0' 
   */
  @Test
  public void testgetZoneId() throws Exception {

    String name = "Badakhshan";

    List<Integer> result = dao.getZoneId(name);
    assertThat("getZoneId", result, notNullValue());
  }

  /* *
   * SELECT pov.product_option_id, pov.product_option_value_id, od.name, ovd.name as value, opt.type FROM "oc_product_option_value" as pov, "oc_product_option" as po, "oc_option" as opt, "oc_option_value_description" as ovd, "oc_option_description" as od WHERE pov.product_option_value_id = 'param0' AND po.product_option_id = pov.product_option_id AND opt.option_id = pov.option_id AND ovd.option_value_id = pov.option_value_id AND ovd.language_id = 'param1' AND od.option_id = pov.option_id AND od.language_id = 'param2'  
   */
  @Test
  public void testgetProductOptionsByVar() throws Exception {

    Integer product_option_value_id = 1;
    String language_id = "1.0";

    List<ModelExtensionOpenBayAmazonusOrder0Dto> result = dao.getProductOptionsByVar(product_option_value_id, language_id);
    assertThat("getProductOptionsByVar", result, notNullValue());
  }

  /* *
   * SELECT "country_id" FROM "oc_country" WHERE LOWER("iso_code_2") = 'param0' 
   */
  @Test
  public void testgetCountryId() throws Exception {

    String iso_code_2 = "AF";

    List<Integer> result = dao.getCountryId(iso_code_2);
    assertThat("getCountryId", result, notNullValue());
  }

  /* *
   * SELECT "order_product_id" FROM "oc_order_product" WHERE "model" = 'param0' AND "order_id" = param1LIMIT 1 
   */
  @Test
  public void testaddAmazonusOrderProducts() throws Exception {

    String model = "s";
    Integer order_id = 0;

    List<Integer> result = dao.addAmazonusOrderProducts(model, order_id);
    assertThat("addAmazonusOrderProducts", result, notNullValue());
  }

  /* *
   * SELECT "order_status_id" FROM "oc_order" WHERE "order_id" = param0 
   */
  @Test
  public void testgetOrderStatus() throws Exception {

    Integer order_id = 1;

    List<Integer> result = dao.getOrderStatus(order_id);
    assertThat("getOrderStatus", result, notNullValue());
  }

  /* *
   * SELECT "name" FROM "oc_country" WHERE LOWER("iso_code_2") = 'param0' 
   */
  @Test
  public void testgetCountryName() throws Exception {

    String iso_code_2 = "AF";

    List<String> result = dao.getCountryName(iso_code_2);
    assertThat("getCountryName", result, notNullValue());
  }
}