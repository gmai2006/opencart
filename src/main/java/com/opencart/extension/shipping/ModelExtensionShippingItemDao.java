package com.opencart.extension.shipping;

import java.util.List;

import com.opencart.entity.*;

public interface ModelExtensionShippingItemDao {
   public List<OcZoneToGeoZone> getQuote(Integer geo_zone_id,Integer country_id);
}