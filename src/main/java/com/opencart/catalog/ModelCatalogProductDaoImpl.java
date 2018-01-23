/*************************************************************************
 *
 * DATASCIENCE9 LLC CONFIDENTIAL
 * __________________
 *
 *  [2018] Datascience9 LLC
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Datascience9 LLC and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Datascience9 LLC
 * and its suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Datascience9 LLC.
 * @author Paul Mai - Datascience9 LLC
 */
package com.opencart.catalog;

import java.util.List;
import javax.inject.Inject;

import static java.util.Objects.requireNonNull;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.opencart.entity.*;

import com.google.inject.Provider;

import java.util.stream.Collectors;

import com.opencart.util.DaoUtils;

/**
* auto generated from SQL
*/
public class ModelCatalogProductDaoImpl implements ModelCatalogProductDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelCatalogProductDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelCatalogProduct.getProductAttributes.getProductAttributeQuery
   * SELECT a.attribute_id, ad.name, pa.text FROM oc_product_attribute pa LEFT JOIN oc_attribute a ON (pa.attribute_id = a.attribute_id) LEFT JOIN oc_attribute_description ad ON (a.attribute_id = ad.attribute_id) WHERE pa.product_id = 'param0' AND a.attribute_group_id = 'param1' AND ad.language_id = 'param2' AND pa.language_id = 'param3' ORDER BY a.sort_order, ad.name 
   */
  @Override
  public List<ModelCatalogProduct0Dto> getProductAttributeQuery(Integer product_id,Integer attribute_group_id,Integer language_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelCatalogProduct.getProductAttributes.getProductAttributeQuery");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("product_id", product_id);
    query.setParameter("attribute_group_id", attribute_group_id);
    query.setParameter("language_id", language_id);

    return fromListOfArrayModelCatalogProduct0Dto(query.getResultList());
  }

  /* *
   * ModelCatalogProduct.getTotalProductSpecials.getTotalProductSpecials
   * SELECT COUNT(DISTINCT ps.product_id) AS total FROM oc_product_special ps LEFT JOIN oc_product p ON (ps.product_id = p.product_id) LEFT JOIN oc_product_to_store p2s ON (p.product_id = p2s.product_id) WHERE p.status = '1' AND p.date_available <= NOW() AND p2s.store_id = 'param0' AND ps.customer_group_id = 'param1' AND ((ps.date_start = '0000-00-00' OR ps.date_start < NOW()) AND (ps.date_end = '0000-00-00' OR ps.date_end > NOW())) 
   */
  @Override
  public java.math.BigInteger getTotalProductSpecials(Integer store_id,Integer customer_group_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelCatalogProduct.getTotalProductSpecials.getTotalProductSpecials");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("store_id", store_id);
    query.setParameter("customer_group_id", customer_group_id);

    return (java.math.BigInteger)query.getSingleResult();
  }

  /* *
   * ModelCatalogProduct.getLatestProducts.getLatestProducts
   * SELECT p.product_id FROM oc_product p LEFT JOIN oc_product_to_store p2s ON (p.product_id = p2s.product_id) WHERE p.status = '1' AND p.date_available <= NOW() AND p2s.store_id = 'param0' ORDER BY p.date_added DESC LIMIT param1 
   */
  @Override
  public List<Integer> getLatestProducts(Integer store_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelCatalogProduct.getLatestProducts.getLatestProducts");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("store_id", store_id);

    return query.getResultList();
  }

  /* *
   * ModelCatalogProduct.getProductOptions.getProductOptionValueQuery
   * SELECT pov.product_option_value_id, pov.product_option_id, pov.product_id, pov.option_id, pov.option_value_id, pov.quantity, pov.subtract, pov.price, pov.price_prefix, pov.points, pov.points_prefix, pov.weight, pov.weight_prefix, ov.option_value_id as option_value_id0, ov.option_id as option_id0, ov.image, ov.sort_order, ovd.option_value_id as option_value_id01, ovd.language_id, ovd.option_id as option_id01, ovd.name FROM oc_product_option_value pov LEFT JOIN oc_option_value ov ON( pov.option_value_id = ov.option_value_id ) LEFT JOIN oc_option_value_description ovd ON( ov.option_value_id = ovd.option_value_id ) WHERE pov.product_id = 'param0' AND pov.product_option_id = 'param1' AND ovd.language_id = 'param2' ORDER BY ov.sort_order 
   */
  @Override
  public List<ModelCatalogProduct1Dto> getProductOptionValueQuery(Integer product_id,Integer product_option_id,Integer language_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelCatalogProduct.getProductOptions.getProductOptionValueQuery");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("product_id", product_id);
    query.setParameter("product_option_id", product_option_id);
    query.setParameter("language_id", language_id);

    return fromListOfArrayModelCatalogProduct1Dto(query.getResultList());
  }

  /* *
   * ModelCatalogProduct.getPopularProducts.getPopularProducts
   * SELECT p.product_id FROM oc_product p LEFT JOIN oc_product_to_store p2s ON (p.product_id = p2s.product_id) WHERE p.status = '1' AND p.date_available <= NOW() AND p2s.store_id = 'param0' ORDER BY p.viewed DESC, p.date_added DESC LIMIT param1 
   */
  @Override
  public List<Integer> getPopularProducts(Integer store_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelCatalogProduct.getPopularProducts.getPopularProducts");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("store_id", store_id);

    return query.getResultList();
  }

  /* *
   * ModelCatalogProduct.getProductDiscounts.getProductDiscounts
   * SELECT a FROM oc_product_discount  a WHERE product_id = 'param0' AND customer_group_id = 'param1' AND quantity > 1 AND(( date_start = '0000-00-00' OR date_start < NOW( ) ) AND( date_end = '0000-00-00' OR date_end > NOW( ) ) ) ORDER BY quantity ASC , priority ASC , price ASC 
   */
  @Override
  public List<OcProductDiscount> getProductDiscounts(Integer product_id,Integer customer_group_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelCatalogProduct.getProductDiscounts.getProductDiscounts");

    final Query query = em.createNativeQuery(queryName, OcProductDiscount.class);

    query.setParameter("product_id", product_id);
    query.setParameter("customer_group_id", customer_group_id);

    return query.getResultList();
  }

  /* *
   * ModelCatalogProduct.getProfiles.getProfiles
   * SELECT rd.* FROM oc_product_recurring pr JOIN oc_recurring_description rd ON (rd.language_id = param0 AND rd.recurring_id = pr.recurring_id) JOIN oc_recurring r ON r.recurring_id = rd.recurring_id WHERE pr.product_id = param1 AND status = '1' AND pr.customer_group_id = 'param2' ORDER BY sort_order ASC 
   */
  @Override
  public List<ModelCatalogProduct2Dto> getProfiles(Integer product_id,Integer customer_group_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelCatalogProduct.getProfiles.getProfiles");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("product_id", product_id);
    query.setParameter("customer_group_id", customer_group_id);

    return fromListOfArrayModelCatalogProduct2Dto(query.getResultList());
  }

  /* *
   * ModelCatalogProduct.getProfile.getProfile
   * SELECT r.recurring_id, r.price, r.frequency, r.duration, r.cycle, r.trial_status, r.trial_price, r.trial_frequency, r.trial_duration, r.trial_cycle, r.status, r.sort_order, pr.product_id, pr.recurring_id as recurring_id0, pr.customer_group_id FROM oc_recurring r JOIN oc_product_recurring pr ON( pr.recurring_id = r.recurring_id AND pr.product_id = 'param0' ) WHERE pr.recurring_id = 'param1' AND status = '1' AND pr.customer_group_id = 'param2' 
   */
  @Override
  public List<ModelCatalogProduct3Dto> getProfile(Integer recurring_id,Integer customer_group_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelCatalogProduct.getProfile.getProfile");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("recurring_id", recurring_id);
    query.setParameter("customer_group_id", customer_group_id);

    return fromListOfArrayModelCatalogProduct3Dto(query.getResultList());
  }

  /* *
   * ModelCatalogProduct.getProductLayoutId.getProductLayoutId
   * SELECT a FROM oc_product_to_layout  a WHERE product_id = 'param0' AND store_id = 'param1'  
   */
  @Override
  public List<OcProductToLayout> getProductLayoutId(Integer product_id,Integer store_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelCatalogProduct.getProductLayoutId.getProductLayoutId");

    final Query query = em.createNativeQuery(queryName, OcProductToLayout.class);

    query.setParameter("product_id", product_id);
    query.setParameter("store_id", store_id);

    return query.getResultList();
  }

  /* *
   * ModelCatalogProduct.getProduct.getProduct
   * SELECT DISTINCT *, pd.name AS name, p.image, m.name AS manufacturer, (SELECT price FROM oc_product_discount pd2 WHERE pd2.product_id = p.product_id AND pd2.customer_group_id = 'param0' AND pd2.quantity = '1' AND ((pd2.date_start = '0000-00-00' OR pd2.date_start < NOW()) AND (pd2.date_end = '0000-00-00' OR pd2.date_end > NOW())) ORDER BY pd2.priority ASC, pd2.price ASC LIMIT 1) AS discount, (SELECT price FROM oc_product_special ps WHERE ps.product_id = p.product_id AND ps.customer_group_id = 'param1' AND ((ps.date_start = '0000-00-00' OR ps.date_start < NOW()) AND (ps.date_end = '0000-00-00' OR ps.date_end > NOW())) ORDER BY ps.priority ASC, ps.price ASC LIMIT 1) AS special, (SELECT points FROM oc_product_reward pr WHERE pr.product_id = p.product_id AND pr.customer_group_id = 'param2') AS reward, (SELECT ss.name FROM oc_stock_status ss WHERE ss.stock_status_id = p.stock_status_id AND ss.language_id = 'param3') AS stock_status, (SELECT wcd.unit FROM oc_weight_class_description wcd WHERE p.weight_class_id = wcd.weight_class_id AND wcd.language_id = 'param4') AS weight_class, (SELECT lcd.unit FROM oc_length_class_description lcd WHERE p.length_class_id = lcd.length_class_id AND lcd.language_id = 'param5') AS length_class, (SELECT AVG(rating) AS total FROM oc_review r1 WHERE r1.product_id = p.product_id AND r1.status = '1' GROUP BY r1.product_id) AS rating, (SELECT COUNT(*) AS total FROM oc_review r2 WHERE r2.product_id = p.product_id AND r2.status = '1' GROUP BY r2.product_id) AS reviews, p.sort_order FROM oc_product p LEFT JOIN oc_product_description pd ON (p.product_id = pd.product_id) LEFT JOIN oc_product_to_store p2s ON (p.product_id = p2s.product_id) LEFT JOIN oc_manufacturer m ON (p.manufacturer_id = m.manufacturer_id) WHERE p.product_id = 'param6' AND pd.language_id = 'param7' AND p.status = '1' AND p.date_available <= NOW() AND p2s.store_id = 'param8' 
   */
  @Override
  public List<ModelCatalogProduct4Dto> getProduct(String customer_group_id,Integer language_id,Integer product_id,Integer store_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelCatalogProduct.getProduct.getProduct");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("customer_group_id", customer_group_id);
    query.setParameter("language_id", language_id);
    query.setParameter("product_id", product_id);
    query.setParameter("store_id", store_id);

    return fromListOfArrayModelCatalogProduct4Dto(query.getResultList());
  }

  /* *
   * ModelCatalogProduct.getCategories.getCategories
   * SELECT a FROM oc_product_to_category  a WHERE product_id = 'param0'  
   */
  @Override
  public List<OcProductToCategory> getCategories(Integer product_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelCatalogProduct.getCategories.getCategories");

    final Query query = em.createNativeQuery(queryName, OcProductToCategory.class);

    query.setParameter("product_id", product_id);

    return query.getResultList();
  }

  /* *
   * ModelCatalogProduct.getProductAttributes.getProductAttributeGroupQuery
   * SELECT ag.attribute_group_id, agd.name FROM oc_product_attribute pa LEFT JOIN oc_attribute a ON (pa.attribute_id = a.attribute_id) LEFT JOIN oc_attribute_group ag ON (a.attribute_group_id = ag.attribute_group_id) LEFT JOIN oc_attribute_group_description agd ON (ag.attribute_group_id = agd.attribute_group_id) WHERE pa.product_id = 'param0' AND agd.language_id = 'param1' GROUP BY ag.attribute_group_id ORDER BY ag.sort_order, agd.name 
   */
  @Override
  public List<ModelCatalogProduct5Dto> getProductAttributeGroupQuery(Integer product_id,Integer language_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelCatalogProduct.getProductAttributes.getProductAttributeGroupQuery");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("product_id", product_id);
    query.setParameter("language_id", language_id);

    return fromListOfArrayModelCatalogProduct5Dto(query.getResultList());
  }

  /* *
   * ModelCatalogProduct.getProductImages.getProductImages
   * SELECT a FROM oc_product_image  a WHERE product_id = 'param0' ORDER BY sort_order ASC 
   */
  @Override
  public List<OcProductImage> getProductImages(Integer product_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelCatalogProduct.getProductImages.getProductImages");

    final Query query = em.createNativeQuery(queryName, OcProductImage.class);

    query.setParameter("product_id", product_id);

    return query.getResultList();
  }

  /* *
   * ModelCatalogProduct.getProductOptions.getProductOptionQuery
   * SELECT po.product_option_id, po.product_id, po.option_id, po.value, po.required, o.option_id as option_id0, o.type, o.sort_order, od.option_id as option_id01, od.language_id, od.name FROM oc_product_option po LEFT JOIN "oc_option" o ON( po.option_id = o.option_id ) LEFT JOIN oc_option_description od ON( o.option_id = od.option_id ) WHERE po.product_id = 'param0' AND od.language_id = 'param1' ORDER BY o.sort_order 
   */
  @Override
  public List<ModelCatalogProduct6Dto> getProductOptionQuery(Integer product_id,Integer language_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelCatalogProduct.getProductOptions.getProductOptionQuery");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("product_id", product_id);
    query.setParameter("language_id", language_id);

    return fromListOfArrayModelCatalogProduct6Dto(query.getResultList());
  }

  /* *
   * ModelCatalogProduct.getProductRelated.getProductRelated
   * SELECT pr.product_id, pr.related_id, p.product_id as product_id0, p.model, p.sku, p.upc, p.ean, p.jan, p.isbn, p.mpn, p.location, p.quantity, p.stock_status_id, p.image, p.manufacturer_id, p.shipping, p.price, p.points, p.tax_class_id, p.date_available, p.weight, p.weight_class_id, p.length, p.width, p.height, p.length_class_id, p.subtract, p.minimum, p.sort_order, p.status, p.viewed, p.date_added, p.date_modified, p2s.product_id as product_id01, p2s.store_id FROM oc_product_related pr LEFT JOIN oc_product p ON( pr.related_id = p.product_id ) LEFT JOIN oc_product_to_store p2s ON( p.product_id = p2s.product_id ) WHERE pr.product_id = 'param0' AND p.status = '1' AND p.date_available <= NOW( ) AND p2s.store_id = 'param1' 
   */
  @Override
  public List<ModelCatalogProduct7Dto> getProductRelated(Integer product_id,Integer store_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelCatalogProduct.getProductRelated.getProductRelated");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("product_id", product_id);
    query.setParameter("store_id", store_id);

    return fromListOfArrayModelCatalogProduct7Dto(query.getResultList());
  }

  /* *
   * ModelCatalogProduct.getBestSellerProducts.getBestSellerProducts
   * SELECT op.product_id, SUM(op.quantity) AS total FROM oc_order_product op LEFT JOIN "oc_order" o ON (op.order_id = o.order_id) LEFT JOIN "oc_product" p ON (op.product_id = p.product_id) LEFT JOIN oc_product_to_store p2s ON (p.product_id = p2s.product_id) WHERE o.order_status_id > '0' AND p.status = '1' AND p.date_available <= NOW() AND p2s.store_id = 'param0' GROUP BY op.product_id ORDER BY total DESC LIMIT param1 
   */
  @Override
  public List<ModelCatalogProduct8Dto> getBestSellerProducts(Integer store_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelCatalogProduct.getBestSellerProducts.getBestSellerProducts");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("store_id", store_id);

    return fromListOfArrayModelCatalogProduct8Dto(query.getResultList());
  }

  /*
   * Java8 version
   */
  private static List<ModelCatalogProduct0Dto> fromListOfArrayModelCatalogProduct0Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelCatalogProduct0Dto.fromArray(x)).collect(Collectors.toList());
  }

  /*
   * Java8 version
   */
  private static List<ModelCatalogProduct1Dto> fromListOfArrayModelCatalogProduct1Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelCatalogProduct1Dto.fromArray(x)).collect(Collectors.toList());
  }

  /*
   * Java8 version
   */
  private static List<ModelCatalogProduct2Dto> fromListOfArrayModelCatalogProduct2Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelCatalogProduct2Dto.fromArray(x)).collect(Collectors.toList());
  }

  /*
   * Java8 version
   */
  private static List<ModelCatalogProduct3Dto> fromListOfArrayModelCatalogProduct3Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelCatalogProduct3Dto.fromArray(x)).collect(Collectors.toList());
  }

  /*
   * Java8 version
   */
  private static List<ModelCatalogProduct4Dto> fromListOfArrayModelCatalogProduct4Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelCatalogProduct4Dto.fromArray(x)).collect(Collectors.toList());
  }

  /*
   * Java8 version
   */
  private static List<ModelCatalogProduct5Dto> fromListOfArrayModelCatalogProduct5Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelCatalogProduct5Dto.fromArray(x)).collect(Collectors.toList());
  }

  /*
   * Java8 version
   */
  private static List<ModelCatalogProduct6Dto> fromListOfArrayModelCatalogProduct6Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelCatalogProduct6Dto.fromArray(x)).collect(Collectors.toList());
  }

  /*
   * Java8 version
   */
  private static List<ModelCatalogProduct7Dto> fromListOfArrayModelCatalogProduct7Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelCatalogProduct7Dto.fromArray(x)).collect(Collectors.toList());
  }

  /*
   * Java8 version
   */
  private static List<ModelCatalogProduct8Dto> fromListOfArrayModelCatalogProduct8Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelCatalogProduct8Dto.fromArray(x)).collect(Collectors.toList());
  }
}