package com.opencart.localisation;

import java.util.List;
import com.opencart.entity.*;

public interface ModelLocalisationCountryService {
   public List<OcCountry> getCountries();

   public List<OcCountry> getCountry(Integer country_id);
}