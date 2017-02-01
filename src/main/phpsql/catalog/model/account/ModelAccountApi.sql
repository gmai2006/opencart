getApiIps=$this->db->query("SELECT * FROM `".DB_PREFIX."api_ip` WHERE api_id = '".(int)$api_id."'")
#END
addApiSession=$this->db->query("INSERT INTO `".DB_PREFIX."api_session` SET api_id = '".(int)$api_id."', token = '".$this->db->escape($token)."', session_id = '".$this->db->escape($session_id)."', ip = '".$this->db->escape($ip)."', date_added = NOW(), date_modified = NOW()")
#END
getApiByKey=$this->db->query("SELECT * FROM `".DB_PREFIX."api` WHERE `key` = '".$this->db->escape($key)."' AND status = '1'")
#END
