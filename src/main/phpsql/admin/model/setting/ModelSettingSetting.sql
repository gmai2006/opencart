editSettingValue=$this->db->query("UPDATE ".DB_PREFIX."setting SET `value` = '".$this->db->escape($value)."', serialized = '0'  WHERE `code` = '".$this->db->escape($code)."' AND `key` = '".$this->db->escape($key)."' AND store_id = '".(int)$store_id."'")
#END
editSetting1=$this->db->query("INSERT INTO ".DB_PREFIX."setting SET store_id = '".(int)$store_id."', `code` = '".$this->db->escape($code)."', `key` = '".$this->db->escape($key)."', `value` = '".$this->db->escape($value)."'")
#END
editSettingValue1=$this->db->query("UPDATE ".DB_PREFIX."setting SET `value` = '".$this->db->escape(json_encode($value))."', serialized = '1' WHERE `code` = '".$this->db->escape($code)."' AND `key` = '".$this->db->escape($key)."' AND store_id = '".(int)$store_id."'")
#END
getSetting=$this->db->query("SELECT * FROM ".DB_PREFIX."setting WHERE store_id = '".(int)$store_id."' AND `code` = '".$this->db->escape($code)."'")
#END
editSetting2=$this->db->query("INSERT INTO ".DB_PREFIX."setting SET store_id = '".(int)$store_id."', `code` = '".$this->db->escape($code)."', `key` = '".$this->db->escape($key)."', `value` = '".$this->db->escape(json_encode($value,true))."', serialized = '1'")
#END
editSetting=$this->db->query("DELETE FROM `".DB_PREFIX."setting` WHERE store_id = '".(int)$store_id."' AND `code` = '".$this->db->escape($code)."'")
#END
getSettingValue=$this->db->query("SELECT value FROM ".DB_PREFIX."setting WHERE store_id = '".(int)$store_id."' AND `key` = '".$this->db->escape($key)."'")
#END
deleteSetting=$this->db->query("DELETE FROM ".DB_PREFIX."setting WHERE store_id = '".(int)$store_id."' AND `code` = '".$this->db->escape($code)."'")
#END
