package com.opencart.extension.openbay;

import java.util.List;

import com.opencart.entity.*;

public interface ModelExtensionOpenBayEtsyOrderDao {
   public List<OcCountry> create(String iso_code_2);
}