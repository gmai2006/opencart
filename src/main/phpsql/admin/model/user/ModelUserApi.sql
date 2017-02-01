deleteApiSession=$this->db->query("DELETE FROM `".DB_PREFIX."api_session` WHERE api_session_id = '".(int)$api_session_id."'")
#END
editApi=$this->db->query("UPDATE `".DB_PREFIX."api` SET name = '".$this->db->escape($data['name'])."', `key` = '".$this->db->escape($data['key'])."', status = '".(int)$data['status']."', date_modified = NOW() WHERE api_id = '".(int)$api_id."'")
#END
addApiSession=$this->db->query("INSERT INTO `".DB_PREFIX."api_session` SET api_id = '".(int)$api_id."', token = '".$this->db->escape($data['token'])."', date_added = NOW(), date_modified = NOW()")
#END
getApiSessions=$this->db->query("SELECT * FROM `".DB_PREFIX."api_session` WHERE api_id = '".(int)$api_id."'")
#END
addApi=$this->db->query("INSERT INTO `".DB_PREFIX."api` SET name = '".$this->db->escape($data['name'])."', `key` = '".$this->db->escape($data['key'])."', status = '".(int)$data['status']."', date_added = NOW(), date_modified = NOW()")
#END
getApi=$this->db->query("SELECT * FROM `".DB_PREFIX."api` WHERE api_id = '".(int)$api_id."'")
#END
addApiIp=$this->db->query("INSERT INTO `".DB_PREFIX."api_ip` SET api_id = '".(int)$api_id."', ip = '".$this->db->escape($ip)."'")
#END
getApiIps=$this->db->query("SELECT * FROM `".DB_PREFIX."api_ip` WHERE api_id = '".(int)$api_id."'")
#END
deleteApi=$this->db->query("DELETE FROM `".DB_PREFIX."api` WHERE api_id = '".(int)$api_id."'")
#END
editApi1=$this->db->query("DELETE FROM ".DB_PREFIX."api_ip WHERE api_id = '".(int)$api_id."'")
#END
editApi2=$this->db->query("INSERT INTO `".DB_PREFIX."api_ip` SET api_id = '".(int)$api_id."', ip = '".$this->db->escape($ip)."'")
#END
addApi1=$this->db->query("INSERT INTO `".DB_PREFIX."api_ip` SET api_id = '".(int)$api_id."', ip = '".$this->db->escape($ip)."'")
#END
getTotalApis=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."api`")
#END
