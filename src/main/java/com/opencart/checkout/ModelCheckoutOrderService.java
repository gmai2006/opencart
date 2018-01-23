package com.opencart.checkout;

import java.util.List;
import com.opencart.entity.*;

public interface ModelCheckoutOrderService {
   public List<OcOrderVoucher> getOrderVoucherQuery(Integer order_id);

   public List<OcOrderOption> getOptionQuery(Integer order_id,Integer order_product_id);

   public List<OcOrderProduct> getProductQuery(Integer order_id);

   public List<OcOrderProduct> getOrderProductQuery(Integer order_id);

   public List<ModelCheckoutOrder0Dto> getOrderQuery(Integer order_id);

   public List<OcOrderTotal> getOrderTotalQuery(Integer order_id);

   public java.math.BigInteger getProductDownloadQuery(Integer product_id);

   public List<OcCountry> getCountryQuery(Integer country_id);

   public List<OcZone> getZoneQuery(Integer zone_id);

   public List<OcOrderOption> getOrderOptionQuery(Integer order_id,Integer order_product_id);

   public List<OcOrderStatus> getOrderStatusQuery(Integer order_status_id,Integer language_id);
}