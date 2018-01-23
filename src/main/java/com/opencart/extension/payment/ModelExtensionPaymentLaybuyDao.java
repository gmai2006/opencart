package com.opencart.extension.payment;

import java.util.List;

import com.opencart.entity.*;

public interface ModelExtensionPaymentLaybuyDao {
   public List<OcZoneToGeoZone> getQuery(Integer geo_zone_id,Integer country_id);

   public String getProduct(Integer product_id);
}