package com.opencart.catalog;

import java.util.List;
import com.opencart.entity.*;

public interface ModelCatalogProductService {
   public List<ModelCatalogProduct0Dto> getProductAttributeQuery(Integer product_id,Integer attribute_group_id,Integer language_id);

   public java.math.BigInteger getTotalProductSpecials(Integer store_id,Integer customer_group_id);

   public List<Integer> getLatestProducts(Integer store_id);

   public List<ModelCatalogProduct1Dto> getProductOptionValueQuery(Integer product_id,Integer product_option_id,Integer language_id);

   public List<Integer> getPopularProducts(Integer store_id);

   public List<OcProductDiscount> getProductDiscounts(Integer product_id,Integer customer_group_id);

   public List<ModelCatalogProduct2Dto> getProfiles(Integer product_id,Integer customer_group_id);

   public List<ModelCatalogProduct3Dto> getProfile(Integer recurring_id,Integer customer_group_id);

   public List<OcProductToLayout> getProductLayoutId(Integer product_id,Integer store_id);

   public List<ModelCatalogProduct4Dto> getProduct(String customer_group_id,Integer language_id,Integer product_id,Integer store_id);

   public List<OcProductToCategory> getCategories(Integer product_id);

   public List<ModelCatalogProduct5Dto> getProductAttributeGroupQuery(Integer product_id,Integer language_id);

   public List<OcProductImage> getProductImages(Integer product_id);

   public List<ModelCatalogProduct6Dto> getProductOptionQuery(Integer product_id,Integer language_id);

   public List<ModelCatalogProduct7Dto> getProductRelated(Integer product_id,Integer store_id);

   public List<ModelCatalogProduct8Dto> getBestSellerProducts(Integer store_id);
}