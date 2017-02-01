addManufacturer2=$this->db->query("INSERT INTO ".DB_PREFIX."manufacturer_to_store SET manufacturer_id = '".(int)$manufacturer_id."', store_id = '".(int)$store_id."'")
#END
addManufacturer3=$this->db->query("INSERT INTO ".DB_PREFIX."url_alias SET query = 'manufacturer_id=".(int)$manufacturer_id."', keyword = '".$this->db->escape($data['keyword'])."'")
#END
getTotalManufacturers=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."manufacturer")
#END
deleteManufacturer=$this->db->query("DELETE FROM ".DB_PREFIX."manufacturer WHERE manufacturer_id = '".(int)$manufacturer_id."'")
#END
addManufacturer=$this->db->query("INSERT INTO ".DB_PREFIX."manufacturer SET name = '".$this->db->escape($data['name'])."', sort_order = '".(int)$data['sort_order']."'")
#END
deleteManufacturer1=$this->db->query("DELETE FROM ".DB_PREFIX."manufacturer_to_store WHERE manufacturer_id = '".(int)$manufacturer_id."'")
#END
deleteManufacturer2=$this->db->query("DELETE FROM ".DB_PREFIX."url_alias WHERE query = 'manufacturer_id=".(int)$manufacturer_id."'")
#END
editManufacturer1=$this->db->query("UPDATE ".DB_PREFIX."manufacturer SET image = '".$this->db->escape($data['image'])."' WHERE manufacturer_id = '".(int)$manufacturer_id."'")
#END
editManufacturer2=$this->db->query("DELETE FROM ".DB_PREFIX."manufacturer_to_store WHERE manufacturer_id = '".(int)$manufacturer_id."'")
#END
getManufacturer=$this->db->query("SELECT DISTINCT *, (SELECT keyword FROM ".DB_PREFIX."url_alias WHERE query = 'manufacturer_id=".(int)$manufacturer_id."') AS keyword FROM ".DB_PREFIX."manufacturer WHERE manufacturer_id = '".(int)$manufacturer_id."'")
#END
editManufacturer5=$this->db->query("INSERT INTO ".DB_PREFIX."url_alias SET query = 'manufacturer_id=".(int)$manufacturer_id."', keyword = '".$this->db->escape($data['keyword'])."'")
#END
editManufacturer=$this->db->query("UPDATE ".DB_PREFIX."manufacturer SET name = '".$this->db->escape($data['name'])."', sort_order = '".(int)$data['sort_order']."' WHERE manufacturer_id = '".(int)$manufacturer_id."'")
#END
editManufacturer3=$this->db->query("INSERT INTO ".DB_PREFIX."manufacturer_to_store SET manufacturer_id = '".(int)$manufacturer_id."', store_id = '".(int)$store_id."'")
#END
getManufacturerStores=$this->db->query("SELECT * FROM ".DB_PREFIX."manufacturer_to_store WHERE manufacturer_id = '".(int)$manufacturer_id."'")
#END
editManufacturer4=$this->db->query("DELETE FROM ".DB_PREFIX."url_alias WHERE query = 'manufacturer_id=".(int)$manufacturer_id."'")
#END
addManufacturer1=$this->db->query("UPDATE ".DB_PREFIX."manufacturer SET image = '".$this->db->escape($data['image'])."' WHERE manufacturer_id = '".(int)$manufacturer_id."'")
#END
