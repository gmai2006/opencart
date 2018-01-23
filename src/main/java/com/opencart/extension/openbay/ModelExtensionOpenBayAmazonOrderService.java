package com.opencart.extension.openbay;

import java.util.List;
import com.opencart.entity.*;

public interface ModelExtensionOpenBayAmazonOrderService {
   public List<ModelExtensionOpenBayAmazonOrder0Dto> getProductOptionsByVar(Integer product_option_value_id,String language_id);

   public List<Integer> getZoneId(String name);

   public List<Integer> addAmazonOrderProducts(String model,Integer order_id);

   public List<Integer> getCountryId(String iso_code_2);

   public List<Integer> getOrderStatus(Integer order_id);

   public List<String> getCountryName(String iso_code_2);
}