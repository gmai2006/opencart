package com.opencart.extension.payment;

import java.util.List;
import com.opencart.entity.*;

public interface ModelExtensionPaymentPayzaService {
   public List<OcZoneToGeoZone> getMethod(Integer geo_zone_id,Integer country_id);
}