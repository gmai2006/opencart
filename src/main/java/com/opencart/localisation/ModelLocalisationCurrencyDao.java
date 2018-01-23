package com.opencart.localisation;

import java.util.List;

import com.opencart.entity.*;

public interface ModelLocalisationCurrencyDao {
   public List<OcCurrency> getCurrencies();

   public List<OcCurrency> getCurrencyByCode(String code);
}