package com.opencart.account;

import java.util.List;

import com.opencart.entity.*;

public interface ModelAccountAddressDao {
   public List<OcAddress> getAddressQuery(Integer address_id,Integer customer_id);

   public java.math.BigInteger getTotalAddresses(Integer customer_id);

   public List<OcZone> getZoneQuery(Integer zone_id);

   public List<OcZone> getZoneQuery0(Integer zone_id);

   public List<OcAddress> getQuery(Integer customer_id);

   public List<OcCountry> getCountryQuery(Integer country_id);

   public List<OcCountry> getCountryQuery1(Integer country_id);
}