package com.opencart.extension.openbay;

import java.util.List;

import com.opencart.entity.*;

public interface ModelExtensionOpenBayEbayOpenbayDao {
   public List<OcCountry> updateOrderWithConfirmedData(String iso_code_2);
}