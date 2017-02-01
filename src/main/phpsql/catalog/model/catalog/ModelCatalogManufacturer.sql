getManufacturer=$this->db->query("SELECT * FROM ".DB_PREFIX."manufacturer m LEFT JOIN ".DB_PREFIX."manufacturer_to_store m2s ON (m.manufacturer_id = m2s.manufacturer_id) WHERE m.manufacturer_id = '".(int)$manufacturer_id."' AND m2s.store_id = '".(int)$this->config->get('config_store_id')."'")
#END
getManufacturers=$this->db->query("SELECT * FROM ".DB_PREFIX."manufacturer m LEFT JOIN ".DB_PREFIX."manufacturer_to_store m2s ON (m.manufacturer_id = m2s.manufacturer_id) WHERE m2s.store_id = '".(int)$this->config->get('config_store_id')."' ORDER BY name")
#END
