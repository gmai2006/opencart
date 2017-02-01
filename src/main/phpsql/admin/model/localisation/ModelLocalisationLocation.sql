deleteLocation=$this->db->query("DELETE FROM ".DB_PREFIX."location WHERE location_id = ".(int)$location_id)
#END
getLocation=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."location WHERE location_id = '".(int)$location_id."'")
#END
editLocation=$this->db->query("UPDATE ".DB_PREFIX."location SET name = '".$this->db->escape($data['name'])."', address = '".$this->db->escape($data['address'])."', geocode = '".$this->db->escape($data['geocode'])."', telephone = '".$this->db->escape($data['telephone'])."', fax = '".$this->db->escape($data['fax'])."', image = '".$this->db->escape($data['image'])."', open = '".$this->db->escape($data['open'])."', comment = '".$this->db->escape($data['comment'])."' WHERE location_id = '".(int)$location_id."'")
#END
addLocation=$this->db->query("INSERT INTO ".DB_PREFIX."location SET name = '".$this->db->escape($data['name'])."', address = '".$this->db->escape($data['address'])."', geocode = '".$this->db->escape($data['geocode'])."', telephone = '".$this->db->escape($data['telephone'])."', fax = '".$this->db->escape($data['fax'])."', image = '".$this->db->escape($data['image'])."', open = '".$this->db->escape($data['open'])."', comment = '".$this->db->escape($data['comment'])."'")
#END
getTotalLocations=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."location")
#END
