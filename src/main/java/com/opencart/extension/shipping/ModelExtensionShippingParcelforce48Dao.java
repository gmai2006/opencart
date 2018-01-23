package com.opencart.extension.shipping;

import java.util.List;

import com.opencart.entity.*;

public interface ModelExtensionShippingParcelforce48Dao {
   public List<OcZoneToGeoZone> getQuote(Integer geo_zone_id,Integer country_id);
}