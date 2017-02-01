add=$this->db->query("INSERT INTO `".DB_PREFIX."ebay_profile` SET `name` = '".$this->db->escape($data['name'])."', `description` = '".$this->db->escape($data['description'])."', `type` = '".(int)$data['type']."', `default` = '".(int)$data['default']."', `data` = '".$this->db->escape(serialize($data['data']))."'")
#END
edit=$this->db->query("UPDATE `".DB_PREFIX."ebay_profile` SET `name` = '".$this->db->escape($data['name'])."', `description` = '".$this->db->escape($data['description'])."', `data` = '".$this->db->escape(serialize($data['data']))."', `default` = '".(int)$data['default']."' WHERE `ebay_profile_id` = '".(int)$id."' LIMIT 1")
#END
get=$this->db->query("SELECT * FROM `".DB_PREFIX."ebay_profile` WHERE `ebay_profile_id` = '".(int)$id."' LIMIT 1")
#END
getDefault=$this->db->query("SELECT `ebay_profile_id` FROM `".DB_PREFIX."ebay_profile` WHERE `type` = '".(int)$type."' AND `default` = '1'LIMIT 1")
#END
clearDefault=$this->db->query("UPDATE `".DB_PREFIX."ebay_profile` SET `default` = '0' WHERE `type` = '".(int)$type."'")
#END
delete=$this->db->query("DELETE FROM `".DB_PREFIX."ebay_profile` WHERE `ebay_profile_id` = '".(int)$id."' LIMIT 1")
#END
