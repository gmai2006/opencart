addGeoZone=$this->db->query("INSERT INTO ".DB_PREFIX."geo_zone SET name = '".$this->db->escape($data['name'])."', description = '".$this->db->escape($data['description'])."', date_added = NOW()")
#END
editGeoZone3=$this->db->query("INSERT INTO ".DB_PREFIX."zone_to_geo_zone SET country_id = '".(int)$value['country_id']."', zone_id = '".(int)$value['zone_id']."', geo_zone_id = '".(int)$geo_zone_id."', date_added = NOW()")
#END
getGeoZone=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."geo_zone WHERE geo_zone_id = '".(int)$geo_zone_id."'")
#END
editGeoZone=$this->db->query("UPDATE ".DB_PREFIX."geo_zone SET name = '".$this->db->escape($data['name'])."', description = '".$this->db->escape($data['description'])."', date_modified = NOW() WHERE geo_zone_id = '".(int)$geo_zone_id."'")
#END
getTotalGeoZones=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."geo_zone")
#END
editGeoZone1=$this->db->query("DELETE FROM ".DB_PREFIX."zone_to_geo_zone WHERE geo_zone_id = '".(int)$geo_zone_id."'")
#END
getGeoZones=$this->db->query("SELECT * FROM ".DB_PREFIX."geo_zone ORDER BY name ASC")
#END
getTotalZoneToGeoZoneByZoneId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."zone_to_geo_zone WHERE zone_id = '".(int)$zone_id."'")
#END
editGeoZone2=$this->db->query("DELETE FROM ".DB_PREFIX."zone_to_geo_zone WHERE geo_zone_id = '".(int)$geo_zone_id."' AND country_id = '".(int)$value['country_id']."' AND zone_id = '".(int)$value['zone_id']."'")
#END
addGeoZone2=$this->db->query("INSERT INTO ".DB_PREFIX."zone_to_geo_zone SET country_id = '".(int)$value['country_id']."', zone_id = '".(int)$value['zone_id']."', geo_zone_id = '".(int)$geo_zone_id."', date_added = NOW()")
#END
getZoneToGeoZones=$this->db->query("SELECT * FROM ".DB_PREFIX."zone_to_geo_zone WHERE geo_zone_id = '".(int)$geo_zone_id."'")
#END
getTotalZoneToGeoZoneByGeoZoneId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."zone_to_geo_zone WHERE geo_zone_id = '".(int)$geo_zone_id."'")
#END
addGeoZone1=$this->db->query("DELETE FROM ".DB_PREFIX."zone_to_geo_zone WHERE geo_zone_id = '".(int)$geo_zone_id."' AND country_id = '".(int)$value['country_id']."' AND zone_id = '".(int)$value['zone_id']."'")
#END
deleteGeoZone1=$this->db->query("DELETE FROM ".DB_PREFIX."zone_to_geo_zone WHERE geo_zone_id = '".(int)$geo_zone_id."'")
#END
getTotalZoneToGeoZoneByCountryId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."zone_to_geo_zone WHERE country_id = '".(int)$country_id."'")
#END
deleteGeoZone=$this->db->query("DELETE FROM ".DB_PREFIX."geo_zone WHERE geo_zone_id = '".(int)$geo_zone_id."'")
#END
