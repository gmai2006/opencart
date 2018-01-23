package com.opencart.extension.payment;

import java.util.List;

import com.opencart.entity.*;

public interface ModelExtensionPaymentKlarnaCheckoutDao {
   public List<OcCountry> getCountryByIsoCode2(String iso_code_2);

   public List<OcZone> getZoneByCode(String code,Integer country_id);

   public List<OcCountry> getCountryByIsoCode3(String iso_code_3);
}