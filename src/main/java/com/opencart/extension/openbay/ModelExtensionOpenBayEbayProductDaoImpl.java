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
package com.opencart.extension.openbay;

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
public class ModelExtensionOpenBayEbayProductDaoImpl implements ModelExtensionOpenBayEbayProductDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelExtensionOpenBayEbayProductDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelExtensionOpenBayEbayProduct.lengthClassExists.lengthClassExists
   * SELECT "length_class_id" FROM "oc_length_class_description" WHERE LCASE("title") = 'param0' LIMIT 1 
   */
  @Override
  public List<Integer> lengthClassExists(String title) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayEbayProduct.lengthClassExists.lengthClassExists");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("title", title);

    return query.getResultList();
  }

  /* *
   * ModelExtensionOpenBayEbayProduct.getProductOption.getProductOption
   * SELECT a FROM oc_product_option  a WHERE product_id = 'param0' AND option_id = 'param1'  LIMIT 1
   */
  @Override
  public List<OcProductOption> getProductOption(Integer product_id,Integer option_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayEbayProduct.getProductOption.getProductOption");

    final Query query = em.createNativeQuery(queryName, OcProductOption.class);

    query.setParameter("product_id", product_id);
    query.setParameter("option_id", option_id);

    return query.getResultList();
  }

  /* *
   * ModelExtensionOpenBayEbayProduct.getOption.getOption
   * SELECT "o".option_id, "o".type, "o".sort_order, "od".option_id as option_id0, "od".language_id, "od".name FROM "oc_option" "o" LEFT JOIN "oc_option_description" "od" ON( "od"."option_id" = "o"."option_id" ) WHERE "od"."name" = 'param0'  LIMIT 1 
   */
  @Override
  public List<ModelExtensionOpenBayEbayProduct0Dto> getOption(String name) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayEbayProduct.getOption.getOption");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("name", name);

    return fromListOfArrayModelExtensionOpenBayEbayProduct0Dto(query.getResultList());
  }

  /* *
   * ModelExtensionOpenBayEbayProduct.attributeGroupExists.getQry
   * SELECT a FROM "oc_attribute_group_description"  a WHERE "name" = 'param0' AND "language_id" = 'param1'  LIMIT 1
   */
  @Override
  public List<OcAttributeGroupDescription> getQry(String name,Integer language_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayEbayProduct.attributeGroupExists.getQry");

    final Query query = em.createNativeQuery(queryName, OcAttributeGroupDescription.class);

    query.setParameter("name", name);
    query.setParameter("language_id", language_id);

    return query.getResultList();
  }

  /* *
   * ModelExtensionOpenBayEbayProduct.attributeExists.getQry
   * SELECT a FROM "oc_attribute_description" "ad" , "oc_attribute" "a"  a WHERE "ad"."name" = 'param0' AND "ad"."language_id" = 'param1' AND "a"."attribute_id" = "ad"."attribute_id" AND "a"."attribute_group_id" = 'param2'  LIMIT 1
   */
  @Override
  public List<OcAttributeDescription> getQry0(String name,Integer language_id,String attribute_group_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayEbayProduct.attributeExists.getQry");

    final Query query = em.createNativeQuery(queryName, OcAttributeDescription.class);

    query.setParameter("name", name);
    query.setParameter("language_id", language_id);
    query.setParameter("attribute_group_id", attribute_group_id);

    return query.getResultList();
  }

  /* *
   * ModelExtensionOpenBayEbayProduct.getProductOptionValue.getProductOptionValue
   * SELECT a FROM "oc_product_option_value"  a WHERE "product_id" = 'param0' AND "option_id" = 'param1' AND "product_option_id" = 'param2' AND "option_value_id" = 'param3'  LIMIT 1
   */
  @Override
  public List<OcProductOptionValue> getProductOptionValue(Integer product_id,Integer option_id,Integer product_option_id,Integer option_value_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayEbayProduct.getProductOptionValue.getProductOptionValue");

    final Query query = em.createNativeQuery(queryName, OcProductOptionValue.class);

    query.setParameter("product_id", product_id);
    query.setParameter("option_id", option_id);
    query.setParameter("product_option_id", product_option_id);
    query.setParameter("option_value_id", option_value_id);

    return query.getResultList();
  }

  /* *
   * ModelExtensionOpenBayEbayProduct.attributeAdd.attributeAdd
   * SELECT a FROM "oc_product_attribute"  a WHERE "product_id" = 'param0' AND "attribute_id" = 'param1' AND "language_id" = 'param2'  
   */
  @Override
  public List<OcProductAttribute> attributeAdd(Integer product_id,Integer attribute_id,Integer language_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayEbayProduct.attributeAdd.attributeAdd");

    final Query query = em.createNativeQuery(queryName, OcProductAttribute.class);

    query.setParameter("product_id", product_id);
    query.setParameter("attribute_id", attribute_id);
    query.setParameter("language_id", language_id);

    return query.getResultList();
  }

  /* *
   * ModelExtensionOpenBayEbayProduct.manufacturerExists.getQry
   * SELECT a FROM "oc_manufacturer"  a WHERE LCASE( "name" ) = 'param0'  LIMIT 1
   */
  @Override
  public List<OcManufacturer> getQry1(String name) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayEbayProduct.manufacturerExists.getQry");

    final Query query = em.createNativeQuery(queryName, OcManufacturer.class);

    query.setParameter("name", name);

    return query.getResultList();
  }

  /* *
   * ModelExtensionOpenBayEbayProduct.manufacturerExists.getQry2
   * SELECT "sort_order" FROM  "oc_manufacturer" ORDER BY "sort_order" DESC LIMIT 1 
   */
  @Override
  public List<Integer> getQry2() {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayEbayProduct.manufacturerExists.getQry2");

    final Query query = em.createNativeQuery(queryName);


    return query.getResultList();
  }

  /* *
   * ModelExtensionOpenBayEbayProduct.attributeExists.getQry2
   * SELECT "sort_order" FROM  "oc_attribute" ORDER BY "sort_order" DESC LIMIT 1 
   */
  @Override
  public List<Integer> getQry22() {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayEbayProduct.attributeExists.getQry2");

    final Query query = em.createNativeQuery(queryName);


    return query.getResultList();
  }

  /* *
   * ModelExtensionOpenBayEbayProduct.repairCategories.repairCategories
   * SELECT a FROM "oc_category_path"  a WHERE category_id = 'param0' ORDER BY level ASC 
   */
  @Override
  public List<OcCategoryPath> repairCategories(Integer category_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayEbayProduct.repairCategories.repairCategories");

    final Query query = em.createNativeQuery(queryName, OcCategoryPath.class);

    query.setParameter("category_id", category_id);

    return query.getResultList();
  }

  /* *
   * ModelExtensionOpenBayEbayProduct.attributeGroupExists.getQry2
   * SELECT "sort_order" FROM  "oc_attribute_group" ORDER BY "sort_order" DESC LIMIT 1 
   */
  @Override
  public List<Integer> getQry23() {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayEbayProduct.attributeGroupExists.getQry2");

    final Query query = em.createNativeQuery(queryName);


    return query.getResultList();
  }

  /* *
   * ModelExtensionOpenBayEbayProduct.weightClassExists.weightClassExists
   * SELECT "weight_class_id" FROM "oc_weight_class_description" WHERE LCASE("title") = 'param0' LIMIT 1 
   */
  @Override
  public List<Integer> weightClassExists(String title) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayEbayProduct.weightClassExists.weightClassExists");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("title", title);

    return query.getResultList();
  }

  /* *
   * ModelExtensionOpenBayEbayProduct.importItems.importItems
   * SELECT a FROM "oc_category" , "oc_category_description"  a WHERE "oc_category"."parent_id" = 'param0' AND "oc_category_description"."name" = 'param1'  LIMIT 1
   */
  @Override
  public List<OcCategory> importItems(Integer parent_id,String name) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayEbayProduct.importItems.importItems");

    final Query query = em.createNativeQuery(queryName, OcCategory.class);

    query.setParameter("parent_id", parent_id);
    query.setParameter("name", name);

    return query.getResultList();
  }

  /* *
   * ModelExtensionOpenBayEbayProduct.createOption.createOption
   * SELECT a FROM "oc_option"  a WHERE "option_id" = 'param0'  LIMIT 1
   */
  @Override
  public List<OcOption> createOption(Integer option_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayEbayProduct.createOption.createOption");

    final Query query = em.createNativeQuery(queryName, OcOption.class);

    query.setParameter("option_id", option_id);

    return query.getResultList();
  }

  /* *
   * ModelExtensionOpenBayEbayProduct.getOptionValue.getOptionValue
   * SELECT ov.option_value_id, ov.option_id, ov.image, ov.sort_order, "ovd".option_value_id as option_value_id0, "ovd".language_id, "ovd".option_id as option_id0, "ovd".name FROM "oc_option_value" ov LEFT JOIN "oc_option_value_description" "ovd" ON( "ovd"."option_value_id" = "ov"."option_value_id" ) WHERE "ovd"."name" = 'param0' AND "ovd"."option_id" = 'param1'  LIMIT 1 
   */
  @Override
  public List<ModelExtensionOpenBayEbayProduct1Dto> getOptionValue(String name,Integer option_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayEbayProduct.getOptionValue.getOptionValue");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("name", name);
    query.setParameter("option_id", option_id);

    return fromListOfArrayModelExtensionOpenBayEbayProduct1Dto(query.getResultList());
  }

  /*
   * Java8 version
   */
  private static List<ModelExtensionOpenBayEbayProduct0Dto> fromListOfArrayModelExtensionOpenBayEbayProduct0Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelExtensionOpenBayEbayProduct0Dto.fromArray(x)).collect(Collectors.toList());
  }

  /*
   * Java8 version
   */
  private static List<ModelExtensionOpenBayEbayProduct1Dto> fromListOfArrayModelExtensionOpenBayEbayProduct1Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelExtensionOpenBayEbayProduct1Dto.fromArray(x)).collect(Collectors.toList());
  }
}