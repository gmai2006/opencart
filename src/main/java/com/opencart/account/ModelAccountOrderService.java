package com.opencart.account;

import java.util.List;
import com.opencart.entity.*;

public interface ModelAccountOrderService {
   public List<OcOrderVoucher> getOrderVouchers(Integer order_id);

   public List<OcZone> getZoneQuery(Integer zone_id);

   public List<OcOrderProduct> getOrderProduct(Integer order_id,Integer order_product_id);

   public List<OcOrderOption> getOrderOptions(Integer order_id,Integer order_product_id);

   public java.math.BigInteger getTotalOrderProductsByOrderId(Integer order_id);

   public List<OcOrderProduct> getOrderProducts(Integer order_id);

   public List<OcCountry> getCountryQuery(Integer country_id);

   public java.math.BigInteger getTotalOrderVouchersByOrderId(Integer order_id);

   public List<ModelAccountOrder0Dto> getOrderHistories(Integer order_id,Integer language_id);

   public List<OcOrderTotal> getOrderTotals(Integer order_id);

   public List<ModelAccountOrder1Dto> getOrders(Integer customer_id,Integer store_id,Integer language_id);

   public List<OcOrder> getOrderQuery(Integer order_id,Integer customer_id);

   public java.math.BigInteger getTotalOrders(Integer customer_id,Integer store_id);
}