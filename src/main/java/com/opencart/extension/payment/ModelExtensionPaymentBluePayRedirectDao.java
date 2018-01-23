package com.opencart.extension.payment;

import java.util.List;

import com.opencart.entity.*;

public interface ModelExtensionPaymentBluePayRedirectDao {
   public List<OcZoneToGeoZone> getMethod(Integer geo_zone_id,Integer country_id);
}