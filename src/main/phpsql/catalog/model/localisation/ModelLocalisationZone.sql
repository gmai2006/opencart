getZonesByCountryId=$this->db->query("SELECT * FROM ".DB_PREFIX."zone WHERE country_id = '".(int)$country_id."' AND status = '1' ORDER BY name")
#END
getZone=$this->db->query("SELECT * FROM ".DB_PREFIX."zone WHERE zone_id = '".(int)$zone_id."' AND status = '1'")
#END
