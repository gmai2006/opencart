getZonesByCountryId=$this->db->query("SELECT * FROM ".DB_PREFIX."zone WHERE country_id = '".(int)$country_id."' AND status = '1' ORDER BY name")
#END
addZone=$this->db->query("INSERT INTO ".DB_PREFIX."zone SET status = '".(int)$data['status']."', name = '".$this->db->escape($data['name'])."', code = '".$this->db->escape($data['code'])."', country_id = '".(int)$data['country_id']."'")
#END
getTotalZonesByCountryId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."zone WHERE country_id = '".(int)$country_id."'")
#END
getTotalZones=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."zone")
#END
deleteZone=$this->db->query("DELETE FROM ".DB_PREFIX."zone WHERE zone_id = '".(int)$zone_id."'")
#END
editZone=$this->db->query("UPDATE ".DB_PREFIX."zone SET status = '".(int)$data['status']."', name = '".$this->db->escape($data['name'])."', code = '".$this->db->escape($data['code'])."', country_id = '".(int)$data['country_id']."' WHERE zone_id = '".(int)$zone_id."'")
#END
getZone=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."zone WHERE zone_id = '".(int)$zone_id."'")
#END
