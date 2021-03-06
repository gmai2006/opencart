package com.opencart.extension.payment;

import java.util.List;

import com.opencart.entity.*;

public interface ModelExtensionPaymentSagePayServerDao {
   public List<OcOrderRecurring> getProfile(Integer order_recurring_id);

   public List<OcZoneToGeoZone> getMethod(Integer geo_zone_id,Integer country_id);

   public List<OcOrderRecurring> getRecurringOrders(Integer order_id);
}