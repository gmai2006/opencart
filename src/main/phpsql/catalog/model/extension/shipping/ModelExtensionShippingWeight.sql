getQuote1=$this->db->query("SELECT * FROM ".DB_PREFIX."zone_to_geo_zone WHERE geo_zone_id = '".(int)$result['geo_zone_id']."' AND country_id = '".(int)$address['country_id']."' AND (zone_id = '".(int)$address['zone_id']."' OR zone_id = '0')")
#END
getQuote=$this->db->query("SELECT * FROM ".DB_PREFIX."geo_zone ORDER BY name")
#END
