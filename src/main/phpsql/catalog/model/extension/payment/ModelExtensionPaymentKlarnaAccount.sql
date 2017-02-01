getMethod=$this->db->query("SELECT * FROM ".DB_PREFIX."zone_to_geo_zone WHERE geo_zone_id = '".(int)$klarna_account[$address['iso_code_3']]['geo_zone_id']."' AND country_id = '".(int)$address['country_id']."' AND (zone_id = '".(int)$address['zone_id']."' OR zone_id = '0')")
#END
