package com.opencart.extension.payment;

import java.util.List;

import com.opencart.entity.*;

public interface ModelExtensionPaymentTwoCheckoutDao {
   public List<OcZoneToGeoZone> getMethod(Integer geo_zone_id,Integer country_id);
}