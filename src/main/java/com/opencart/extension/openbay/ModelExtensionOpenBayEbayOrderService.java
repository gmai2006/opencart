package com.opencart.extension.openbay;

import java.util.List;
import com.opencart.entity.*;

public interface ModelExtensionOpenBayEbayOrderService {
   public List<OcOrder> hasAddress(Integer order_id);

   public List<OcOrderStatus> getOrderStatusQuery(Integer order_status_id,Integer language_id);

   public List<OcOrderTotal> getOrderTotalQuery(Integer order_id);

   public List<OcProduct> addOrderHistory(Integer product_id);

   public List<Integer> getHistory(Integer order_id);

   public List<OcCountry> getCountryAddressFormat(String iso_code_2);

   public List<OcOrderProduct> getOrderProductQuery(Integer order_id);

   public List<OcOrderOption> getOrderOptionQuery(Integer order_id,Integer order_product_id);

   public List<OcOrderStatus> update(Integer order_status_id,Integer language_id);
}