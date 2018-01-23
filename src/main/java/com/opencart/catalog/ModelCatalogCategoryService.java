package com.opencart.catalog;

import java.util.List;
import com.opencart.entity.*;

public interface ModelCatalogCategoryService {
   public List<ModelCatalogCategory0Dto> getFilterQuery(Integer filter_group_id,Integer language_id);

   public List<Integer> getQuery(Integer category_id);

   public java.math.BigInteger getTotalCategoriesByCategoryId(Integer parent_id,Integer store_id);

   public List<OcCategoryToLayout> getCategoryLayoutId(Integer category_id,Integer store_id);

   public List<ModelCatalogCategory1Dto> getFilterGroupQuery(Integer language_id);

   public List<ModelCatalogCategory2Dto> getCategory(Integer category_id,Integer language_id,Integer store_id);

   public List<ModelCatalogCategory2Dto> getCategories(Integer parent_id,Integer language_id,Integer store_id);
}