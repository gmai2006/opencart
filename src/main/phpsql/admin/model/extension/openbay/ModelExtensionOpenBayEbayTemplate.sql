add=$this->db->query("INSERT INTO `".DB_PREFIX."ebay_template` SET `name` = '".$this->db->escape($data['name'])."', `html` = '".$this->db->escape($data['html'])."'")
#END
getAll=$this->db->query("SELECT * FROM `".DB_PREFIX."ebay_template`")
#END
edit=$this->db->query("UPDATE `".DB_PREFIX."ebay_template` SET `name` = '".$this->db->escape($data['name'])."', `html` = '".$this->db->escape($data['html'])."' WHERE `template_id` = '".(int)$id."' LIMIT 1")
#END
get=$this->db->query("SELECT * FROM `".DB_PREFIX."ebay_template` WHERE `template_id` = '".(int)$id."' LIMIT 1")
#END
delete=$this->db->query("DELETE FROM `".DB_PREFIX."ebay_template` WHERE `template_id` = '".(int)$id."' LIMIT 1")
#END
