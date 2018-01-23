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


public class TestModelCatalogProductDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelCatalogProductDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelCatalogProductDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT a.attribute_id, ad.name, pa.text FROM oc_product_attribute pa LEFT JOIN oc_attribute a ON (pa.attribute_id = a.attribute_id) LEFT JOIN oc_attribute_description ad ON (a.attribute_id = ad.attribute_id) WHERE pa.product_id = 'param0' AND a.attribute_group_id = 'param1' AND ad.language_id = 'param2' AND pa.language_id = 'param3' ORDER BY a.sort_order, ad.name 
   */
  @Test
  public void testgetProductAttributeQuery() throws Exception {

    Integer product_id = 43;
    Integer attribute_group_id = 6;
    Integer language_id = 1;

    List<ModelCatalogProduct0Dto> result = dao.getProductAttributeQuery(product_id, attribute_group_id, language_id);
    assertThat("getProductAttributeQuery", result, notNullValue());
  }

  /* *
   * SELECT COUNT(DISTINCT ps.product_id) AS total FROM oc_product_special ps LEFT JOIN oc_product p ON (ps.product_id = p.product_id) LEFT JOIN oc_product_to_store p2s ON (p.product_id = p2s.product_id) WHERE p.status = '1' AND p.date_available <= NOW() AND p2s.store_id = 'param0' AND ps.customer_group_id = 'param1' AND ((ps.date_start = '0000-00-00' OR ps.date_start < NOW()) AND (ps.date_end = '0000-00-00' OR ps.date_end > NOW())) 
   */
  @Test
  public void testgetTotalProductSpecials() throws Exception {
    Integer store_id = 0;
    Integer customer_group_id = 1;
    java.math.BigInteger result = dao.getTotalProductSpecials(store_id, customer_group_id);
    assertThat("getTotalProductSpecials", result, notNullValue());
  }

  /* *
   * SELECT p.product_id FROM oc_product p LEFT JOIN oc_product_to_store p2s ON (p.product_id = p2s.product_id) WHERE p.status = '1' AND p.date_available <= NOW() AND p2s.store_id = 'param0' ORDER BY p.date_added DESC LIMIT param1 
   */
  @Test
  public void testgetLatestProducts() throws Exception {

    Integer store_id = 0;

    List<Integer> result = dao.getLatestProducts(store_id);
    assertThat("getLatestProducts", result, notNullValue());
  }

  /* *
   * SELECT pov.product_option_value_id, pov.product_option_id, pov.product_id, pov.option_id, pov.option_value_id, pov.quantity, pov.subtract, pov.price, pov.price_prefix, pov.points, pov.points_prefix, pov.weight, pov.weight_prefix, ov.option_value_id as option_value_id0, ov.option_id as option_id0, ov.image, ov.sort_order, ovd.option_value_id as option_value_id01, ovd.language_id, ovd.option_id as option_id01, ovd.name FROM oc_product_option_value pov LEFT JOIN oc_option_value ov ON( pov.option_value_id = ov.option_value_id ) LEFT JOIN oc_option_value_description ovd ON( ov.option_value_id = ovd.option_value_id ) WHERE pov.product_id = 'param0' AND pov.product_option_id = 'param1' AND ovd.language_id = 'param2' ORDER BY ov.sort_order 
   */
  @Test
  public void testgetProductOptionValueQuery() throws Exception {

    Integer product_id = 42;
    Integer product_option_id = 217;
    Integer language_id = 1;

    List<ModelCatalogProduct1Dto> result = dao.getProductOptionValueQuery(product_id, product_option_id, language_id);
    assertThat("getProductOptionValueQuery", result, notNullValue());
  }

  /* *
   * SELECT p.product_id FROM oc_product p LEFT JOIN oc_product_to_store p2s ON (p.product_id = p2s.product_id) WHERE p.status = '1' AND p.date_available <= NOW() AND p2s.store_id = 'param0' ORDER BY p.viewed DESC, p.date_added DESC LIMIT param1 
   */
  @Test
  public void testgetPopularProducts() throws Exception {

    Integer store_id = 0;

    List<Integer> result = dao.getPopularProducts(store_id);
    assertThat("getPopularProducts", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_product_discount  a WHERE product_id = 'param0' AND customer_group_id = 'param1' AND quantity > 1 AND(( date_start = '0000-00-00' OR date_start < NOW( ) ) AND( date_end = '0000-00-00' OR date_end > NOW( ) ) ) ORDER BY quantity ASC , priority ASC , price ASC 
   */
  @Test
  public void testgetProductDiscounts() throws Exception {

    Integer product_id = 42;
    Integer customer_group_id = 1;

    List<OcProductDiscount> result = dao.getProductDiscounts(product_id, customer_group_id);
    assertThat("getProductDiscounts", result, notNullValue());
  }

  /* *
   * SELECT rd.* FROM oc_product_recurring pr JOIN oc_recurring_description rd ON (rd.language_id = param0 AND rd.recurring_id = pr.recurring_id) JOIN oc_recurring r ON r.recurring_id = rd.recurring_id WHERE pr.product_id = param1 AND status = '1' AND pr.customer_group_id = 'param2' ORDER BY sort_order ASC 
   */
  @Test
  public void testgetProfiles() throws Exception {

    Integer product_id = null;
    Integer customer_group_id = null;

    List<ModelCatalogProduct2Dto> result = dao.getProfiles(product_id, customer_group_id);
    assertThat("getProfiles", result, notNullValue());
  }

  /* *
   * SELECT r.recurring_id, r.price, r.frequency, r.duration, r.cycle, r.trial_status, r.trial_price, r.trial_frequency, r.trial_duration, r.trial_cycle, r.status, r.sort_order, pr.product_id, pr.recurring_id as recurring_id0, pr.customer_group_id FROM oc_recurring r JOIN oc_product_recurring pr ON( pr.recurring_id = r.recurring_id AND pr.product_id = 'param0' ) WHERE pr.recurring_id = 'param1' AND status = '1' AND pr.customer_group_id = 'param2' 
   */
  @Test
  public void testgetProfile() throws Exception {

    Integer recurring_id = null;
    Integer customer_group_id = null;

    List<ModelCatalogProduct3Dto> result = dao.getProfile(recurring_id, customer_group_id);
    assertThat("getProfile", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_product_to_layout  a WHERE product_id = 'param0' AND store_id = 'param1'  
   */
  @Test
  public void testgetProductLayoutId() throws Exception {

    Integer product_id = 0;
    Integer store_id = 0;

    List<OcProductToLayout> result = dao.getProductLayoutId(product_id, store_id);
    assertThat("getProductLayoutId", result, notNullValue());
  }

  /* *
   * SELECT DISTINCT *, pd.name AS name, p.image, m.name AS manufacturer, (SELECT price FROM oc_product_discount pd2 WHERE pd2.product_id = p.product_id AND pd2.customer_group_id = 'param0' AND pd2.quantity = '1' AND ((pd2.date_start = '0000-00-00' OR pd2.date_start < NOW()) AND (pd2.date_end = '0000-00-00' OR pd2.date_end > NOW())) ORDER BY pd2.priority ASC, pd2.price ASC LIMIT 1) AS discount, (SELECT price FROM oc_product_special ps WHERE ps.product_id = p.product_id AND ps.customer_group_id = 'param1' AND ((ps.date_start = '0000-00-00' OR ps.date_start < NOW()) AND (ps.date_end = '0000-00-00' OR ps.date_end > NOW())) ORDER BY ps.priority ASC, ps.price ASC LIMIT 1) AS special, (SELECT points FROM oc_product_reward pr WHERE pr.product_id = p.product_id AND pr.customer_group_id = 'param2') AS reward, (SELECT ss.name FROM oc_stock_status ss WHERE ss.stock_status_id = p.stock_status_id AND ss.language_id = 'param3') AS stock_status, (SELECT wcd.unit FROM oc_weight_class_description wcd WHERE p.weight_class_id = wcd.weight_class_id AND wcd.language_id = 'param4') AS weight_class, (SELECT lcd.unit FROM oc_length_class_description lcd WHERE p.length_class_id = lcd.length_class_id AND lcd.language_id = 'param5') AS length_class, (SELECT AVG(rating) AS total FROM oc_review r1 WHERE r1.product_id = p.product_id AND r1.status = '1' GROUP BY r1.product_id) AS rating, (SELECT COUNT(*) AS total FROM oc_review r2 WHERE r2.product_id = p.product_id AND r2.status = '1' GROUP BY r2.product_id) AS reviews, p.sort_order FROM oc_product p LEFT JOIN oc_product_description pd ON (p.product_id = pd.product_id) LEFT JOIN oc_product_to_store p2s ON (p.product_id = p2s.product_id) LEFT JOIN oc_manufacturer m ON (p.manufacturer_id = m.manufacturer_id) WHERE p.product_id = 'param6' AND pd.language_id = 'param7' AND p.status = '1' AND p.date_available <= NOW() AND p2s.store_id = 'param8' 
   */
  @Test
  public void testgetProduct() throws Exception {

    String customer_group_id = null;
    Integer language_id = 1;
    Integer product_id = 1;
    Integer store_id = 0;

    List<ModelCatalogProduct4Dto> result = dao.getProduct(customer_group_id, language_id, product_id, store_id);
    assertThat("getProduct", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_product_to_category  a WHERE product_id = 'param0'  
   */
  @Test
  public void testgetCategories() throws Exception {

    Integer product_id = 1;

    List<OcProductToCategory> result = dao.getCategories(product_id);
    assertThat("getCategories", result, notNullValue());
  }

  /* *
   * SELECT ag.attribute_group_id, agd.name FROM oc_product_attribute pa LEFT JOIN oc_attribute a ON (pa.attribute_id = a.attribute_id) LEFT JOIN oc_attribute_group ag ON (a.attribute_group_id = ag.attribute_group_id) LEFT JOIN oc_attribute_group_description agd ON (ag.attribute_group_id = agd.attribute_group_id) WHERE pa.product_id = 'param0' AND agd.language_id = 'param1' GROUP BY ag.attribute_group_id ORDER BY ag.sort_order, agd.name 
   */
  @Test
  public void testgetProductAttributeGroupQuery() throws Exception {

    Integer product_id = 43;
    Integer language_id = 1;

    List<ModelCatalogProduct5Dto> result = dao.getProductAttributeGroupQuery(product_id, language_id);
    assertThat("getProductAttributeGroupQuery", result, notNullValue());
  }

  /* *
   * SELECT a FROM oc_product_image  a WHERE product_id = 'param0' ORDER BY sort_order ASC 
   */
  @Test
  public void testgetProductImages() throws Exception {

    Integer product_id = 1;

    List<OcProductImage> result = dao.getProductImages(product_id);
    assertThat("getProductImages", result, notNullValue());
  }

  /* *
   * SELECT po.product_option_id, po.product_id, po.option_id, po.value, po.required, o.option_id as option_id0, o.type, o.sort_order, od.option_id as option_id01, od.language_id, od.name FROM oc_product_option po LEFT JOIN "oc_option" o ON( po.option_id = o.option_id ) LEFT JOIN oc_option_description od ON( o.option_id = od.option_id ) WHERE po.product_id = 'param0' AND od.language_id = 'param1' ORDER BY o.sort_order 
   */
  @Test
  public void testgetProductOptionQuery() throws Exception {

    Integer product_id = 35;
    Integer language_id = 1;

    List<ModelCatalogProduct6Dto> result = dao.getProductOptionQuery(product_id, language_id);
    assertThat("getProductOptionQuery", result, notNullValue());
  }

  /* *
   * SELECT pr.product_id, pr.related_id, p.product_id as product_id0, p.model, p.sku, p.upc, p.ean, p.jan, p.isbn, p.mpn, p.location, p.quantity, p.stock_status_id, p.image, p.manufacturer_id, p.shipping, p.price, p.points, p.tax_class_id, p.date_available, p.weight, p.weight_class_id, p.length, p.width, p.height, p.length_class_id, p.subtract, p.minimum, p.sort_order, p.status, p.viewed, p.date_added, p.date_modified, p2s.product_id as product_id01, p2s.store_id FROM oc_product_related pr LEFT JOIN oc_product p ON( pr.related_id = p.product_id ) LEFT JOIN oc_product_to_store p2s ON( p.product_id = p2s.product_id ) WHERE pr.product_id = 'param0' AND p.status = '1' AND p.date_available <= NOW( ) AND p2s.store_id = 'param1' 
   */
  @Test
  public void testgetProductRelated() throws Exception {

    Integer product_id = 42;
    Integer store_id = 0;

    List<ModelCatalogProduct7Dto> result = dao.getProductRelated(product_id, store_id);
    assertThat("getProductRelated", result, notNullValue());
  }

  /* *
   * SELECT op.product_id, SUM(op.quantity) AS total FROM oc_order_product op LEFT JOIN "oc_order" o ON (op.order_id = o.order_id) LEFT JOIN "oc_product" p ON (op.product_id = p.product_id) LEFT JOIN oc_product_to_store p2s ON (p.product_id = p2s.product_id) WHERE o.order_status_id > '0' AND p.status = '1' AND p.date_available <= NOW() AND p2s.store_id = 'param0' GROUP BY op.product_id ORDER BY total DESC LIMIT param1 
   */
  @Test
  public void testgetBestSellerProducts() throws Exception {

    Integer store_id = null;

    List<ModelCatalogProduct8Dto> result = dao.getBestSellerProducts(store_id);
    assertThat("getBestSellerProducts", result, notNullValue());
  }
}