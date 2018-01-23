package com.opencart.extension.openbay;

import java.util.List;
import com.opencart.entity.*;

public interface ModelExtensionOpenBayEbayProductService {
   public List<Integer> lengthClassExists(String title);

   public List<OcProductOption> getProductOption(Integer product_id,Integer option_id);

   public List<ModelExtensionOpenBayEbayProduct0Dto> getOption(String name);

   public List<OcAttributeGroupDescription> getQry(String name,Integer language_id);

   public List<OcAttributeDescription> getQry0(String name,Integer language_id,String attribute_group_id);

   public List<OcProductOptionValue> getProductOptionValue(Integer product_id,Integer option_id,Integer product_option_id,Integer option_value_id);

   public List<OcProductAttribute> attributeAdd(Integer product_id,Integer attribute_id,Integer language_id);

   public List<OcManufacturer> getQry1(String name);

   public List<Integer> getQry2();

   public List<Integer> getQry22();

   public List<OcCategoryPath> repairCategories(Integer category_id);

   public List<Integer> getQry23();

   public List<Integer> weightClassExists(String title);

   public List<OcCategory> importItems(Integer parent_id,String name);

   public List<OcOption> createOption(Integer option_id);

   public List<ModelExtensionOpenBayEbayProduct1Dto> getOptionValue(String name,Integer option_id);
}