package com.opencart.localisation;

import java.util.List;

import com.opencart.entity.*;

public interface ModelLocalisationZoneDao {
   public List<OcZone> getZonesByCountryId(Integer country_id);

   public List<OcZone> getZone(Integer zone_id);
}